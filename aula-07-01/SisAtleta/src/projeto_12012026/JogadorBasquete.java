package projeto_12012026;

public class JogadorBasquete extends Atleta {

    public JogadorBasquete(long numeroIdentificador) {
		super(numeroIdentificador);
		// TODO Auto-generated constructor stub
	}

	private String bracoMaisForte;
    private Double valorPorPontos;
	private int quantidadePontos;


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
    
    public int getQuantidadePontos() {
		return quantidadePontos;
	}

	public void setQuantidadePontos(int qntPontos) {
		VerificarValorNegativo((double) quantidadePontos);
		this.quantidadePontos = qntPontos;
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

	public void setSalario(Double calcularPagamento) {
		// TODO Auto-generated method stub
		
	}

	public void setPatrocinio(Double calculaPatrocinio) {
		// TODO Auto-generated method stub
		
	}
}