package Introducao;

import java.util.Scanner;

public class L1 {

	public static void main(String[] args) {

	Scanner read = new Scanner (System.in);
	
	int a, b, c;
	
	System.out.println("Escreva o primeiro numero: ");
	a = read.nextInt();
	
	System.out.println("Escreva o segundo numero: ");
	b = read.nextInt();
	
	System.out.println("Escreva o terceiro numero: ");
	c = read.nextInt();
	
	if (a>b && a>c)
	System.out.println("Escreva: "+a );
	
	else if (b>a && b>c)
	{
	System.out.println("Escreva:"+b);
	}
	
	else if (c>a && c>b) {
	System.out.println("Escreva: "+c);
	}
	
	}

}
