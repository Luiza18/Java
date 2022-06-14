public class Impares {
    private int menor;
    private int maior;

    public Impares (int menor, int maior){
        this.maior = maior;
        this.menor = menor;
    }

    public int getMaior() {
        return maior;
    }
    public void setMaior(int maior) {
        this.maior = maior;
    }
    public int getMenor() {
        return menor;
    }
    public void setMenor(int menor) {
        this.menor = menor;
    }

    public int multiplicacaoImpares(){
        int resultado = 1;

        if(menor % 2 == 0){
            menor += 1;
        } 
        
        for(int i =menor; i < maior; i+= 2){
            resultado *= i;
        }

        return resultado;
    }
}
