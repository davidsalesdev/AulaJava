package Aulas01;

import java.util.Scanner;

public class ExercicioArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		int [] numero = new int[6];
		int somapar=0,qntimpar=0,i;
		
		for (i=0; i <6; i++) {
			
			System.out.println("Digite um número: ");
			numero[i] = ler.nextInt();
			
			if(numero[i]%2==0) {
				
				System.out.println("Números pares:"+numero[i]);
				somapar = somapar+numero[i];	
			}
			
			else 
			{
				System.out.println("Números impares:"+numero[i]);
				qntimpar++;
			}
		}
			System.out.println("Resultado da soma dos numeros pares:"+somapar);
			System.out.println("Quantidade de numeros impares:"+qntimpar);
		}	
	}

