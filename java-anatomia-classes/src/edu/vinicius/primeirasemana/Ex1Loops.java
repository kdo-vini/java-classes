/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/
package edu.vinicius.primeirasemana;

import java.util.Scanner;

public class Ex1Loops {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0"))
                break;

            System.out.println("idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Continua aqui...");
    }
}
