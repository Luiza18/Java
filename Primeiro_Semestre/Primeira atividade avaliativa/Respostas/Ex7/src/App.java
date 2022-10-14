import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        Impares obj;

        int inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero incial",
            "AppImpares", 3));

        int ultimo =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero final",
        "AppImpares", 3));

        obj = new Impares(inicio, ultimo);

        JOptionPane.showMessageDialog(null, obj.multiplicacaoImpares());
    }
}
