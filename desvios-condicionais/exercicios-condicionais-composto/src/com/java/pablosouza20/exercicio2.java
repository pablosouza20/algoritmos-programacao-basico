//2- Escreva um algoritmo que leia uma letra que represente o sexo de uma pessoa (M para Masculino e F para feminino).
// Se for masculino, mostra a mensagem “Seja bem-vindo, Senhor!”, se for feminino, mostra a mensagem “Seja bem-vinda, Senhora!”.
package com.java.pablosouza20;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sexoRecebido = new Scanner(System.in);

        String sexo;

        System.out.println(" Digite o sexo:  ");
        sexo = sexoRecebido.nextLine();


        if (sexo.equalsIgnoreCase("M")) {
            System.out.println(" Seja bem-vindo, senhor! ");
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.printf(" Seja bem-vindo, senhora! ");
        } else {
            System.out.println(" Inválido !");
        }
    }
}
