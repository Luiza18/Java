public class Atleta {
    protected String nome;
    protected float peso;

    public Atleta (String nome, float peso){
        this.nome = nome;
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }
    public float getPeso() {
        return peso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String defineCategoria(){
        if(peso <=50){
            return "Infantil";
        }

        else if(peso > 50){
            return "Juvenil";
        }
        else{
            return "Adulto";
        }
    }
}
