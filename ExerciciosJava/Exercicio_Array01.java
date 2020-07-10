package Aulas01;

public class Exercicio_Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

				int [] A = new int[6];
		        int soma = 0;

		        A[0] = 1;
		        A[1] = 0;
		        A[2] = 5;
		        A[3] = -2;
		        A[4] = -5;
		        A[5] = 7;

		        soma = A[0] + A[1] + A[5];

		        System.out.println("Soma das posições: " + soma+"\n");

		        A[3] = 100;

		        for(int i = 0; i < 6; i++) {
		            System.out.println("Valor do vetor na Posição [" + (i + 1) + "]: " + A[i]);
		        }

			}
	}


