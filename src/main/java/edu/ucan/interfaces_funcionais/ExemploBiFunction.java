package edu.ucan.interfaces_funcionais;

import java.util.function.BiFunction;

public class ExemploBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> somador = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };
        System.out.println("Resultado da soma: " + somador.apply(5, 3));
    }
}
