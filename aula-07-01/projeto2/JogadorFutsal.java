package projeto2;

public class JogadorFutsal extends Atleta {

	private String pernaMaisForte;
	private Double valorPorGols;

	public String getPernaMaisForte() {
		return pernaMaisForte;
	}

	public void setPernaMaisForte(String pernaMaisForteChegando) {
		this.pernaMaisForte = pernaMaisForteChegando;
	}

	public double getValorPorGols() {
		return valorPorGols;
	}

	public void setValorPorGols(Double valorPorGolsChegando) {

		if (valorPorGolsChegando < 0) {

			throw new IllegalArgumentException("Valor por gols não pode ser negativo!!");

		}

		this.valorPorGols = valorPorGolsChegando;

	}

}
