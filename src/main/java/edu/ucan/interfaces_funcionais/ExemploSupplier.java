package edu.ucan.interfaces_funcionais;

import java.util.function.Supplier;

public class ExemploSupplier {
    public static void main(String[] args) {
        Supplier<String> fornecedor = new Supplier<String>() {
            @Override
            public String get() {
                return "Mensagem gerada pelo Supplier!";
            }
        };
        System.out.println(fornecedor.get());
    }
}
