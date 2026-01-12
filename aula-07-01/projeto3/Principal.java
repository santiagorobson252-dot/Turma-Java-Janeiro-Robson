package projeto3;

//Utilize encapsulamento e não permita a inserção de valores negativos.
//Utilizando o Utilitario e instanciando o utilitario dentro das classes filhas

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		System.out.println("*********************CADASTRO DE ATLETAS***********************");

		System.out.println("Cadastro de atleta");
		Scanner entradaDeDados = new Scanner(System.in);

		JogadorBasquete jogadorBasquete = new JogadorBasquete();
		JogadorFutsal jogadorFutsal = new JogadorFutsal();

		System.out.println("Digite B para Jogador de basquete e F para Jogador de futsal: ");
		String opcao = entradaDeDados.next();

		if (opcao.equals("B")) {

			System.out.println("Digite o Nome do Jogador de basquete:");
			jogadorBasquete.setNomeAtleta(entradaDeDados.next());

			System.out.println("Digite a idade do jogador:");
			jogadorBasquete.setIdade(entradaDeDados.nextInt());

			System.out.println("Digite o braço mais forte do jogador:");
			jogadorBasquete.setBracoMaisForte(entradaDeDados.next());

			System.out.println("Digite o valor por ponto do jogador:");
			jogadorBasquete.setValorPorPontos(entradaDeDados.nextDouble());

			System.out.println("O nome do jogador de basquete é : " + jogadorBasquete.getNomeAtleta());
			System.out.println("A idade do jogador de basquete é : " + jogadorBasquete.getIdade());
			System.out.println("A Braço mais forte é : " + jogadorBasquete.getBracoMaisForte());
			System.out.println("O valor por pontos: $ " + jogadorBasquete.getValorPorPontos());

		}

		if (opcao.equals("F")) {

			System.out.println("Digite o Nome do Jogador De Futsal: ");
			jogadorFutsal.setNomeAtleta(entradaDeDados.next());

			System.out.println("Digite a Idade do Jogador De Futsal: ");
			jogadorFutsal.setIdade(entradaDeDados.nextInt());

			System.out.println("Digite a perna mais forte do Jogador De Futsal: ");
			jogadorFutsal.setPernaMaisForte(entradaDeDados.next());

			System.out.println("Digite o valor por gol do Jogador De Futsal: ");
			jogadorFutsal.setValorPorGols(entradaDeDados.nextDouble());

			System.out.println("O nome do jogador de futsal é: " + jogadorFutsal.getNomeAtleta());
			System.out.println("A idade do jogador de futsal é: " + jogadorFutsal.getIdade());
			System.out.println("A perna  mais forte é: " + jogadorFutsal.getPernaMaisForte());
			System.out.println("O valor por gols: $ " + jogadorFutsal.getValorPorGols());

		}
		System.out.println("**************************FIM DE CADASTRO***********************");

	}
}
