package ExercicioPolimorfismo;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	//Metodos
	public void subirArvore()
	{
		System.out.println("Preguica subindo em arvores!!!...");
	}
	
	public void emitirSom()
	{
		System.out.println("AaaaaaaaaaaHHHHZZZZZZzzZZZZZZZZ");
	}

	public void infopreguica() {
		// TODO Auto-generated method stub
		
		System.out.println(" Dix");
		System.out.println("Nome da preguica"+getNome());
		System.out.println("Idade"+getIdade());
		
		
		
	}
}


