/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

package edu.vinicius.primeirasemana;

import java.util.Scanner;

public class Ex3MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // abertura da entrada pra fluxo de dados atraves do teclado

        double maior = 0; // guarda o maior número.
        double media;
        double soma = 0;
        int i = 0; // loop

        do {
            System.out.println("Insira o número: ");
            double numero = scan.nextDouble();

            if (numero > maior) {
                maior = numero; // se o numero atual (zero) for maior que o numero maior atual, isso irá
                                // substitui-lo.
            }
            soma += numero; // soma o numero à soma atual.
            i += 1;

        } while (i < 5);
        media = soma / 5;

        System.out.println("Maior número: " + maior + "\n1Média: " + media);
    }
}
