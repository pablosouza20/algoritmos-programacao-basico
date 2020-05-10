//2- Dada a idade de um nadador, informe a sua categoria: Infantil (até 10 anos), Juvenil
//(até 17 anos) ou Sênior (acima de 17 anos).
package com.javapablosouza20;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner idadeRecebido = new Scanner(System.in);

        int idade;

        System.out.println(" Digite a idade do nadador: ");
        idade = idadeRecebido.nextInt();

        if (idade <= 10) {
            System.out.println(" Categoria Infantil ");
        } else if (idade <= 17) {
            System.out.println(" Categoria Juvenil ");
        } else {
            System.out.println(" Categoria Sênior");
        }
    }
}
