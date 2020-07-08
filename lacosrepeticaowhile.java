package Aulas01;

import java.util.Scanner;

public class lacosrepeticaowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner ler = new Scanner (System.in);
			
			int idade=0, totalmenor=0,totalmaior=0;
			
			System.out.printf("Digite a sua idade: ");
			idade = ler.nextInt();
			
			
			while(idade == -99) {
			
			//for(int i =0; i < 5; i++) {
				
			
			if(idade <= 21) {
			
				totalmenor++;
			}
			
			if (idade >= 50) {
				
				totalmaior++;
			}
		      System.out.println("Digite  a sua  idade: ");
              idade = ler.nextInt();

			}

			System.out.println("\n Menores de 21 anos: " + totalmenor);
			System.out.println("\n Maiores de 50 anos: " + totalmaior);
  }

}
