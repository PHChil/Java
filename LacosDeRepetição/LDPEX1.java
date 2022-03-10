package LacosDeRepetição;

import java.util.Scanner;

public class LDPEX1 {

	
	public static void main(String[]args) {
		Scanner leia  = new Scanner(System.in);
		
		
		int nEntrevistados;
		int salario= 0;
		int totalSal= 0;
		int numFilhos;
		int salX= 0;
		int totalFilhos= 0;
		int mediaFilhos;
		int mediaSalario;
		int maiorSala= 0;
		int mediaSal;
		int porcentagem;
		System.out.println("Digite o numero de entresvistados: ");
		nEntrevistados = leia.nextInt();
		
		
		for(int x=0; x<=nEntrevistados;x++)
		{
			
		
			System.out.println("Digite seu salario: ");
			salario = leia.nextInt();
			
			
			System.out.println("Digite o numero de filhxs: ");
			numFilhos = leia.nextInt();
					
			
			if(salario<100) {
					salX= salX+1;
			
			}
			totalFilhos = totalFilhos + numFilhos;
			totalSal = totalSal + salario;
			}
	
			if (salario > maiorSala) 
			maiorSala = salario;
	
			mediaSal = totalSal/nEntrevistados;
			System.out.println("A média do salário entrevistados é: "+mediaSal+"R$");
			mediaFilhos = totalFilhos/nEntrevistados+1;
			System.out.println("A média de filhos é= "+mediaFilhos+"por entrevistado.");
			porcentagem = ((salX*100)/nEntrevistados+1);
	
			System.out.println("O maior salário é: "+maiorSala);
			System.out.println("A porcetagem de pessoas que recebem menos de 100R$ é"+porcentagem+"%");
					
	}
			
	
	
	
	
	
	}
	

