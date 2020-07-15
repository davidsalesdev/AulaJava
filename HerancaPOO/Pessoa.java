package POO;

public class Pessoa {
	
	//atributos
	private	String nome;
	private String endereco;
	private String telefone;
	private String idade;
	private String dataAniv;
	
	
	
	
	public Pessoa (String nome,String endereco,String idade, String dataAniv, String telefone){ //construtor
		
	
		this.nome = nome; 
		this.idade = idade;
		this.dataAniv = dataAniv;
		this.telefone = telefone;
		this.endereco = endereco;
		
	}
	
	
	public Pessoa (String nome,String endereco,String idade, String dataAniv){ //construtor
		
		this.nome = nome; 
		this.idade = idade;
		this.dataAniv = dataAniv;
		this.endereco = endereco;
		
	}
	
	public Pessoa (String nome,String endereco,String idade){ //construtor
		
		this.nome = nome; 
		this.idade = idade;
		this.endereco = endereco;
		
	}
	

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}


	public String getNome(){
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getIdade() {
		return idade;
	}



	public void setIdade(String idade) {
		this.idade = idade;
	}



	public String getDataAniv() {
		return dataAniv;
	}



	public void setDataAniv(String dataAniv) {
		this.dataAniv = dataAniv;
	}
	

 }



