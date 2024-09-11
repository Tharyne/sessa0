package sassa0;

import java.util.Scanner;

public class nivelamentoSessao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner ler = new Scanner(System.in);
		a = 10;
		System.out.println("digite um numero");
		b = ler.nextInt();
		c = a/ b;
		System.out.println("O valor de C é " + c);
		
		ler.close();


	}

}
