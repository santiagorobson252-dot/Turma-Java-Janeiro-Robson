package codigofonte;

public class Atleta {

    private String nomeAtleta;
    private int idade;

    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public void setNomeAtleta(String nomeAtletaChegando) {
        this.nomeAtleta = nomeAtletaChegando;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int validaIdade) {
        if (validaIdade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa!!");
        }
        this.idade = validaIdade;
    }
}
