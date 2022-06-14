public class Equacao2Grau {
    private int a,b,c;

    public Equacao2Grau(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

    public float calculaDelta(){
        return (float) (Math.pow(b, 2)) - (4*a*c);
    }

    public String raizes(){
        float delta = calculaDelta();
        float x1 = (-b + delta) / (2*a);
        float x2 = (-b - delta) / (2*a);

        if (delta > 0) {
            return "Há duas raízes reais diferentes, de valores y' "+x1+" e y'' "+x2;
        } else if (delta == 0) {
            return "Há duas raízes iguais, de valor y = "+x1;
        } else {
            return "Não há raízes";
        }
    }
}
