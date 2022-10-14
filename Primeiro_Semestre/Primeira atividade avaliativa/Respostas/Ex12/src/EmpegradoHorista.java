public class EmpegradoHorista extends Empregado{

    private int horasTrab;
    private int valorHorasTrab;

    public EmpegradoHorista(String nome, String sobrenome, String cpf, String matricula, int horasTrab, int valorHorasTrab){
        super(nome, sobrenome, cpf, matricula);
        this.horasTrab = horasTrab;
       this.valorHorasTrab = valorHorasTrab;
    }


    public int getHorasTrab() {
        return horasTrab;
    }
    public int getValorHorasTrab() {
        return valorHorasTrab;
    }
    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }
    public void setValorHorasTrab(int valorHorasTrab) {
        this.valorHorasTrab = valorHorasTrab;
    }

    @Override
    protected void calculaSalario() {
        double salario = horasTrab * valorHorasTrab;
        super.setSalario(salario);
    }

    public String dados(){
        calculaSalario();

        return super.dados();
    }
    
}
