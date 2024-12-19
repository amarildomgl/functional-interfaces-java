package edu.ucan.interfaces_funcionais;

import java.util.function.BiConsumer;

public class ExemploBiConsumer {
    public static void main(String[] args) {
        BiConsumer<String, Integer> consumidorBi = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String nome, Integer idade) {
                System.out.println(nome + " tem " + idade + " anos.");
            }
        };
        consumidorBi.accept("Amarildo", 30);
    }
}
