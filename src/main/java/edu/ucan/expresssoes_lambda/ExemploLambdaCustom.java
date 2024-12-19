package edu.ucan.expresssoes_lambda;


import edu.ucan.expresssoes_lambda.interfaces.Saudacao;

public class ExemploLambdaCustom {
    public static void main(String[] args) {

        Saudacao saudacao = mensagem -> System.out.println("Olá, " + mensagem);

        saudacao.saudar("Mundo!");
    }
}
