package edu.ucan.interfaces_funcionais;

import java.util.function.Consumer;

public class ExemploConsumer {
    public static void main(String[] args) {
        Consumer<String> consumidor = new Consumer<String>() {
            @Override
            public void accept(String mensagem) {
                System.out.println("Consumindo: " + mensagem);
            }
        };
        consumidor.accept("Aprendendo Java!");
    }
}
