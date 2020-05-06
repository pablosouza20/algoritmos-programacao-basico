//4- Ler um número inteiro e se for menor que 50 exibir "TO CONSEGUINDO, DEUS É BOM".
package com.java.pablosouza20;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner numeroRecebido = new Scanner(System.in);

        int num;


        System.out.println(" Digite o número: ");
        num = numeroRecebido.nextInt();

        if (num < 50) {
            System.out.println(" TO CONSEGUINDO, DEUS É BOM ");
        }
    }
}