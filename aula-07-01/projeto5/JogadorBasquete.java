package projeto5;

public class JogadorBasquete extends Atleta {

    private String bracoMaisForte;
    private Double valorPorPontos;

    public String getBracoMaisForte() {
        return bracoMaisForte;
    }

    public void setBracoMaisForte(String bracoMaisForte) {
        this.bracoMaisForte = bracoMaisForte;
    }

    public Double getValorPorPontos() {
        return valorPorPontos;
    }

    public void setValorPorPontos(Double valorPorPontos) {
        VerificarValorNegativo(valorPorPontos);
        this.valorPorPontos = valorPorPontos;
    }
    
	@Override // Implementar o metodo que está indicado na classe pai
	protected Double calcularPagamento() {
				return valorPorPontos*30;
	}

	@Override
	protected Double calculaPatrocinio() {
		Double porcentagemSalario = calcularPagamento() * 0.20;
        Double porcentagemGols = (valorPorPontos * 3) * 0.20;		
        return porcentagemSalario + porcentagemGols;
	}
}