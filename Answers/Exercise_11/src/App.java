import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
      
        String nome = JOptionPane.showInputDialog(null, 
        "Informe seu  nome", "AppJava", 3);
        String sobrenome =JOptionPane.showInputDialog(null, 
        "Informe seu sobrenome", "AppJava", 3);
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, 
        "Informe sua idade", "AppJava", 3));
        
      Pessoa pessoa;
      
       
      int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
       "Você é atleta ? \n1 - Sim \nNão", "AppJava", 3));

       if(escolha == 1){
         float peso = Float.parseFloat(JOptionPane.showInputDialog(null, 
        "Informe seu peso", "AppJava", 3));
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, 
        "Informe sua altura", "AppJava", 3));

        pessoa = new Atleta(nome, sobrenome, idade, altura, peso);

        JOptionPane.showMessageDialog(null, pessoa.toString());
       }

       else if(escolha == 2){
        pessoa = new Pessoa(nome, sobrenome, idade);
        JOptionPane.showMessageDialog(null, pessoa.toString());
       }

       else{
           JOptionPane.showMessageDialog(null, "Opção inválida");
       }
      
    }
}
