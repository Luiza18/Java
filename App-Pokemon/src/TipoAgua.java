
public class TipoAgua extends Pokemon {

    public TipoAgua(String nome){
        super(nome);
    }

    private int lvl = super.determinaLvl();
    private String [] tipos = {"Squirtle","Totodile", "Mudkip"};

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
        return super.dados()+"\nTipo: Agua"+"\nRaça: "+ raca(tipos)+ "\nVida Total: " + vida()
         + "\nDano de ataque: " + ataque();
    }
   
}