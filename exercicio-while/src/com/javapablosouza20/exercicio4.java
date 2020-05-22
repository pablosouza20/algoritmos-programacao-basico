// 4- Faça um programa onde o usuário digita dez valores e imprima na tela a soma destes valores.
package com.javapablosouza20;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        int i = 0;

        while (i < 10) {
            x = sc.nextInt();
            soma = soma + x;
            i++;
        }
        System.out.println(soma);
    }
}
