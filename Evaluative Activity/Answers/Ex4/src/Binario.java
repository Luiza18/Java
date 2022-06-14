public class Binario {
    private int num;

    public Binario(int num){
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String transforma(){
        String binario = "";
        int divisor = num;
        while(divisor!=0){
           binario += divisor %2;
           divisor = divisor / 2;
        }
        StringBuilder invertido = new StringBuilder(binario).reverse();
        return num+ ": "+ invertido;
    }
}
