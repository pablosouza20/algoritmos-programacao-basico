//2- Escreva um algoritmo que leia a idade de uma pessoa. Se a pessoa for maior de 18 anos deve-se escrever “FILA NORMAL”
// , Se a pessoa for maior que 65 anos deve-se escrever “FILA PREFERENCIAL”. Se não deve-se escrever “PROIBIDA A ENTRADA”;

package com.javapablosouza20;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner idadeRecebida = new Scanner(System.in);
        Scanner nomeRecebido = new Scanner((System.in));

        String nome;
        int idade;


        System.out.println(" Digite seu nome: ");
        nome = nomeRecebido.nextLine();

        System.out.println(" Digite a sua idade: ");
        idade = idadeRecebida.nextInt();


        if (idade >= 18 && idade <= 65) {
            System.out.println(" Fila normal ");
        } else if (idade > 65) {
            System.out.println(" Fila Preferencial ");
        } else {
            System.out.println(" Proibida a entrada ");
        }

    }
}
