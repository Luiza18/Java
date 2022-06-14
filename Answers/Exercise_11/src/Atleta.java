public class Atleta extends Pessoa {
    private float altura;
    private float peso;

    public Atleta(String nome, String sobrenome, int idade, float altura, float peso){
        super(nome, sobrenome, idade);
        this.altura = altura;
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double imc(){
        return (peso) / Math.pow(altura, 2);
    }

    @Override
    public String toString() {
        if(imc() < 17){
            return super.nomeCompleto() + "\nIdade: "+ super.getIdade()
            + "\nPeso: "+ peso+ "Kg"+"\nAltura: " + altura +"m" +"\nMuito abixo do peso";
        }
        else if(imc() < 18.49){
            return super.toString() + "\nPeso: "+ peso+ "Kg"+"\nAltura: " + altura +"m" +  "\nAbaixo do peso";
        }
        else if(imc() < 24.99){
            return super.toString() + "\nPeso: "+ peso+ "Kg"+"\nAltura: " + altura +"m" + "\nPeso normal";
        }
        else if(imc() < 29.99){
            return super.toString()+ "\nPeso: "+ peso+ "Kg"+"\nAltura: " + altura +"m" + "\nAcima do peso";
        }
        else if(imc() < 34.99){
            return super.toString()+ "\nPeso: "+ peso+ "Kg"+"\nAltura: " + altura +"m" + "\nObesidade I";
        }
        else if (imc() < 39.99){
            return super.toString() + "\nPeso: "+ peso+ "Kg"+"\nAltura: " + altura +"m" + "\nObesidade II";
        }
        
        return super.toString() + "\nPeso: "+ peso+ "Kg"+"\nAltura: " + altura +"m" + "\nObesidade II";
        
    }

   
}
