/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
package edu.vinicius.primeirasemana;

import java.util.Scanner;

public class Ex5ArrayInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = { 1, 2, -3, 42, 23, 0 };
        int i = 0;

        System.out.println("Vetor: ");

        while (i < (vetor.length)) {
            System.out.println(vetor[i] + " ");
            i++;
        }
        System.out.println("Vetor inverso: ");

        for (i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + "  ");

        }
    }
}