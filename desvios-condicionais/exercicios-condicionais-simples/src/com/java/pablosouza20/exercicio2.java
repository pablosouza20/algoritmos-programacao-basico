//2- Ler um número inteiro e exibi-ló. (Não precisa usar desvio condicional)

package com.java.pablosouza20;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner numeroRecebido = new Scanner(System.in);

        int num;


        System.out.println(" Digite o número: ");
        num = numeroRecebido.nextInt();


        System.out.println(" Mostre o número " + num);

    }
}
