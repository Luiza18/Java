import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args)  {
        
        String nome = JOptionPane.showInputDialog(null, "Informe seu nome", 
        "AppJava", 3);
        String sobrenome =  JOptionPane.showInputDialog(null, "Informe seu sobrenome", 
        "AppJava", 3);
        String matricula = JOptionPane.showInputDialog(null, "Informe sua matrícula", 
        "AppJava", 3);
        String cpf =  JOptionPane.showInputDialog(null, "Informe seu CPF", 
        "AppJava", 3);

        String [] opcao = {"Empregado horista","Empregado mensalista", "Sair"};
        String opcUsr;
        String [] cargos = {"Estagiário","Desenvolvedor junior","Desenvolvedor pleno","Desenvolvedor sênior"};
        String cargo;

        do{

        opcUsr = (String) JOptionPane.showInputDialog(null,
         "Escolha a opção desejada", "AppJava",3,null,opcao, opcao[0]);

            switch(opcUsr){

            case "Empregado horista": int horas = Integer.parseInt( JOptionPane.showInputDialog(null,
                                    "Digite horas trabalhada","AppJava", 3));
                                    int valor = Integer.parseInt( JOptionPane.showInputDialog(null,
                                    "Digite o valor horas trabalhada","AppJava", 3));

                                    Empregado horista;
                                    horista = new EmpegradoHorista(nome, sobrenome, cpf, matricula, horas, valor);
                                    JOptionPane.showMessageDialog(null, horista.dados());
                            break;
            case "Empregado mensalista": 
                                cargo = (String) JOptionPane.showInputDialog(null,
                                "Escolha seu crago", "AppJava",
                                3,null,cargos, cargos[0]); 

                                Empregado mensalista;
                                mensalista = new EmpregadoMensalista(nome, sobrenome, cpf, matricula, cargo);  
                                JOptionPane.showMessageDialog(null, mensalista.dados());

            }
        }while(opcUsr != opcao[2]);
    }
}
