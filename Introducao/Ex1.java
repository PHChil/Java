package Introducao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	
	int dia, mes, anos, resultado;
	
	
	System.out.println("Digite quantos anos voc� tem: " );
	anos = read.nextInt();
	System.out.println("Voc� tem "+anos+" anos e quantos meses: ");
	mes = read.nextInt();
	System.out.println("Voc� tem" +anos+ " anos," +mes+ " meses e quantos dias: ");
	dia = read.nextInt();
	resultado = anos*365 +mes*30+dia;
	System.out.println("Voc� tem: "+resultado+" dias de vida");
	
	
	
	
	
	
	
	
	
			
			


	}

}
