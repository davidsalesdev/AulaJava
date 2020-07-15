package Aulas01;

public class ExercicioRevisao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			double soma = 0;
			int x=1;
			
			for(int x1 = 1; x1 <= 50; x1++) {
			int dvs = x1 * 2 - 1;
			int dvd = x1;
			double parcela = dvs / (double)dvd;
			
			System.out.println("Parcela: " + dvs + "/" + dvd);
			soma = soma + parcela;
			}
			System.out.println("\n A soma foi de: " + soma);
			
		}		
	}


