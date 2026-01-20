package projeto_12012026;

public abstract class Atleta {

	private long numeroIdentificador;
	private String nomeAtleta;
    private int idade;
	private long identificador;

   
    protected abstract Double calcularPagamento();                
    protected abstract Double calculaPatrocinio();               

    public void VerificarValorNegativo(double valor) { 
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
    
	public long getIdentificador() {
		return identificador;
	}

	public Atleta(long identificador) {
		super();
		this.identificador = identificador;
	}


}