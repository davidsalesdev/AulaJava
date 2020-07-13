package Aulas01;

public class Cliente {
	
	private String nomeCliente;
	private String alturaDoCliente;
	private int idadeCliente;
	private int pesoDoCliente;
	private String corDosOlhos;
	
	
	
	
	public Cliente(String nome,String altura,int idade, int peso, String olhos) {
		
		 this.nomeCliente = nome;
		 this.idadeCliente = idade;
		 this.alturaDoCliente = altura;
	     this.pesoDoCliente = peso;	
	     this.corDosOlhos = olhos;
	     
	}
	    
	
	
	
	public String getcorDosOlhos() {
		
		return corDosOlhos; 
	
	}
		
	
	public int getIdadeCliente() {
		
		return idadeCliente; 
	
	}
	
	public String getNomeCliente() {
		
		 return nomeCliente; 
	}
	
	public String getAlturaDoCliente() {
		
		 
		 return alturaDoCliente; 
	}

	public int getpesoDoCliente() {
		
		 return pesoDoCliente; 
	
	}




	@Override
	public String toString() {
		return "Cliente\n \nnomeCliente = " + nomeCliente + "\nalturaDoCliente = " + alturaDoCliente + "\nidadeCliente = "
				+ idadeCliente + "\npesoDoCliente = " + pesoDoCliente + "\ncorDosOlhos = " + corDosOlhos + "";
	}








	
	
	/*public void getInfoCliente() {

		return nomeCliente+" "+idadeCliente+" "+AlturaDoCliente+" "+pesoDoCliente;*/
	

	
	
	
}

	
	
	
	

