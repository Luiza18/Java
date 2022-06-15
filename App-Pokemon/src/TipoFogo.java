
public class TipoFogo extends Pokemon {
    
    public TipoFogo(String nome){
        super(nome);
    }

    int lvl = super.determinaLvl();
    private String [] tipos = {"Charmander", "Cyndaquil", "Chimchar"};

    @Override
    public int vida(){
        int hp = lvl * 10;
        return hp;
    }

    @Override
    public int ataque(){
        int ataque = lvl * 3;
        return ataque;
    }

    @Override
    public String raca(String [] tipos) {
        return super.raca(tipos);
    }

    @Override
    public String dados(){
        return super.dados()+"\nTipo: Fogo"+ "\nRaça: "+raca(tipos) + "\nVida Total: "
         + vida() + "\nDano de ataque: " + ataque();
    }
}