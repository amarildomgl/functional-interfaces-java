package edu.ucan.interfaces_funcionais;

import java.util.function.Function;

public class ExemploFunction {
    public static void main(String[] args) {
        Function<Integer, String> conversor = new Function<Integer, String>() {
            @Override
            public String apply(Integer numero) {
                return "Número: " + numero;
            }
        };
        System.out.println(conversor.apply(10));
    }
}
