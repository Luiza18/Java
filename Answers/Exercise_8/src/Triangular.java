public class Triangular {
    private int num;
    
    public Triangular(int num){
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String numTriangulo(){
        int num1 = 1;
        int p = num1 * (num1 + 1) * (num1 +2);

        while(p < num){
            num1 ++;
            p = num1 * (num1 + 1) * (num1 +2);
        }
        if(num == p){
            return "O número é triangular "+ num+" : "+ num1+" * "+(num1+1)+" * "+(num1+2);
        }else{
                return "O número não é triangular";  
        }
    }
}
