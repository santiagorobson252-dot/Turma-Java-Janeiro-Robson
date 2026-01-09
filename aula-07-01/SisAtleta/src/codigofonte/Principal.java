package codigofonte;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Cadastro de atleta");
        Scanner entradaDeDados = new Scanner(System.in);

        Atleta atleta = null;

        System.out.println("Digite B para Jogador de basquete e F para Jogador de futsal: ");
        String opcao = entradaDeDados.next();

        if (opcao.equals("B")) {

            JogadorBasquete jogadorBasquete = new JogadorBasquete();

            System.out.println("Digite o Nome do Jogador de basquete:");
            jogadorBasquete.setNomeAtleta(entradaDeDados.next());

            System.out.println("Digite a idade do jogador:");
            jogadorBasquete.setIdade(entradaDeDados.nextInt());

            System.out.println("Digite o braço mais forte do jogador:");
            jogadorBasquete.setBracoMaisForte(entradaDeDados.next());

            System.out.println("Digite o valor por ponto do jogador:");
            jogadorBasquete.setValorPorPontos(entradaDeDados.nextDouble());

            atleta = jogadorBasquete;

            System.out.println("Nome do atleta: " + atleta.getNomeAtleta());
            System.out.println("Idade do atleta: " + atleta.getIdade());
            System.out.println("Valor do patrocínio: " + atleta.calcularPatrocinio());
        }

        if (opcao.equals("F")) {

            JogadorFutsal jogadorFutsal = new JogadorFutsal();

            System.out.println("Digite o Nome do Jogador De Futsal: ");
            jogadorFutsal.setNomeAtleta(entradaDeDados.next());

            System.out.println("Digite a Idade do Jogador De Futsal: ");
            jogadorFutsal.setIdade(entradaDeDados.nextInt());

            System.out.println("Digite a perna mais forte do Jogador De Futsal: ");
            jogadorFutsal.setPernaMaisForte(entradaDeDados.next());

            System.out.println("Digite o valor por gol do Jogador De Futsal: ");
            jogadorFutsal.setValorPorGols(entradaDeDados.nextDouble());

            atleta = jogadorFutsal;

            System.out.println("Nome do atleta: " + atleta.getNomeAtleta());
            System.out.println("Idade do atleta: " + atleta.getIdade());
            System.out.println("Valor do patrocínio: " + atleta.calcularPatrocinio());
        }
    }
}