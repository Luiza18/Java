import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        Fibonacci obj;

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", 
        "AppFibonacci", 3));

        obj = new Fibonacci(num);  

        JOptionPane.showMessageDialog(null, obj.procura());
    }
}
