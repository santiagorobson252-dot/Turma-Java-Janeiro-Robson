package projeto3;

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
    	
        Utilitario util = new Utilitario();                        //Instanciando o objeto
        util.VerificarValorNegativo(valorPorGols);     //Chama o método validarValorPorGols do objeto util, 
                                                                                          //passando a variável valorPorGols como parâmetro.
        this.valorPorGols = valorPorGols;
    }

    @Override
    public Double calcularPatrocinio() {
        Double parteBase = valorPorGols * 0.30;
        Double parteGols = (valorPorGols * 4) * 0.30;
        return parteBase + parteGols;
    }
}