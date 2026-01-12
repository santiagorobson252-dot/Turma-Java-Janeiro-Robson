package projeto4;

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
    public Double calcularPatrocinio() {
        Double parteBase = valorPorGols * 0.30;
        Double parteGols = (valorPorGols * 4) * 0.30;
        return parteBase + parteGols;
    }

	@Override
	protected Double calcularPagamento() {
		return valorPorGols*50;
	}
}