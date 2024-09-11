package sassa0;

import java.util.Scanner;

public class sessao02 {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner ler = new Scanner(System.in);
		a = 10;
		System.out.println("digite um numero");
		b = ler.nextInt();
		try {
		//c = a/ b;
		//System.out.println("O valor de C é " + c);
		}catch (ArithmeticException erro) {
			System.out.println("nao existe divisao por zero");
			
			ler.close();
		}

	}

}
