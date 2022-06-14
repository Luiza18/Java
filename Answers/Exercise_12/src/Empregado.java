public  abstract class Empregado extends Pessoa {
    protected String matricula;
    protected double salario;

    public Empregado(String nome, String sobrenome, String cpf, String matricula) {
        super(nome, sobrenome, cpf);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    protected abstract void calculaSalario();

    public double calculaInss(double salario){
        if (salario <= 1212) {
            return salario * 0.08;
        } else if (salario <= 2427.35) {
            return salario * 0.09;
        } else if (salario <= 3641.03) {
            return salario * 0.12;
        } else if (salario <= 7087.22){
            return salario * 0.14;
        }else if (salario <= 12136.79){
            return salario * 0.145;
        }else{
            return 12136.79 * 0.145;
        }
    }

    public double calculaIr(double salario){
        if (salario <= 1566.61) {
            return 0;
        } else if (salario <= 2347.85) {
            return salario * 7.5 / 100;
        } else if (salario <= 3130.51) {
            return salario * 0.15;
        } else if (salario <= 3911.63) {
            return salario * 22.5 / 100;
        } else {
            return salario * 27.5 / 100;
        }
    }

    public double salarioLiquido(double salario){
        return salario - (calculaInss(salario) + calculaIr(salario));
    }

    public String dados(){
        return super.dados() + "\nSalário: "+ getSalario() + "\nMatrícula: " + getMatricula()+
        "\nINSS: "+ calculaInss(salario)+ "\nImposto de renda: "+ calculaIr(salario) + "\nSalário Líquido: "+
        salarioLiquido(salario);
    }
}
