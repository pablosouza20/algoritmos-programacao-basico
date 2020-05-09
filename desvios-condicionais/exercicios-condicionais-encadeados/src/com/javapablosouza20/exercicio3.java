//3- Faça um algoritmo que receba um número referente a um sabor de sorvete.
//1-CHOCOLATE
//2-MORANGO
//Qualquer outro número digitado fora de 1 e 2 deve ser retornado como “INVÁLIDO”.
// Se for um deve-se se retornar “Sua preferência é chocolate”. Se for 2 deve-se retornar “Sua preferência é morango”.

package com.javapablosouza20;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner numeroRecebido = new Scanner((System.in));

        int num;

        System.out.println(" Digite o número: ");
        num = numeroRecebido.nextInt();

        if (num == 1) {
            System.out.println(" Sua preferência é chocolate ");
        } else if (num == 2) {
            System.out.println(" Sua preferência é morango ");
        } else {
            System.out.println(" Inválido ");
        }

    }
}
