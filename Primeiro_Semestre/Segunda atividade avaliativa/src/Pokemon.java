import java.util.Random;

public abstract class Pokemon {
    private String nome;

    public Pokemon (String nome){
        this.nome = nome;
    }

    public abstract int vida();
    public abstract int ataque();

    public  String raca(String [] tipos){
        Random rand = new Random();
        int posicao;
        String raca;
        
        posicao = rand.nextInt(tipos.length);
        raca = tipos[posicao];

        return raca;
    }
   
    
    public int determinaLvl(){
        Random rand = new Random();
        int lvl = 1;
        lvl += rand.nextInt(30);
        return lvl;
    }

    public String dados(){
        return "Nome: " + nome;
    }

}
