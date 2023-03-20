/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

package edu.vinicius.primeirasemana;

import java.util.Scanner;

public class Ex2Notas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nota;

        System.out.println("Insira uma nota, de zero a dez: ");
        nota = scan.nextFloat();

        while (nota > 10 | nota < 0) {
            System.out.println("Numero invalido, tente novamente: ");
            nota = scan.nextFloat();
        }
        if (nota >= 0 && nota <= 10)
            System.out.println("Nota validada.");
    }
}
