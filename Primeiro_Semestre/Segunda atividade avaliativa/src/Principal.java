import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {

        Pokemon pokemon = null;
        String nome;
        Pokemon inimigo = null;
        String vilao = "Bowser"; 
        String tipoInimigo;
        String escolha;
        String tipo[]={"Fogo", "Agua", "Planta"};
        String acoes [] = {"Sim","Não"};
        String opcao;

         nome = JOptionPane.showInputDialog(null, "Insira o nome do seu pokemon",
         "AppPokemon", 3);
       
        escolha = (String) JOptionPane.showInputDialog(null, "Escolha o tipo do seu Pokemon",
        "AppPokemon", 3, null, tipo, tipo[0]);

        if(escolha.equals("Fogo")){
            pokemon = new TipoFogo(nome);
        }
        else if(escolha.equals("Agua")){
            pokemon = new TipoAgua(nome);
        }
        else if (escolha.equals( "Planta")){
            pokemon = new TipoPlanta(nome);
        }

        JOptionPane.showMessageDialog(null, "Seu pokemon"+"\n\n"+pokemon.dados());

        opcao = (String) JOptionPane.showInputDialog(null, "Você deseja lutar ? ",
        "AppPokemon", 3, null, acoes, acoes[0]);

        if(opcao.equals("Sim")){   
        tipoInimigo = (String) JOptionPane.showInputDialog(null, "Escolha o tipo do seu inimigo",
        "AppPokemon", 3, null, tipo, tipo[0]);

            if(tipoInimigo.equals("Fogo")){
                inimigo = new TipoFogo(vilao);
            }
            else if(tipoInimigo.equals("Agua")){
                inimigo = new TipoAgua(vilao);
            }
            else if (tipoInimigo.equals("Planta")){
                inimigo = new TipoPlanta(vilao);
            }

            JOptionPane.showMessageDialog(null, "Pokemon inimigo"+ "\n\n"+inimigo.dados());

            if(pokemon.ataque() > (2*inimigo.vida())){
                JOptionPane.showMessageDialog(null,"Seu pokemon ganhou !","AppPokemon 1.0",1);
            } else {
                JOptionPane.showMessageDialog(null,"Seu pokemon perdeu !","AppPokemon 1.0",1);
            }
        }else{
            System.exit(0);
        }
    }
}