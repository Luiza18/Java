public class Lutador extends Atleta {
    public Lutador(String nome, float peso){
        super(nome, peso);
    }

    @Override
    public String defineCategoria(){
      if(super.defineCategoria() == "Infantil" || peso <=54){
          return "Pluma";
      }
      else if (super.defineCategoria() == "Juvenil" || peso > 60){
          return "Leve";
      }
      else if  (super.defineCategoria() == "Adulto"){
          if(peso <= 75){
              return "Meio leve";
          }
      }
      return "Pesado";
    }
}
