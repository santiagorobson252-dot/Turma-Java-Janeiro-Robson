package projeto_12012026;

public class JogadorFutsal extends Atleta {
	
    public JogadorFutsal(long numeroIdenficadorConstrutor) {
		super(numeroIdenficadorConstrutor);
		// TODO Auto-generated constructor stub
	}

	private String pernaMaisForte;
    private Double valorPorGols;
    private int qtdGol ; 

    public String getPernaMaisForte() {
        return pernaMaisForte;
    }

    public void setPernaMaisForte(String pernaMaisForte) {
        this.pernaMaisForte = pernaMaisForte;
    }

    public Double getValorPorGols() {
        return valorPorGols;
    }
    
    public int getQtdGol() {
		return qtdGol;
	}

	public void setQtdGol(int qtdGol) {
		VerificarValorNegativo((double)qtdGol);
		this.qtdGol = qtdGol;
	}


    public void setValorPorGols(Double valorPorGols) {
    	
        VerificarValorNegativo(valorPorGols);     //Chama o método validarValorPorGols do objeto util, 
                                                                                          //passando a variável valorPorGols como parâmetro.
        this.valorPorGols = valorPorGols;
    }   

	@Override
	protected Double calcularPagamento() {
		return valorPorGols*50;
	}

	@Override
	protected Double calculaPatrocinio() {
		Double porcentagemSalario = calcularPagamento() * 0.30;
        Double porcentagemGols = (valorPorGols * 4) * 0.30;
        return porcentagemSalario + porcentagemGols;
	}

	public void setSalario(Double calcularPagamento) {
		// TODO Auto-generated method stub
		
	}

	public void setPatrocinio(Double calculaPatrocinio) {
		// TODO Auto-generated method stub
		
	}
}