package Introducao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	
	int idd, idm, ida, res;
	
	System.out.println("Escreva sua idade em dias: ");
	idd = read.nextInt();
	
	
	idm = idd/30;
	ida = idd/365;
	System.out.println("Você tem " +ida+ " anos de vida e "+idm+ " meses.");
	
	

			
	
	
	

	}

}
