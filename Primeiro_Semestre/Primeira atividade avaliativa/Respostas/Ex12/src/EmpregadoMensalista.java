public class EmpregadoMensalista extends Empregado {
       String cargo;
    
    public EmpregadoMensalista(String nome, String sobrenome, String cpf, String matricula, String cargo){
        super(nome, sobrenome, cpf, matricula);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    protected void calculaSalario() {
        double salario; 
        switch(cargo){
            case "Estagiário":  salario = 1500;
                                super.setSalario(salario);
                            break;
            case "Desenvolvedor junior": salario = 3000;
                                        super.setSalario(salario);
                            break;
            case "Desenvolvedor pleno": salario = 7000;
                                        super.setSalario(salario);
                            break;
            case "Desenvolvedor sênior": salario = 15000;
                                        super.setSalario(salario);
                            break;
        }
    }

    public String dados(){
        calculaSalario();

        return super.dados();
    }
    
}
