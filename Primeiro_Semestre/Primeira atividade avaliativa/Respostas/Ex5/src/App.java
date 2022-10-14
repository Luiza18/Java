import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        Potencia obj;

        float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do número",
        "AppPotência", 3));

        int expoente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o expoente",
        "AppPotência", 3));

        obj = new Potencia(base, expoente);

        JOptionPane.showMessageDialog(null,"Resultado: "+ obj.calPotencia());
    }
}
