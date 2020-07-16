package ExercicioPolimorfismo;

public class Cavalo extends Animal {
	
	
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	//Metodos
	public void correr()
	{
		System.out.println("Cavalo correndo pocoto pocoto pocoto...");
	}
	
	public void emitirSom()
	{
		System.out.println("IRRRIINN");
	}

	public void infocavalo() {
		// TODO Auto-generated method stub
		
		System.out.println(" CAVALOOOOOOOO ");
		System.out.println("Nome do cavalinho braboo"+getNome());
		System.out.println("Idade"+getIdade());
		
		
	}
}