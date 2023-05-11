package Aula4;

import java.util.Locale;
import java.util.Scanner;

public class Aula4IfElse {
	/**
	 * Aula04 - Exercicios do Pdf -IfElse
	 * @author Rodrigo A. Mora Azócar
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("=====================Menu========================");
		System.out.println("1- Escreva um programa para ler 2 valores (considere que não serão informados valores\r\n"
				+ "iguais) e escreva o maior deles.\n");

		System.out.println("2-Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma\r\n"
				+ "mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o\r\n"
				+ "mês em que ela nasceu).\n");

		System.out.println("3- Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A\r\n"
				+ "senha válida é o número 1234. Devem ser impressas as seguintes mensagens:\r\n"
				+ "ACESSO PERMITIDO caso a senha seja válida.\r\n" + "ACESSO NEGADO caso a senha seja inválida");

		System.out.println("4-As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25\r\n"
				+ "se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs\r\n"
				+ "compradas, calcule e escreva o valor total da compra.");

		System.out
				.println("5-Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores\r\n"
						+ "iguais) e escrevê-los em ordem crescente.");

		System.out.println("6- Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino\r\n"
				+ "2:masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal,\r\n"
				+ "utilizando as seguintes\r\n" + "Fórmulas:\r\n" + "- para homens: (72.7 * Altura) – 58\r\n"
				+ "- para mulheres: (62.1 * Altura) – 44.7");

		System.out.println("7- Escreva um programa para ler o número de lados de um polígono regular e a medida do\r\n"
				+ "lado (em cm). Calcular e imprimir o seguinte:\r\n"
				+ "− Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área\r\n"
				+ "− Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.\r\n"
				+ "− Se o número de lados for igual a 5 escrever PENTÁGONO.");

		System.out.println("8-Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso.\r\n"
				+ "− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.\r\n"
				+ "− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO\r\n" + "IDENTIFICADO.");

		System.out
				.println("9-Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que\r\n"
						+ "o usuário não informará valores iguais.");

		System.out.println("10-Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é\r\n"
				+ "Equilátero, Isósceles ou Escaleno. Sendo que:\r\n"
				+ "− Triângulo Equilátero: possui os 3 lados iguais.\r\n"
				+ "− Triângulo Isóscele: possui 2 lados iguais.\r\n"
				+ "− Triângulo Escaleno: possui 3 lados diferentes.");

		System.out.println("11-Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o\r\n"
				+ "triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:\r\n"
				+ "− Triângulo Retângulo: possui um ângulo reto. (igual a 90º)\r\n"
				+ "− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)\r\n"
				+ "− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)");

		System.out.println("============= \n");
		System.out.println("Digite uma opção de 1 a 11: ");
		int opcao = sc.nextInt();

		switch (opcao) {

		case 1:
			// 1. Escreva um programa para ler 2 valores (considere que não serão informados
			// valores
			// iguais) e escreva o maior deles.

			int num1, num2;
			do {
				System.out.print("Digite um número:");
				num1 = sc.nextInt();

				System.out.print("Digite um número:");
				num2 = sc.nextInt();
				if (num1 == num2) {
					System.out.println("Os números são iguais, você terá que digitar novamente os números!");
				}
			} while (num1 == num2);

			if (num1 > num2) {
				System.out.printf("%d é maior que %d", num1, num2);
			} else {
				System.out.printf("%d é maior que %d", num2, num1);
			}

			break;
		case 2:
//Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
//mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

			System.out.println("Digite o ano de nascimento: ");
			int anoNascimento = sc.nextInt();

			// Cálculo da idade
			int idade = 2023 - anoNascimento;

			if (idade >= 16) {
				System.out.println("Você poderá votar este ano!");
			} else {
				System.out.println("Você não poderá votar este ano.");
			}

			break;
		case 3:

			System.out.println("Digite a senha de do usuário para que seja validado:");
			int senha = sc.nextInt();

			if (senha == 1234) {
				System.out.println("ACESSO PERMITIDO");
			} else {
				System.out.println("ACESSO NEGADO");
			}

			break;

		case 4:

			final double VALORMACAMENOSDUZIA = 0.30;
			final double VALORMACAPELOMENOSDOZE = 0.25;

			System.out.println("Digite quantas maçãs você deseja comprar:");
			int qtdMaca = sc.nextInt();

			if (qtdMaca >= 12) {
				System.out.printf("O número de Maçãs compradas é de : %d \n", qtdMaca);
				System.out.printf("O valor total da compra é de : %.2f\n", qtdMaca * VALORMACAPELOMENOSDOZE);
			} else {
				System.out.printf("O número de Maçãs compradas é de : %d \n", qtdMaca);
				System.out.printf("O valor total da compra é de : %.2f\n", qtdMaca * VALORMACAMENOSDUZIA);
			}

			break;
		case 5:

			int a, b, c;
			do {
				System.out.println("Digite um valor inteiro:\n");
				a = sc.nextInt();

				System.out.println("Digite um valor inteiro: \n");
				b = sc.nextInt();

				System.out.println("Digite um valor inteiro: \n");
				c = sc.nextInt();
			}

			while (a == b || b == c || a == c);

			if (a < b && a < c) {
				if (b < c) {
					System.out.printf("%d < %d < %d", a, b, c);
				} else {
					System.out.printf("%d < %d < %d", a, c, b);
				}
			} else if (b < a && b < c) {
				if (a < c) {
					System.out.printf("%d < %d < %d", b, a, c);
				} else {
					System.out.printf("%d < %d < %d", b, c, a);
				}
			} else {
				if (a < b) {
					System.out.printf("%d < %d < %d", c, a, b);
				} else {
					System.out.printf("%d < %d < %d", c, b, a);
				}
			}

			break;
		case 6:
			System.out.println("Digite sua altura: ");
			double altura = sc.nextDouble();

			System.out.println("Digite seu sexo (1 para feminino ou 2 para masculino): ");
			int sexo = sc.nextInt();

			double pesoIdeal;
			if (sexo == 1) {
				pesoIdeal = 62.1 * altura - 44.7;
				System.out.println("Seu peso ideal é: " + pesoIdeal + "kg");
			} else if (sexo == 2) {
				pesoIdeal = 72.7 * altura - 58;
				System.out.println("Seu peso ideal é: " + pesoIdeal + "kg");
			} else {
				System.out.println("Opção inválida para o sexo.");
			}

			break;
		case 7:
			System.out.println("Digite o número de lados do polígono regular:");
			int numLados = sc.nextInt();

			System.out.println("Digite a medida do lado do polígono regular em cm:");
			double medidaLado = sc.nextDouble();

			switch (numLados) {
			case 3:
				System.out.println("TRIÂNGULO");
				double areaTriangulo = (medidaLado * medidaLado * Math.sqrt(3)) / 4;
				System.out.printf("Área: %.2f cm²", areaTriangulo);
				break;
			case 4:
				System.out.println("QUADRADO");
				double areaQuadrado = medidaLado * medidaLado;
				System.out.printf("Área: %.2f cm²", areaQuadrado);
				break;
			case 5:
				System.out.println("PENTÁGONO");
				break;
			default:
				System.out.println("Número de lados inválido!");
			}
			break;

		case 8:
			System.out.println("Digite o número de lados do polígono regular:");
			int numLadox = sc.nextInt();

			System.out.println("Digite a medida do lado do polígono regular em cm:");
			double medidaLadox = sc.nextDouble();

			switch (numLadox) {
			case 3:
				System.out.println("TRIÂNGULO");
				double areaTriangulo = (medidaLadox * medidaLadox * Math.sqrt(3)) / 4;
				System.out.printf("Área: %.2f cm²", areaTriangulo);
				break;
			case 4:
				System.out.println("QUADRADO");
				double areaQuadrado = medidaLadox * medidaLadox;
				System.out.printf("Área: %.2f cm²", areaQuadrado);
				break;
			case 5:
				System.out.println("PENTÁGONO");
				break;
			default:
				if (numLadox < 3) {
					System.out.println("NÃO É UM POLÍGONO");
				} else {
					System.out.println("POLÍGONO NÃO IDENTIFICADO");
				}
			}
			break;
		case 9:

			System.out.println("Digite três valores inteiros:");
			int numA = sc.nextInt();
			int numB = sc.nextInt();
			int numC = sc.nextInt();

			if (numA > numB && numA > numC) {
				System.out.println("O maior valor é: " + numA);
			} else if (numB > numA && numB > numC) {
				System.out.println("O maior valor é: " + numB);
			} else {
				System.out.println("O maior valor é: " + numC);
			}

			break;

		case 10:
			System.out.println("Digite as medidas dos lados do triângulo:");
			double lado1 = sc.nextDouble();
			double lado2 = sc.nextDouble();
			double lado3 = sc.nextDouble();

			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isósceles");
			} else {
				System.out.println("Triângulo Escaleno");
			}

			break;

		case 11:

			System.out.print("Digite o valor do primeiro ângulo: ");
			int angulo1 = sc.nextInt();

			System.out.print("Digite o valor do segundo ângulo: ");
			int angulo2 = sc.nextInt();

			System.out.print("Digite o valor do terceiro ângulo: ");
			int angulo3 = sc.nextInt();

			if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
				System.out.println("Triângulo Retângulo");
			} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
				System.out.println("Triângulo Obtusângulo");
			} else {
				System.out.println("Triângulo Acutângulo");
			}

			break;

		default:
			System.out.println("Você digitou um opção errada!");
		} // fim switch case

		sc.close();

	} // fim main

}// fim Classe
