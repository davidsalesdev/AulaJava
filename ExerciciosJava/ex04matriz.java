package Aulas01;

import java.util.Scanner;

public class ex04matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner entrada = new Scanner (System.in);
			float [][] matriz1 = new float [2][2];
			float [][] matriz2 = new float [2][2];
			float [][] matrizSoma = new float [2][2];
			int l, c=0, opcao;
			
			// matriz 1
			for (l=0; l<matriz1.length; l++)
			{
	 			for (c=0; c<matriz1.length; c++) 
	 				{
	 				System.out.println("Entre com os dados da primeira matriz: "); 
	 				matriz1[l][c] = entrada.nextFloat();
	 				
	 				}
			}
			
			//matriz 2
			for (l=0; l<matriz2.length; l++)
			{
	 			for (c=0; c<matriz2.length; c++) 
	 				{
	 				System.out.println("Entre com os dados da segunda matriz: "); 
	 				matriz2[l][c] = entrada.nextFloat();
	 				
	 				}
			}
			
			System.out.println("Selecione uma opção: \n(1) para soma \n(2) subtração \n(3) adição de const \n(4) imprima o resultado");
			opcao = entrada.nextInt();
			
			if (opcao == 1) 
			{
				for (l=0; l<matrizSoma.length; l++)
				{
		 			for (c=0; c<matrizSoma.length; c++) 
		 				{
		 				
		 				}
				}
				matrizSoma[l][c] = matriz1[l][c] + matriz2[l][c]++; 
				System.out.println("A soma das matrizes resulta em: " +matrizSoma[l][c]);	
			}
	}
}
			
			
			
			
			
				
		