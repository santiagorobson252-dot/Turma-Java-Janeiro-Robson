package projeto3;

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
        Utilitario util = new Utilitario();
        util.VerificarValorNegativo(valorPorPontos);
        this.valorPorPontos = valorPorPontos;
    }

    @Override
    public Double calcularPatrocinio() {
        Double parteBase = valorPorPontos * 0.20;
        Double partePontos = (valorPorPontos * 3) * 0.20;
        return parteBase + partePontos;
    }
}