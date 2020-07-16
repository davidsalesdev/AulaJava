package ExercicioPolimorfismo;


import java.util.ArrayList;
import java.util.Scanner;


	public class Collection
	{
		public static void main(String [] args)
		
		{	int op;
			Scanner ler = new Scanner(System.in);
			ArrayList estoque = new ArrayList();
			
			
			
			do {
				System.out.println("\n           Digite uma opção: "           );
				System.out.println("----------------------------------------");
				System.out.println("(1)Deseja adicionar produtos ao estoque\n(2)Deseja remover\n(3)Atualizar\n(4)Mostrar todos os produtos do estoque\n(0)Encerrar programa");
				System.out.println("----------------------------------------");
				op = ler.nextInt();
			
				
		
				switch(op)
					{
						case 1:
				
							System.out.print("Digite o produto para adicionar ao estoque:");
							String produto = ler.next();
							estoque.add(produto);
							break;
				
						case 2:
				
							System.out.println("Digite o produto para remover do estoque:");
							String produtor = ler.next();
							estoque.remove(produtor);
							break;
							
						case 3:
							
							System.out.println("Digite o produto que quer atualizar: ");
							String verifica = ler.next();
							System.out.println("Digite o nome do produto que entrará no lugar de "+verifica+":");
							String novo = ler.next();
							
							if(estoque.contains(verifica))
							{
								estoque.remove(verifica);
								estoque.add(novo);
							}
							System.out.println(estoque);
							break;
				
						case 4:
							
							System.out.println(" Os produto  do estoque:");
							System.out.println(estoque);
							break;
							
						default:
							System.out.println("Digite um número válido");
					
						}
			
			}while(op !=0);

		}

		
	}

