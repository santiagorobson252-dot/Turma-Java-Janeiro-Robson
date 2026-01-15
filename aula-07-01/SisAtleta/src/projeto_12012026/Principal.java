package projeto_12012026;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ForkJoinPool;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		System.out.println("#################Cadastro de Atletas############");
		String opcao;

		List<JogadorFutsal> jogadoresFutsal = new ArrayList<JogadorFutsal>();
		List<JogadorBasquete> jogadoresBasquete = new ArrayList<JogadorBasquete>();

		do {

			boolean validarLetra;
			String opcaoDeCadatsro;

			do {
				opcaoDeCadatsro = validarBF(
						JOptionPane.showInputDialog("Digite F para jogador de futsal ou B para jogador de basquete"));
				validarLetra = escolhaLetras(opcaoDeCadatsro);
			} while (!validarLetra);

			if (opcaoDeCadatsro.equalsIgnoreCase("F")) {
				Long idetificador = ThreadLocalRandom.current().nextLong(0, Long.MAX_VALUE);
				JogadorFutsal objJogadorFutsal = new JogadorFutsal(idetificador);
				do {
					String nome = JOptionPane.showInputDialog("Qual o nome do Jogador de futsal: ");
					validarLetra = escolhaLetras(nome);
					if (validarLetra) {
						objJogadorFutsal.setNomeAtleta(nome);
					}
				} while (!validarLetra);

				int idadeTemp;

				do {
					idadeTemp = validaInteiros(JOptionPane.showInputDialog("Digite a idade do jogador de futsal: "));
					if (idadeTemp != 0) {
						objJogadorFutsal.setIdade(idadeTemp);
					}
				} while (idadeTemp == 0);

				do {
					String pernaMaisForte = JOptionPane.showInputDialog("Qual a perna mais forte: ");
					validarLetra = escolhaLetras(pernaMaisForte);
					if (validarLetra) {
						objJogadorFutsal.setPernaMaisForte(pernaMaisForte);
					}
				} while (!validarLetra);

				Double valorPorGolTemp;

				do {
					valorPorGolTemp = validaDouble(JOptionPane.showInputDialog("Digite o valor por gol do jogador: "));
					if (valorPorGolTemp != 0.0) {
						objJogadorFutsal.setValorPorGols(valorPorGolTemp);
					}
				} while (valorPorGolTemp == 0);

				int quantidadeGols;

				do {
					quantidadeGols = validaInteiros(
							JOptionPane.showInputDialog("Digite a quantidade de pontos futsal: "));
					if (quantidadeGols != 0) {
						objJogadorFutsal.setQtdGol(quantidadeGols);
					}
				} while (quantidadeGols == 0);

				objJogadorFutsal.setSalario(objJogadorFutsal.calcularPagamento());
				objJogadorFutsal.setPatrocinio(objJogadorFutsal.calculaPatrocinio());

				jogadoresFutsal.add(objJogadorFutsal);
			}

			if (opcaoDeCadatsro.equalsIgnoreCase("B")) {
				Long idetificador = ThreadLocalRandom.current().nextLong(0, Long.MAX_VALUE);
				JogadorBasquete objJogadorBasquete = new JogadorBasquete(idetificador);

				do {
					String nome = JOptionPane.showInputDialog("Qual o nome do Jogador de bassquete: ");
					validarLetra = escolhaLetras(nome);
					if (validarLetra) {
						objJogadorBasquete.setNomeAtleta(nome);
					}
				} while (!validarLetra);

				int idadeTemp;

				do {
					idadeTemp = validaInteiros(JOptionPane.showInputDialog("Digite a idade do jogador de Basquete: "));
					if (idadeTemp != 0) {
						objJogadorBasquete.setIdade(idadeTemp);
					}
				} while (idadeTemp == 0);

				do {
					String bracoMaisForte = JOptionPane.showInputDialog("Qual a braco mais forte: ");
					validarLetra = escolhaLetras(bracoMaisForte);
					if (validarLetra) {
						objJogadorBasquete.setBracoMaisForte(bracoMaisForte);
					}
				} while (!validarLetra);

				Double valorPorPontoTemp;

				do {
					valorPorPontoTemp = validaDouble(
							JOptionPane.showInputDialog("Digite o valor por ponto do Basquete: "));
					if (valorPorPontoTemp != 0.0) {
						objJogadorBasquete.setValorPorPontos(valorPorPontoTemp);
					}
				} while (valorPorPontoTemp == 0);

				int quantidadePontoTemp;
				do {

					quantidadePontoTemp = validaInteiros(
							JOptionPane.showInputDialog("Digite o valor por ponto do Basquete: "));
					if (quantidadePontoTemp != 0) {
						objJogadorBasquete.setQuantidadePontos(quantidadePontoTemp);
					}
				} while (quantidadePontoTemp == 0);

				objJogadorBasquete.setSalario(objJogadorBasquete.calcularPagamento());
				objJogadorBasquete.setPatrocinio(objJogadorBasquete.calculaPatrocinio());

				jogadoresBasquete.add(objJogadorBasquete);

			}

			opcao = JOptionPane.showInputDialog("Deseja cadastrar mais um atleta (S/N)?");

		} while (opcao.equalsIgnoreCase("S"));

		StringBuilder mensagem = new StringBuilder();

		mensagem.append("LISTA DE CADASTRO\n");

		for (JogadorFutsal jogadorFutsalLista : jogadoresFutsal) {
			mensagem.append("Identificador: ").append(jogadorFutsalLista.getIdentificador()).append("\n");

			mensagem.append("nome do jogador de futsal: ").append(jogadorFutsalLista.getNomeAtleta()).append("\n");

			mensagem.append("Idade do jogador de futsal: ").append(jogadorFutsalLista.getIdade()).append("\n");

			mensagem.append("++++++++++++++++++++++++++++++++++++++++++++++\n");

			mensagem.append("Perna mais forte do jogador de futsal: ").append(jogadorFutsalLista.getPernaMaisForte())
					.append("\n");

			mensagem.append("Quantidadede gols do jogador de futsal: ").append(jogadorFutsalLista.getQtdGol())
					.append("\n");

			mensagem.append("Salario do jogador de futsal: ").append(jogadorFutsalLista.calcularPagamento())
					.append("\n");

			mensagem.append("Valor patrocinio: ").append(jogadorFutsalLista.calculaPatrocinio()).append("\n");

		}

		mensagem.append("++++++++++++++++++++++++++++++++++++++++++++++\n");

		for (JogadorBasquete jogadorBasquetelLista : jogadoresBasquete) {

			mensagem.append("Identificador: ").append(jogadorBasquetelLista.getIdentificador()).append("\n");

			mensagem.append("nome do jogador de Basquete: ").append(jogadorBasquetelLista.getNomeAtleta()).append("\n");

			mensagem.append("Idade do jogador de Basquete: ").append(jogadorBasquetelLista.getIdade()).append("\n");

			mensagem.append("++++++++++++++++++++++++++++++++++++++++++++++\n");

			mensagem.append("Perna mais forte do jogador de Basquete: ")
					.append(jogadorBasquetelLista.getBracoMaisForte()).append("\n");

			mensagem.append("Quantidade de pontos do jogador de Basquete: ")
					.append(jogadorBasquetelLista.getQuantidadePontos()).append("\n");

			mensagem.append("Salario do jogador de Basquete: ").append(jogadorBasquetelLista.calcularPagamento())
					.append("\n");

			mensagem.append("Valor  patrocinio: ").append(jogadorBasquetelLista.calculaPatrocinio()).append("\n");
		}
		mensagem.append("FIM DE CADASTRADOS#######\n");
		JOptionPane.showMessageDialog(null, mensagem.toString(), "Lista de atletas", JOptionPane.INFORMATION_MESSAGE);

	}

	public static int validaInteiros(String numeroString) {
		int numeroInteiro = 0;

		if (numeroString == null || numeroString.isBlank()) {
			JOptionPane.showMessageDialog(null, "valor invalido");
		} else {
			try {
				numeroInteiro = Integer.parseInt(numeroString);

				if (numeroInteiro == 0) {
					JOptionPane.showMessageDialog(null, "Não é permitido digitar zero");
					numeroInteiro = 0;
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Apenas numeros");
				System.out.println("O valor:" + e.getMessage() + "nao é possivel converter para inteiro");
			}

		}
		return numeroInteiro;
	}

	public static Double validaDouble(String numeroString) {
		Double numeroDecimal = 0.0;

		if (numeroString == null || numeroString.isBlank()) {
			JOptionPane.showMessageDialog(null, "Valor invalido");
		} else {

			try {
				numeroDecimal = Double.parseDouble(numeroString);

				if (numeroDecimal == 0.0) {
					JOptionPane.showMessageDialog(null, "Não é permitido digitar zero");
					numeroDecimal = 0.0;
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Apenas Numeros.");
				System.out.println("O valor: " + e.getMessage() + "nao é possivel converter para inteiro.");

			}
		}

		return numeroDecimal;
	}

	public static String validarBF(String opcao) {

		if (opcao == null || opcao.isBlank()) {
			JOptionPane.showMessageDialog(null, "Informação inválida. Digite B ou F.");
			return null;
		}

		if (!opcao.equalsIgnoreCase("F") && !opcao.equalsIgnoreCase("B")) {
			JOptionPane.showMessageDialog(null, "Informação inválida. Digite B ou F.");
			return null;
		}

		return opcao.toUpperCase();
	}

	public static boolean escolhaLetras(String textoRecebido) {
		if (textoRecebido == null || textoRecebido.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Invalido");
			return false;
		}

		int qtdCaracterString = textoRecebido.length();

		for (int indice = 0; indice < qtdCaracterString; indice++) {

			char caracterAtual = textoRecebido.charAt(indice);

			if (!Character.isLetter(caracterAtual)) {
				JOptionPane.showMessageDialog(null, "Digite Letras!");
				return false;

			}

		}
		return true;
	}

}
