import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, 
        "Insira o número referente a A", "App Equação 2o Grau", 3));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, 
        "Insira o número referente a B", "App Equação 2o Grau", 3));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número referente a C",
         "App Equação 2o Grau", 3));

         Equacao2Grau obj;
         obj = new Equacao2Grau(a,b,c);

         JOptionPane.showMessageDialog(null, "Dados da equação: \nDelta: "
         +obj.calculaDelta()+"\n"+obj.raizes(), "App Equação 2o Grau", 3);
    }
}
