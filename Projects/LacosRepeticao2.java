package Aula4;

import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class LacosRepeticao2 {

	/**
	 * * @author Rodrigo A Mora Azócar
	 * 
	 * Exercícios Laços de repetição --- Agora um pouco mais avançado
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("========================MENU===================\n");

		System.out.println("1-Dado um array de inteiros, encontre o maior número e imprima a posição onde ele\r\n"
				+ "se encontra no array.\n");

		System.out.println("2-Escreva um programa que lê uma sequência de números informados pelo usuário e\r\n"
				+ "mostra quantos números estão acima da média e quantos estão abaixo da média.\n");

		System.out.println("3-Dado um número inteiro n informado pelo usuário, calcule o n-ésimo número de\r\n"
				+ "Fibonacci usando um laço de repetição.\n");
		System.out.println("4-Escreva um programa que leia uma sequência de palavras informadas pelo usuário\r\n"
				+ "e conte quantas vezes cada palavra aparece na sequência. Depois, imprima a lista\r\n"
				+ "de palavras e suas respectivas contagens.\n");
		System.out.println("5-Dado um array de inteiros, calcule a mediana (valor central) dos elementos usando\r\n"
				+ "um laço de repetição. Se o número de elementos do array for par, a mediana será a\r\n"
				+ "média dos dois valores centrais.\n");

		System.out.println("Digite uma opção de 1 a 5: ");
		int opcao = sc.nextInt();

		switch (opcao) {

		case 1:
			int[] numeros = { 10, 20, 35, 4, 15 };
			int maiorNumero = numeros[0];
			int posicaoMaiorNumero = 0;

			for (int i = 1; i < numeros.length; i++) {
				if (numeros[i] > maiorNumero) {
					maiorNumero = numeros[i];
					posicaoMaiorNumero = i;
				}
			}

			System.out.println(
					"O maior número é " + maiorNumero + " e está na posição " + posicaoMaiorNumero + " do array.");
			break;

		case 2:

			System.out.print("Digite uma sequência de números separados por espaços: ");
			sc.nextLine();
			String linhatz = sc.nextLine().trim();

			String[] numerosStr = linhatz.split("\\s+");
			int quantidadeNumeros = numerosStr.length;
			double soma = 0;

			for (String numeroStr : numerosStr) {
				if (!numeroStr.isEmpty()) {
					soma += Double.parseDouble(numeroStr);
				}
			}

			if (quantidadeNumeros > 0) {
				double media = soma / quantidadeNumeros;
				int quantidadeAcimaDaMedia = 0;
				int quantidadeAbaixoDaMedia = 0;

				for (String numeroStr : numerosStr) {
					if (!numeroStr.isEmpty()) {
						double numero = Double.parseDouble(numeroStr);
						if (numero > media) {
							quantidadeAcimaDaMedia++;
						} else if (numero < media) {
							quantidadeAbaixoDaMedia++;
						}
					}
				}

				System.out.println("Média: " + media);
				System.out.println("Quantidade de números acima da média: " + quantidadeAcimaDaMedia);
				System.out.println("Quantidade de números abaixo da média: " + quantidadeAbaixoDaMedia);
			} else {
				System.out.println("Nenhum número foi informado.");
			}

			break;

		case 3:
			System.out.print("Digite um número inteiro: ");
			int n = sc.nextInt();

			int numAnterior = 0;
			int numAtual = 1;
			int numProximo = 1;

			for (int i = 2; i <= n; i++) {
				numProximo = numAtual + numAnterior;
				numAnterior = numAtual;
				numAtual = numProximo;
			}

			System.out.println("O " + n + "-ésimo número de Fibonacci é: " + numProximo);
			break;

		case 4:
			System.out.print("Digite uma sequência de palavras separadas por espaço: ");
			sc.nextLine();
			String input = sc.nextLine();

			String[] palavras = input.split(" ");

			HashMap<String, Integer> contagem = new HashMap<>();

			for (String palavra : palavras) {
				if (contagem.containsKey(palavra)) {
					int novaContagem = contagem.get(palavra) + 1;
					contagem.put(palavra, novaContagem);
				} else {
					contagem.put(palavra, 1);
				}
			}

			for (String palavra : contagem.keySet()) {
				int quantidade = contagem.get(palavra);
				System.out.println(palavra + ": " + quantidade);
			}

			break;

		case 5:
			int[] array = { 2, 5, 8, 10, 12 };
			int tamanho = array.length;
			int indiceCentral = tamanho / 2;
			double mediana;

			// Ordenando o array
			for (int i = 0; i < tamanho; i++) {
				for (int j = i + 1; j < tamanho; j++) {
					if (array[i] > array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}

			if (tamanho % 2 == 0) {
				mediana = (array[indiceCentral - 1] + array[indiceCentral]) / 2.0;
			} else {
				mediana = array[indiceCentral];
			}

			System.out.println("Mediana: " + mediana);
			break;
			
		default:		
			System.out.println("Opção digitada inválida");

		} // fim switch principal

		sc.close(); // fim do scanner
	} // fim do main

} // fim da classe
