package br.com.meli.models;

import br.com.meli.Funcionario;
import br.com.meli.PagarSalario;

public class Diretor extends Funcionario implements PagarSalario {

    public Diretor() {

    }


    public Diretor (Long id, String nome, Integer identificacao) {
        super(id, nome, identificacao, 15000f, 0.3f, 0, false);
    }


    @Override
    public void pagarSalario() {
        Float salario = this.getSalario() * (1 + this.getBonificacao());
        System.out.println("----- Salario ----------");
        System.out.println("Nome : " + this.getNome());
        System.out.println("Cargo: Diretor");
        System.out.println("Identificacao: " + this.getIdentificacao());
        System.out.println("Horas semanais: " + (this.getHoras_semanais() > 0 ? this.getHoras_semanais() : "Nao definido"));
        System.out.println("SALARIO : " + salario);
        
    }
    
}
