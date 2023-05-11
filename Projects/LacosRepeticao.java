package Aula4;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Aula 04 - Exercícios Laços de repetição - Primeiros 5 exercicios
 * 
 * 
 * @author Rodrigo Mora Azócar
 *
 */


public class LacosRepeticao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("========================MENU===================\n");
		System.out.println("1-Dado um número inteiro informado pelo usuário, imprima todos os números pares\r\n"
				+ "entre 0 e esse número.\n");
		System.out.println("2-Escreva um programa que lê uma sequência de números informados pelo usuário e\r\n"
				+ "mostra a média aritmética desses números.\n");
		System.out.println("3-Dado um array de inteiros, imprima a soma de todos os elementos.\n");
		System.out.println("4-Dado um número inteiro informado pelo usuário, imprima todos os números ímpares\r\n"
				+ "entre 1 e esse número.\n");
		System.out.println("5-Escreva um programa que lê uma sequência de palavras informadas pelo usuário e\r\n"
				+ "mostra a palavra de maior comprimento.\n");

		System.out.println("Digite uma opção de 1 a 5: ");
		int opcao = sc.nextInt();

		switch (opcao) {

		case 1:

			System.out.println("Digite um número inteiro:");
			int numerzim = sc.nextInt();

			for (int i = 0; i <= numerzim; i++) {
				if (i % 2 == 0) {

					System.out.printf("Número Par entre 0 e %d: %d \n", numerzim, i);
				}

			}

			break;

		case 2:
			sc.nextLine();
			System.out.print("Digite uma sequência de números separados por espaços: ");
	        String linhaz = sc.nextLine().trim();

	        String[] numeros = linhaz.split(" ");
	        double somaroro = 0;
	        int quantidadeNumeros = 0;

	        for (String numero : numeros) {
	            if (!numero.isEmpty()) {
	                somaroro += Double.parseDouble(numero);
	                quantidadeNumeros++;
	            }
	        }

	        if (quantidadeNumeros > 0) {
	            double media = somaroro / quantidadeNumeros;
	            System.out.println("A média aritmética dos números informados é: " + media);
	        } else {
	            System.out.println("Nenhum número foi informado.");
	        }

			
			break;

		case 3:

			int[] numeroz = { 1, 2, 3, 4, 5 };
			int somaz = 0;

			for (int elemento : numeroz) {
				somaz += elemento;
			}

			System.out.println("A soma dos elementos do array é: " + somaz);

			break;

		case 4:
			System.out.print("Digite um número inteiro: ");
			int numero = sc.nextInt();

			for (int i = 1; i <= numero; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}

			break;

		case 5:
			System.out.print("Digite uma sequência de palavras separadas por espaços: ");
			String linha;
			while ((linha = sc.nextLine().trim()).isEmpty()) {
				// Apenas aguarde uma entrada válida do usuário
			}

			String[] palavras = linha.split(" ");
			String palavraMaisLonga = "";
			int comprimentoPalavraMaisLonga = 0;

			for (String palavra : palavras) {
				int comprimentoPalavra = palavra.length();

				if (comprimentoPalavra > comprimentoPalavraMaisLonga) {
					palavraMaisLonga = palavra;
					comprimentoPalavraMaisLonga = comprimentoPalavra;
				}
			}

			System.out.println("A palavra de maior comprimento é: " + palavraMaisLonga);

			break;

			default:
				System.out.println("Você digitou uma opção inválida");
		} // fim switch principal

		sc.close(); // fim do scanner
	} // fim do main

} // fim da classe
