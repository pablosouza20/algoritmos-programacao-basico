//5- Faça um algoritmo que leia um número N e imprima “F1”, “F2” ou “F3”, conforme a condição:
//a. “F1”, se N <= 10
//b. “F2”, se N > 10 e N <= 100
//c. “F3”, se n > 100

package com.javapablosouza20;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner numeroRecebido = new Scanner((System.in));

        int n;

        System.out.println(" Digite o número: ");
        n = numeroRecebido.nextInt();

        if (n <= 10) {
            System.out.println(" F1 ");
        } else if (n > 10 && n <= 100) {
            System.out.println(" F2 ");
        } else {
            System.out.println(" F3 ");
        }

    }
}
