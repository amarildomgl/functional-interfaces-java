package edu.ucan.expresssoes_lambda;

import edu.ucan.expresssoes_lambda.interfaces.Seminarios;

public class ExemploSeminarios {



    public static void main(String[] args) {
        Seminarios seminario =
                (tema) -> System.out.println("Apresentando o seminário sobre " + tema);

        seminario.apresentar("Interfaces Funcionais");

        seminario.apresentar("Expressões Lambda");


    }
}
