package projeto5;

public class JogadorFutsal extends Atleta {

    private String pernaMaisForte;
    private Double valorPorGols;

    public String getPernaMaisForte() {
        return pernaMaisForte;
    }

    public void setPernaMaisForte(String pernaMaisForte) {
        this.pernaMaisForte = pernaMaisForte;
    }

    public Double getValorPorGols() {
        return valorPorGols;
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
}