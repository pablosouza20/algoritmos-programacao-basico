//2- Modifique o programa anterior para que ele pergunte o nome do usuário e então imprima
// a mensagem “Bom dia, NOME!” 20 vezes (o mesmo nome).
package com.javapablosouza20;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner nomeRecebido = new Scanner(System.in);

        String nome;
        int i = 0;

        System.out.println(" Digite o seu nome: ");
        nome = nomeRecebido.nextLine();

        while (i < 20) {
            System.out.println(" Bom dia " + nome + " = " + i);
            i += 1;
        }
    }
}
