package edu.ucan.interfaces_funcionais;

import java.util.function.Predicate;

public class ExemploPredicate {
    public static void main(String[] args) {
        Predicate<Integer> maiorQueDez = new Predicate<Integer>() {
            @Override
            public boolean test(Integer numero) {
                return numero > 10;
            }
        };
        System.out.println("15 é maior que 10? " + maiorQueDez.test(15));
        System.out.println("8 é maior que 10? " + maiorQueDez.test(8));
    }
}
