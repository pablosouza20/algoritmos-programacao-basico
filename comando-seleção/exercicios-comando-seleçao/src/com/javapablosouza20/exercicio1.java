// 1 - Escreva um programa que leia um valor numérico do teclado entre zero e cinco e escreva-o no terminal na
//forma literal EX: 5 -> Cinco.

package com.javapablosouza20;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner numRecebido = new Scanner(System.in);

        int num;

        System.out.println(" Digite o número: ");
        num = numRecebido.nextInt();

        switch (num) {
            case 1:
                System.out.println(" Um ");
                break;

            case 2:
                System.out.println(" dois ");
                break;

            case 3:
                System.out.println(" três ");
                break;

            case 4:
                System.out.println(" quatro ");
                break;

            case 5:
                System.out.println(" cinco ");
                break;
            default:
                System.out.println(" Número inválido ");
        }
    }
}
