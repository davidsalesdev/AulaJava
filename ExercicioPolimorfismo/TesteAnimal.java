package ExercicioPolimorfismo;

public class TesteAnimal {
	
	public static void main (String [] args) {
		
		//info dog
		Cachorro dog = new Cachorro("LOGANNNNN",3);
		dog.dadosCachorro();
		dog.correr();
		dog.emitirSom();
	
		
		//info horse
		Cavalo horse = new Cavalo ("ZEUSSSS",2);
		horse.infocavalo();
		horse.correr();
		horse.emitirSom();
		
		
		//info preguica
		Preguica p = new Preguica ("Dix",2);
		p.infopreguica();
		p.subirArvore();
		p.emitirSom();
		
	}

}
