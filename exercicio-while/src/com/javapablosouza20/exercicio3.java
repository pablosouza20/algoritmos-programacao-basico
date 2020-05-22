// 3- Faça um programa onde o usuário digita um valor e imprime na tela todos
// os valores de 0 até o valor digitado.
package com.javapablosouza20;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner numRececibo = new Scanner(System.in);

        int num;
        int i=0;

        System.out.println(" Digite um valor: ");
        num = numRececibo.nextInt();

        while (i <= num) {
            System.out.println(i++);
        }
    }
}