//3 - Ler um número e se for maior que 20, mostrar a metade desse número.
package com.javapablosouza20;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner numRecebido = new Scanner(System.in);

        int num;
        int calc;

        System.out.println(" Digite o número: ");
        num = numRecebido.nextInt();

        calc = num / 2;

        if (num > 20) {
            System.out.println(" Essa é a metade, " + calc);
        } else {
            System.out.println(" É esse é o número, " + num);
        }
    }
}
