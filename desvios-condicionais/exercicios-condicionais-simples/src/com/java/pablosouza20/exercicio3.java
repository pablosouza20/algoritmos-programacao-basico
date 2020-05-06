//3- Ler um número inteiro e exibir seu antecessor. (Não precisa usar desvio condicional)
package com.java.pablosouza20;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner numeroRecebido = new Scanner(System.in);

        int num;
        int calc;

        System.out.println(" Digite o número: ");
        num = numeroRecebido.nextInt();

        calc = num - 1;

        System.out.println(" Mostre o seu antecessor " + calc);

    }
}
