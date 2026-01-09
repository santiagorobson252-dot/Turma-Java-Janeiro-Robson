package codigofonte;

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
        Utilitario util = new Utilitario();
        util.validarValorPorGols(valorPorGols);
        this.valorPorGols = valorPorGols;
    }
}