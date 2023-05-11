package Aula4;

import java.util.Locale;
import java.util.Scanner;


/**
 * Aula 04 - Pdf Exercícios Switch Case 
 * @author brazu
 *
 */
public class Aula4SwitchCase {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("===============MENU===================");
		System.out.println("1-Leia o código de um determinado produto e mostre sua classificação. Utilize a\r\n"
				+ "seguinte tabela como referência:");

		// 1 - Alimento não-perecível
		// 2, 3 ou 4 - Alimento perecível
		// 5 ou 6 - Vestuário
		// 7 - Higiene pessoal
		// 8 até 15 - Limpeza e utensílios domésticos
		// Qualquer outro código - Código inválido

		System.out.println("2-Faça um programa que receba duas notas, calcule e mostre a média aritmética e\r\n"
				+ "mensagem que está na tabela a seguir: \n");

		// Média Aritmética Mensagem
		// 0,0 - 4,0 Reprovado
		// 4,1 - 7,0 Exame
		// 7,1 - 10,0 Aprovado

		System.out.println("3-Faça um programa que receba dois números e execute as operações listadas a\r\n"
				+ "seguir de acordo com a escolha do usuário:\n");

		// Escolha do Usuário Operação
		// 1 Média entre os números digitados
		// 2 Diferença entre os números
		// 3 Produto entre os números digitados
		// 4 Divisão do primeiro pelo segundo
		// Se a opção digitada for inválida, mostrar uma mensagem de erro e terminar a
		// execução do programa.

		System.out.println(
				"4-Escreva um algoritmo que leia o código do item adquirido pelo consumidor e a quantidade,\r\n"
						+ "calculando e mostrando o valor a pagar. Não será necessário exibir o produto e o valor,\r\n"
						+ "somente o valor final\n");

		// O cardápio de uma casa de lanches é dado pela tabela abaixo:
		// Código Produto Preço Unitário (R$)
		// 100 Cachorro quente R$ 1,70
		// 101 Bauru simples R$ 2,30
		// 102 Bauru com ovo R$ 2,60
		// 103 Hambúrguer R$ 2,40
		// 104 Cheeseburguer R$ 2,50
		// 105 Refrigerante R$ 1,00

		System.out.println("Digite uma opção de 1 a 4:");
		int opcao = sc.nextInt();

		switch (opcao) {

		case 1:

			System.out.println("Digite um valor de código:");
			int codigo = sc.nextInt();

			switch (codigo) {

			case 1:
				System.out.printf("Código: %d - Classificação: Alimento não-perecível", codigo);
				break;

			case 2:
				System.out.printf("Código: %d - Classificação: Alimento perecível", codigo);
				break;

			case 3:
				System.out.printf("Código: %d - Classificação: Alimento perecível", codigo);
				break;
			case 4:
				System.out.printf("Código: %d - Classificação: Alimento perecível", codigo);
				break;

			case 5:
				System.out.printf("Código: %d - Classificação: Vestuário", codigo);
				break;
			case 6:
				System.out.printf("Código: %d - Classificação: Vestuário", codigo);
				break;
			case 7:
				System.out.printf("Código: %d - Classificação: Higiene pessoal", codigo);
				break;
			case 8:
				System.out.printf("Código: %d - Classificação: Limpeza e utensílios domésticos", codigo);
				break;
			case 9:
				System.out.printf("Código: %d - Classificação: Limpeza e utensílios domésticos", codigo);
				break;
			case 10:
				System.out.printf("Código: %d - Classificação: Limpeza e utensílios domésticos", codigo);
				break;
			case 11:
				System.out.printf("Código: %d - Classificação: Limpeza e utensílios domésticos", codigo);
				break;
			case 12:
				System.out.printf("Código: %d - Classificação: Limpeza e utensílios domésticos", codigo);
				break;
			case 13:
				System.out.printf("Código: %d - Classificação: Limpeza e utensílios domésticos", codigo);
				break;
			case 14:
				System.out.printf("Código: %d - Classificação: Limpeza e utensílios domésticos", codigo);
				break;
			case 15:
				System.out.printf("Código: %d - Classificação: Limpeza e utensílios domésticos", codigo);
				break;
			default:
				System.out.println("Código: Código Qualquer - Classificação:Código inválido");
			}
			break; // break do switch case do exercicio 1

		case 2:

			System.out.println("Ingrese la primera nota: ");
			double nota1 = sc.nextDouble();

			System.out.println("Ingrese la segunda nota: ");
			double nota2 = sc.nextDouble();

			double media = (nota1 + nota2) / 2.0;

			int mediaInt = (int) Math.floor(media);

			String mensagem;

			switch (mediaInt) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				mensagem = "Reprovado";
				break;
			case 5:
			case 6:
			case 7:
				mensagem = "Exame";
				break;
			case 8:
			case 9:
			case 10:
				mensagem = "Aprovado";
				break;
			default:
				mensagem = "Média inválida";
				break;
			}

			if (mediaInt == 4 && media > 4.0) {
				mensagem = "Exame";
			} else if (mediaInt == 7 && media > 7.0) {
				mensagem = "Aprovado";
			}

			System.out.println("Média Aritmética: " + media);
			System.out.println("Mensagem: " + mensagem);
			break;
		case 3:

			int escolha;
			double resultado;
			System.out.println("Digite dois números:");
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();

			System.out.println("Escolha a operação a ser realizada:");
			System.out.println("1 - Média entre os números digitados");
			System.out.println("2 - Diferença entre os números");
			System.out.println("3 - Produto entre os números digitados");
			System.out.println("4 - Divisão do primeiro pelo segundo");

			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				resultado = (num1 + num2) / 2;
				System.out.println("Média entre os números: " + resultado);
				break;
			case 2:
				resultado = num1 - num2;
				System.out.println("Diferença entre os números: " + resultado);
				break;
			case 3:
				resultado = num1 * num2;
				System.out.println("Produto entre os números: " + resultado);
				break;
			case 4:
				if (num2 == 0) {
					System.out.println("Erro: Divisão por zero");
				} else {
					resultado = num1 / num2;
					System.out.println("Divisão do primeiro pelo segundo: " + resultado);
				}
				break;
			default:
				System.out.println("Opção inválida");

			}

		case 4:
			System.out.println("Informe o código do produto:");
			int codigoProduto = sc.nextInt();

			System.out.println("Informe a quantidade:");
			int quantidade = sc.nextInt();

			double precoUnitario = 0;
			switch (codigoProduto) {
			case 100:
				precoUnitario = 1.70;
				break;
			case 101:
				precoUnitario = 2.30;
				break;
			case 102:
				precoUnitario = 2.60;
				break;
			case 103:
				precoUnitario = 2.40;
				break;
			case 104:
				precoUnitario = 2.50;
				break;
			case 105:
				precoUnitario = 1.00;
				break;
			default:
				System.out.println("Código de produto inválido");
				
			} // fim switch case exercicio 4

			double total = precoUnitario * quantidade;
			System.out.printf("Total a pagar: R$ %.2f", total);

		}
		sc.close();
	}

}
