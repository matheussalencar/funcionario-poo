package br.com.meli.models;

import br.com.meli.Funcionario;
import br.com.meli.PagarSalario;

public class Tecnico extends Funcionario implements PagarSalario {
    private Integer metas_batidas;
    public Tecnico(Long id, String nome, Integer identificacao, Float salario, Float bonificacao, Integer horas_semanais, Boolean descanso_semana, Integer metas_batidas) {
        super(id, nome, identificacao, salario, bonificacao, horas_semanais, descanso_semana);
        this.metas_batidas = metas_batidas;
    }

    public Tecnico(Long id, String nome, Integer identificacao, Integer metas_batidas) {
        super(id, nome, identificacao, 2000f, 0.5f, 40, false);
        this.metas_batidas = metas_batidas;
    }

    public Integer getMetas_batidas() {
        return metas_batidas;
    }

    public void setMetas_batidas(Integer metas_batidas) {
        this.metas_batidas = metas_batidas;
    }

    @Override
    public void pagarSalario() {
        Float salario = this.getSalario() * (1 + (this.getMetas_batidas() *  this.getBonificacao()));
        System.out.println("----- Salario ----------");
        System.out.println("Nome : " + this.getNome());
        System.out.println("Cargo: Tecnico");
        System.out.println("Metas Batidas: " + this.getMetas_batidas());
        System.out.println("Identificacao: " + this.getIdentificacao());
        System.out.println("Horas semanais: " + this.getHoras_semanais());
        System.out.println("SALARIO : " + salario);
    }
}
