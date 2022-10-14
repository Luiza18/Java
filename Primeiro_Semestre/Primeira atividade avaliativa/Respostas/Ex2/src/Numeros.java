public class Numeros {
    private int num1;
    private int num2;
    private int num3;

    public Numeros (int num1, int num2, int num3){
        num1 = this.num1;
        num2 = this.num2;
        num3 = this.num3;
    }

    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public int getNum3() {
        return num3;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int maior(){
        if(num1 > num2 && num1> num3){
            return num1;
        }
        else if(num2 > num1 && num2 > num3){
            return num2;
        }
        else(num3 > num1 && num3 > num2){
            return num3;
        }
    }

    public int menor(){
        if(num1 < num2 && num1 <num3){
            return num1;
        }
        else if (num2 < num1 && num2 < num3){
            return num2;
        }
        else(num3 < num1 && num3 <num2){
            return num3;
        }
    }

    public String ordemCrescente(){
        int maior = maior();
        int menor = menor();

        if(num1 =! maior && num1 != menor){
            return "Ordem crescente dos números: "+maior+" "+num1+ " "menor;
        }
        else if (num2=! maior && num2!= menor){
            return "Ordem crescente dos números: "+maior+" "+num2+ " "menor;
        }
        else(num3=! maior && num3!= menor){
            return "Ordem crescente dos números: "+maior+" "+num3+ " "menor;
        }
    }

    public String verifica(){
        if(num1%2 = 0 && num2%2 = 0 && num3%2 = 0){
            return "Todos os números são pares: "+ num1+num2+num3;
        }
        else if (num1%2 != 0 && num2%2 != 0){
            return "Existem dois números ìmpares: "+ num1*num2*num3;
        }
        else if(num1%2 != 0 && num3%2 != 0){
            return  "Existem dois números ìmpares: "+ num1*num2*num3;
        }
        else(num2%2 != 0 && num3%2 !=0 ){
            "Existem dois números ìmpares: "+ num1*num2*num3;
        }
    }
}
