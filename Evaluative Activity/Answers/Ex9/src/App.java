import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        Elevador obj;
        int opcUsr;
     
       int capacidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número máximo de"+
       " pessoas", "AppElevador", 3));

       int totalAndares = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o total de "+
        "andares", "AppElevador", 3));

        obj = new Elevador (totalAndares, capacidade);
  
        do{
            opcUsr = Integer.parseInt(JOptionPane.showInputDialog(null, "1-Entrar no elevador"+
            "\n2-Sair do elevador"+"\n3-Subir no elevador"+"\n4-Descer do elevador"+
            "\n5-Informações do elevador"+"\n6-Fechar programa", "AppElevador", 3));

            switch(opcUsr){
                case 1: int entrada = Integer.parseInt(JOptionPane.showInputDialog(null,
                         "Digite o número de pessoas",  "AppElevador", 3));
                         JOptionPane.showMessageDialog(null, obj.entra(entrada));
                    break;
                case 2: int saida = Integer.parseInt(JOptionPane.showInputDialog(null,
                         "Digite o número de pessoas saindo", "AppElevador", 3));
                         JOptionPane.showMessageDialog(null, obj.sai(saida));
                    break;
                case 3: int subida = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite quanto andares deseje subir", "AppElevador", 3));
                        JOptionPane.showMessageDialog(null, obj.sobe(subida));
                    break;
                case 4: int descida = Integer.parseInt(JOptionPane.showInputDialog(null,
                         "Digite quantos andares deseje descer", "AppElevador", 3));
                         JOptionPane.showMessageDialog(null, obj.desce(descida));
                    break;
                case 5: JOptionPane.showMessageDialog(null, obj.informacoes());
                    break;       
            }
        }while(opcUsr != 6);
        System.exit(0);
        
    }
}
