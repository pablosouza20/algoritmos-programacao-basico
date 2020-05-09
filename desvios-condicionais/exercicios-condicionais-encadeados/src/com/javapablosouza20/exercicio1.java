//1 - Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média
// (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9).

package com.javapablosouza20;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner notaRecebida = new Scanner(System.in);
        Scanner nomeRecebido = new Scanner((System.in));

        String nome;
        Double n1;
        Double n2;
        Double n3;
        Double media;

        System.out.println(" Digite seu nome: ");
        nome = nomeRecebido.nextLine();

        System.out.println(" Digite a primeira nota: ");
        n1 = notaRecebida.nextDouble();

        System.out.println(" Digite a segunda nota: ");
        n2 = notaRecebida.nextDouble();

        System.out.println(" Digite a terceira nota: ");
        n3 = notaRecebida.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println(" O aluno " + nome + " foi APROVADO com média " + media);
        } else if (media <= 5) {
            System.out.println(" O aluno " + nome + " foi REPROVADO com média " + media);
        } else {
            System.out.println(" O aluno " + nome + " está em RECUPERAÇÃO com média " + media);
        }

    }
}
