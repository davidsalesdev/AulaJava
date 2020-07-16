package ExercicioPolimorfismo;


	public class Cachorro extends Animal {
		//Construtor
		public Cachorro(String nome, int idade) {
			super(nome, idade);
			// TODO Auto-generated constructor stub
		}
		public void emitirSom()
		{
			System.out.println("Au,Au,Au, AUuuuuuuuuuuuuuuuuuuuuuuuuuu!!");
		}
		public void correr() 
		{
			System.out.println("O cachorro está correndo :) !!");
		}
		public void dadosCachorro() {
			// TODO Auto-generated method stub
			
			System.out.println(" CACHORRO ");
			System.out.println("Nome do cachorro"+getNome());
			System.out.println("Idade"+getIdade());
			
		}
	
	}

