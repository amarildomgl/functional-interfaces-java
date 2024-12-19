package edu.ucan.expresssoes_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploDiferencas {

    public static void main(String[] args) {
        // Criar uma lista de strings
        List<String> nomes = new ArrayList<>();
        nomes.add("Célsia");
        nomes.add("Batman");
        nomes.add("Zebedeu");
        nomes.add("Aires");
        nomes.add("Amarildo");


        // Ordenar usando expressão lambda
        nomes.sort((nome1, nome2) -> nome1.compareTo(nome2));
        System.out.println("Lista ordenada: " + nomes);



        // Ordenar usando classe anônima
        Collections.sort(nomes, new java.util.Comparator<String>() {
            @Override
            public int compare(String nome1, String nome2) {
                return nome1.compareTo(nome2); // Ordenação alfabética
            }
        });

        // Exibir a lista ordenada
        System.out.println("Lista ordenada sem lambdas: " + nomes);
    }
}
