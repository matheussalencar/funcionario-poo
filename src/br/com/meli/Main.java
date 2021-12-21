package br.com.meli;

import br.com.meli.models.Analista;
import br.com.meli.models.Diretor;
import br.com.meli.models.Gerente;
import br.com.meli.models.Tecnico;

public class Main {

    public static void main(String[] args) {

        Tecnico tecnico2 = new Tecnico(4L, "Tecnico com salario default", 22123, 1);

        Analista analista2 = new Analista(2L, "Analista Default", 22311, 1);

        Gerente gerente2 = new Gerente(3L, "Gerente Default", 23233, 2 );

        Diretor diretor = new Diretor(4L, "CEO", 23322);


        System.out.println(analista2.toString());

        System.out.println(tecnico2.toString());

        System.out.println(gerente2.toString());

        System.out.println(diretor.toString());


        tecnico2.pagarSalario();

        analista2.pagarSalario();

        gerente2.pagarSalario();

        diretor.pagarSalario();
    }
}
