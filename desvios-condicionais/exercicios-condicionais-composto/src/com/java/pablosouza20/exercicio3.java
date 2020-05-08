//3- Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200.
package com.java.pablosouza20;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner numeroRecebido = new Scanner(System.in);

        int num;

        System.out.println(" Digite o número:  ");
        num = numeroRecebido.nextInt();


        if (num >= 100 && num <= 200) {
            System.out.println(" Está no intervalo ! ");
        } else {
            System.out.println(" Não está no intervalo !");
        }
    }
}
