package edu.ucan.expresssoes_lambda;

public class ExemploLambdaRunnable {
    public static void main(String[] args) {

        Runnable tarefa = () -> System.out.println("Executando uma tarefa em uma thread!");

        Thread thread = new Thread(tarefa);
        thread.start();
    }
}
