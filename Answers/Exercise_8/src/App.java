import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        Triangular obj;

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", 
                "AppTriangular",3));

        obj = new Triangular(num);

        JOptionPane.showMessageDialog(null, obj.numTriangulo());
    }
}
