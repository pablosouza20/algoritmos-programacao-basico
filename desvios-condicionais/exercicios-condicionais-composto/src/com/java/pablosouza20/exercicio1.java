//1 - Faça um programa que leia dois números A e B e imprima o maior deles.
package com.java.pablosouza20;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner numeroRecebido = new Scanner(System.in);

        int a;
        int b;

        System.out.println(" Digite o valor de A: ");
        a = numeroRecebido.nextInt();


        System.out.println(" Digite o valor de B: ");
        b = numeroRecebido.nextInt();

        if (a > b) {
            System.out.println(" A é maior" + a);
        } else if (b > a){
            System.out.println(" B é maior" + b);
        } else{
            System.out.println(" São iguais ");
        }
    }
}
