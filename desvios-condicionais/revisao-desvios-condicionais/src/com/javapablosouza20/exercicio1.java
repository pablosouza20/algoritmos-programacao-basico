//1 -  O cardápio de uma lanchonete é o seguinte:
//Escrever um algoritmo que leia o código do item pedido,
//a quantidade e calcule o valor a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item.
package com.javapablosouza20;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner codigoRecebido = new Scanner(System.in);
        Scanner quantidadeRecebida = new Scanner(System.in);

        int codigo;
        int quantidade;
        double preço;

        System.out.println(" Digite o código: ");
        codigo = codigoRecebido.nextInt();

        System.out.println(" Digite a quantidade desejada: ");
        quantidade = quantidadeRecebida.nextInt();

        if (codigo == 100) {
            preço = (quantidade * 1.10);
            System.out.println(" Cachorro quente por R$ " + preço);
        } else if (codigo == 101) {
            preço = (quantidade * 1.30);
            System.out.println(" Bauru simples por R$ " + preço);
        } else if (codigo == 102) {
            preço = (quantidade * 1.50);
            System.out.println(" Bauru com ovo por R$" + preço);
        } else if (codigo == 103) {
            preço = (quantidade * 1.10);
            System.out.println(" Hamburguer por R$" + preço);
        } else if (codigo == 104) {
            preço = (quantidade * 1.30);
            System.out.println(" Cheeseburguer por R$" + preço);
        } else if (codigo == 105) {
            preço = (quantidade * 1.00);
            System.out.println(" Refrigerente por R$" + preço);
        } else {
            System.out.print(" Opção inválida !");
            System.out.println(" Tente novamente ");
        }
    }
}
