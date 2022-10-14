public abstract class  Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;

    public Pessoa (String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String  nomeCompleto(){
        return nome +" "+sobrenome;
    }

    public String dados(){
        return nomeCompleto() +"\nCPF: "+ cpf;
    }
}