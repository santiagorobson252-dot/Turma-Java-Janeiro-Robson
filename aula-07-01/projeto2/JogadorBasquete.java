package projeto2;

public class JogadorBasquete extends Atleta {

	private String bracoMaisForte;
	private Double valorPorPontos;

	public String getBracoMaisForte() {
		return bracoMaisForte;
	}

	public void setBracoMaisForte(String bracoMaisForteChegando) {
		this.bracoMaisForte = bracoMaisForteChegando;
	}

	public double getValorPorPontos() {
		return valorPorPontos;
	}

	public void setValorPorPontos(Double valorPorPontosChegando) {

		if (valorPorPontosChegando < 0) {

			throw new IllegalArgumentException("Valor por pontos não pode ser negativo!!");

		}

		this.valorPorPontos = valorPorPontosChegando;

	}

}