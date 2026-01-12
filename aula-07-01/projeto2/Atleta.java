package projeto2;

public  abstract class Atleta { 
	//abstract:
	//Indica que a classe não pode ser instanciada.
	//“Toda classe que for um Atleta TEM que seguir regras.”
	//Agora TODA classe filha é obrigada a dizer como treina:
	//Serve para obrigar as filhas a implementar métodos

    private String nomeAtleta; //String é um tipo de variavel que armazena uma cadeia de caracteres
    private int idade; //int é um tipo de variavel que armazena numeros inteiros
   //Utilizando "private" os atributos só podem ser acessados dentro dessa classe, podendo ser acessado somente por metodos.
    
    public String getNomeAtleta() {
    		
    	return nomeAtleta;
    		                                                             //é um método que retorna o valor de um atributo.
    }		                                                             //public--> Visibilidade publica
        	                                                             //String--> retorna obrigatoriamente um string 
        	                                                             //getNomeAtleta--> Nome do metodo
        	                                                             //()--> Não recebe nada como parametro
        	                                                             //return = indica qual valor será retornado    	

    
    				
    public void setNomeAtleta(String nomeAtletaChegando) {
    		
    	this.nomeAtleta = nomeAtleta;	
    		                                                            //é um método usado para obter (ler) o valor de um atributo de uma classe
    } 		                                                           //public--> Visibilidade publica
        	                                                          //void--> Não retorna nada 
        	                                                          //setNomeAtleta--> Nome do metodo
        	                                                         //String nomeAtletaChegando--> Parametro recebidos por quem chama o metodo
        	                                                        //this.nomeAtleta = nomeAtleta--> Ações do metodo
    	   
    public int getIdade() {    	
		return idade;  	

}
				
    public void setIdadeAtleta(int validaIdade) {
    	
    	if (validaIdade < 0) {
         
    		throw new IllegalArgumentException("A idade não pode ser negativa!!");
      
    	}
    	
		this.idade = validaIdade;	
	
	
}
    	
}
