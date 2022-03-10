package LacosDeRepetição;

import java.util.Scanner;

public class LDPEx3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	
	int x=0;
	int xMed;
	int xTotal=0;
	int xSoma=0;
	int xx=0;
	
	
	
	while(x>=0) {
			System.out.println("Digite o valor de x: ");
			x = leia.nextInt();
			
			
			xSoma = xSoma+1;
			xTotal = xTotal + x;
			xMed = xTotal / xSoma;
			System.out.println("O valor total de X é: "+xTotal);
			System.out.println("O valor total de numeros somados foram: "+xSoma);
			System.out.println("A média dos numeros somados: "+xMed);
		
			
		}
		
	}
}


