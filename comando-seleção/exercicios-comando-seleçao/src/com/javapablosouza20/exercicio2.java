// 2- A partir do exercício anterior, pergunte ao usuário se deseja os numerais em inglês ou português.
// (Esse exercício vai usar como base o exercício 1, porém aqui além do CASO vai acrescentar um desvio condicional tbm.)

package com.javapablosouza20;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner numRecebido = new Scanner(System.in);
        Scanner idiomaRecebido = new Scanner(System.in);

        int num;
        String idioma;

        System.out.println(" Digite o número: ");
        num = numRecebido.nextInt();

        System.out.println(" Digite o idioma: ");
        idioma = idiomaRecebido.nextLine();

        if (idioma.equalsIgnoreCase("ingles")) {
            switch (num) {
                case 1:
                    System.out.println(" one ");
                    break;

                case 2:
                    System.out.println(" two ");
                    break;

                case 3:
                    System.out.println(" three ");
                    break;

                case 4:
                    System.out.println(" four ");
                    break;

                case 5:
                    System.out.println(" five ");
                    break;
                default:
                    System.out.println(" number inválid ");

            }
        } else if (idioma.equalsIgnoreCase("portugues")) {
            switch (num) {
                case 1:
                    System.out.println(" Um ");
                    break;

                case 2:
                    System.out.println(" dois ");
                    break;

                case 3:
                    System.out.println(" três ");
                    break;

                case 4:
                    System.out.println(" quatro ");
                    break;

                case 5:
                    System.out.println(" cinco ");
                    break;
                default:
                    System.out.println(" Número inválido ");
            }
        } else {
            System.out.println(" idioma inválido !");
        }
    }
}