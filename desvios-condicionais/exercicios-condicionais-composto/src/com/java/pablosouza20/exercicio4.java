//4- Para doar sangue é necessário ter entre 18 e 67 anos. Faça um algoritmo que pergunte a
//idade de uma pessoa e diga se ela pode doar sangue ou não.
package com.java.pablosouza20;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner idadeRecebida = new Scanner(System.in);

        int idade;

        System.out.println(" Informe sua idade:  ");
        idade = idadeRecebida.nextInt();


        if (idade >= 18 && idade <= 67) {
            System.out.println(" Pode doar sangue ! ");
        } else {
            System.out.println(" Não pode doar !");
        }
    }
}
