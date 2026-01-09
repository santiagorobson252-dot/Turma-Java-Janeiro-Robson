package codigofonte;

public class Utilitario {

    public void validarIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa!");
        }
    }

    public void validarValorPorPontos(Double valorPorPontos) {
        if (valorPorPontos == null || valorPorPontos < 0) {
            throw new IllegalArgumentException("O valor por pontos não pode ser negativo!");
        }
    }

    public void validarValorPorGols(Double valorPorGols) {
        if (valorPorGols == null || valorPorGols < 0) {
            throw new IllegalArgumentException("O valor por gols não pode ser negativo!");
        }
    }
}