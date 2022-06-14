public class Elevador {
    private int andarAtual =0;
    private  int capcidade, numEntrando, 
    numSaindo, totalAndares, numAtual, andar;

    public Elevador(int  totalAndares, int capacidade){
        this.totalAndares = totalAndares;
        this.capcidade = capacidade;
    }
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getCapcidade() {
        return capcidade;
    }
    public void setCapcidade(int capcidade) {
        this.capcidade = capcidade;
    }
    public int getTotalAndares() {
        return totalAndares;
    }
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }
    public int getNumEntrando() {
        return numEntrando;
    }
    public void setNumEntrando(int numEntrando) {
        this.numEntrando = numEntrando;
    }
    public int getNumSaindo() {
        return numSaindo;
    }
    public void setNumSaindo(int numSaindo) {
        this.numSaindo = numSaindo;
    }
    public int getNumAtual() {
        return numAtual;
    }
    public void setNumAtual(int numAtual) {
        this.numAtual = numAtual;
    }
    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }

    public String  entra(int numEntrando){
        if(numEntrando <= capcidade){
            numAtual+= numEntrando;
            return "Número de pessoas entrando: "+ numEntrando;
        }
        return "Número de pessoas acima do limite!";
    }

    public String sai(int numSaida){
        if(numAtual > 0 && numSaida <=numEntrando){
            numAtual -= numSaida;
            return "Número de pessoas saindo: "+ numAtual;
        }
        return "ERRO!";
    }

    public String  sobe(int andar){
        if(andar < totalAndares){
            andarAtual += andar;
            return "Subindo para o andar: "+ andar;
        }
        return "Andar maior que o total de andares";
    }

    public String  desce(int andar){
        if(andar >= 0){
            andarAtual -= andar;
            return "Descendo para o andar: "+ andar;
        }
        return "Impossível descer mais";
    }

    public String informacoes(){
        return "Número de pessoas: "+ numAtual+ "\nCapacidade máxima: "+ capcidade+"\nAndar atual: "+ andarAtual+ 
        "\nTotal de andares: "+ totalAndares;
    }

}  


    