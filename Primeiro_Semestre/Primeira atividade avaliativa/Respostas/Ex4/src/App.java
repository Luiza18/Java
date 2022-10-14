import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        Binario obj;

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número",
        "AppBinario", 3));

        obj = new Binario(num);

        JOptionPane.showMessageDialog(null, obj.transforma());
    }
}
