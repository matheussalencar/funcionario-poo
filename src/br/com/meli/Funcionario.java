package br.com.meli;


public  class Funcionario {
    protected Long id;
    protected String nome;
    protected Integer identificacao;
    protected Float salario;
    protected Float bonificacao;
    protected Integer horas_semanais ;
    protected Boolean descanso_semana;

    public Funcionario(Long id, String nome, Integer identificacao, Float salario, Float bonificacao, Integer horas_semanais, Boolean descanso_semana) {
        this.id = id;
        this.nome = nome;
        this.identificacao = identificacao;
        this.salario = salario;
        this.bonificacao = bonificacao;
        this.horas_semanais = horas_semanais;
        this.descanso_semana = descanso_semana;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", identificacao=" + identificacao +
                ", salario=" + salario +
                ", bonificacao=" + bonificacao +
                ", horas_semanais=" + horas_semanais +
                ", descanso_semana=" + descanso_semana +
                '}';
    }

    public Funcionario() {
    }


    public Float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Float bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Integer getHoras_semanais() {
        return horas_semanais;
    }

    public void setHoras_semanais(Integer horas_semanais) {
        this.horas_semanais = horas_semanais;
    }

    public Boolean getDescanso_semana() {
        return descanso_semana;
    }

    public void setDescanso_semana(Boolean descanso_semana) {
        this.descanso_semana = descanso_semana;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(Integer identificacao) {
        this.identificacao = identificacao;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
