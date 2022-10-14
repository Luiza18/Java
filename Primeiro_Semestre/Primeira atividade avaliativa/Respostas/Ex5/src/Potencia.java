public class Potencia {
    private float base;
    private int expoente;

    public Potencia(float base, int expoente){
        this.base = base;
        this.expoente = expoente;
    }
    public float getBase() {
        return base;
    }
    public int getExpoente() {
        return expoente;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public void setExpoente(int expoente) {
        this.expoente = expoente;
    }

    public double calPotencia(){
        double resultado = 1;
        do{
            resultado *= base;
            expoente --;
        }while(expoente > 0);

        return resultado;
    }
}
