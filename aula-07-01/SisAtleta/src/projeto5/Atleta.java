package projeto5;

public abstract class Atleta {

    private String nomeAtleta;
    private int idade;
   
    //Polimorfismo
    protected abstract Double calcularPagamento();                
    protected abstract Double calculaPatrocinio();               

    public void VerificarValorNegativo(double valor) { //Aqui é mantido a herança para a filhas
        if (valor < 0) {
            throw new IllegalArgumentException("Valor digitado não pode ser negativo");
        }
    }
    
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