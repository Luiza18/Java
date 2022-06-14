import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        
        String [] opcoes = {"Atleta", "Lutador", "Sair"};
        String opcUsr;
        Atleta atleta;

        String nome = JOptionPane.showInputDialog(null, "Digite seu nome",
            "AppJava",3);
         float peso = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite seu peso", 
            "AppJava", 3));

        do{
            
            opcUsr = (String) JOptionPane.showInputDialog(null, "Escolha a opção","AppJava", 3,
            null, opcoes, opcoes[0]);

            switch(opcUsr){
                case "Atleta":  atleta = new Atleta(nome, peso);
                                JOptionPane.showMessageDialog(null, "Categoria: "+ atleta.defineCategoria());
                                break;

                case "Lutador": atleta = new Lutador(nome, peso);
                                JOptionPane.showMessageDialog(null, "Categoria: "+ atleta.defineCategoria());
                                break;
            }

        }while(opcUsr != opcoes[2]);
        System.exit(0);
    }
}
