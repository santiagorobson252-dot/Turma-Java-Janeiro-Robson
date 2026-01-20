package projeto1;

//Crie um sistema de cadastro de Atletas usando os recursos e o que você aprendeu sobre orientação a objeto.
//Para debugar linha por linha usamos F6
//Para depurar de um breakPoint para o outro usamos f8.


import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    	
    	System.out.println("*********************CADASTRO DE ATLETAS***********************");

        System.out.println("Cadastro de atleta");
        Scanner entradaDeDados = new Scanner(System.in); //Criando e inicializando o objeto entradaDeDados do tipo Scanner

        JogadorBasquete jogadorBasquete = new JogadorBasquete();
        JogadorFutsal jogadorFutsal = new JogadorFutsal();

        System.out.println("Digite B para Jogador de basquete e F para Jogador de futsal: ");//Imprime uma string no console
        String opcao = entradaDeDados.next();

        if (opcao.equals("B")) {

            System.out.println("Digite o Nome do Jogador de basquete:");
            jogadorBasquete.nomeAtleta = entradaDeDados.next();

            System.out.println("Digite a idade do jogador:");
            jogadorBasquete.idade = entradaDeDados.nextInt(); //NextInt para receber inteiros do console

            System.out.println("Digite o braço mais forte do jogador:");
            jogadorBasquete.bracoMaisForte = entradaDeDados.next();

            System.out.println("Digite o valor por ponto do jogador:");
            jogadorBasquete.valorPorPontos = entradaDeDados.nextDouble();

            System.out.println("O nome do jogador: " + jogadorBasquete.nomeAtleta);
            System.out.println("A idade do jogador: " + jogadorBasquete.idade);
            System.out.println("A perna mais forte: " + jogadorBasquete.bracoMaisForte);
            System.out.println("O valor por gols: " + jogadorBasquete.valorPorPontos);

        }

        if (opcao.equals("F")) {

            System.out.println("Digite o Nome do Jogador De Futsal: ");
            jogadorFutsal.nomeAtleta = entradaDeDados.next();

            System.out.println("Digite a Idade do Jogador De Futsal: ");
            jogadorFutsal.idade = entradaDeDados.nextInt();

            System.out.println("Digite a perna mais forte do Jogador De Futsal: ");
            jogadorFutsal.pernaMaisForte = entradaDeDados.next();

            System.out.println("Digite o valor por gol do Jogador De Futsal: ");
            jogadorFutsal.valorPorGols = entradaDeDados.nextDouble();

            System.out.println("O nome do jogador de futsal: " + jogadorFutsal.nomeAtleta);
            System.out.println("A idade do jogador de futsal: " + jogadorFutsal.idade);
            System.out.println("O braco mais forte: " + jogadorFutsal.pernaMaisForte);
            System.out.println("O valor por Pontos: " + jogadorFutsal.valorPorGols);

        }
    	System.out.println("**************************FIM DE CADASTRO***********************");


    }
}
