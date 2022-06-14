import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro número", 
                    "AppNúmeros", 3));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo número", 
        "AppNúmeros", 3));

        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o terceiro número", 
        "AppNúmeros", 3));

        Numeros obj;
        obj = new Numeros(num1, num2, num3);

        JOptionPane.showMessageDialog(null, "Maior número: "+obj.maior()+"\nMenor número: "+obj.menor()+
                    obj.ordemCrescente()+ obj.verifica(), "AppNúmeros", 3);  
    }
}
