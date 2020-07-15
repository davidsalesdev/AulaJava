package Aulas01;

public class produtoEletronico {
	
	private String marcaDaTv;
	private String cor;
	private String certificacao;
	private String tamanho;
	
	
	public produtoEletronico(String lg, String preta, String anatel, String grande) {
	
	
		this.marcaDaTv = lg;
		this.cor = preta;
		this.certificacao = anatel;
		this.tamanho = grande;
	}

	
	public String getmarcaDaTv() {
		 return marcaDaTv; 
		
	}

	public String getcor() {
		 return cor; 
		
	}
	
	public String getcertificacao() {
		 return certificacao; 
		
	}
	
	public String gettamanho() {
		 return tamanho; 
		
	}


	@Override
	public String toString() {
		return "produtoEletronico \nmarcaDaTv = " + marcaDaTv + "\ncor = " + cor + "\ncertificacao = " + certificacao
				+ "\ntamanho = " + tamanho + "";
	}
	   
	
}


