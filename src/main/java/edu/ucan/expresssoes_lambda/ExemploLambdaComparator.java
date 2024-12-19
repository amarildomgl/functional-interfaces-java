package edu.ucan.expresssoes_lambda;

import java.util.Arrays;
import java.util.List;

public class ExemploLambdaComparator {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Maria", "João", "Ana", "Pedro");

        // Ordenando em ordem decrescente usando lambda
        nomes.sort((a, b) -> b.compareTo(a));

        System.out.println(nomes);
    }
}
