package trabs;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double fah, celsius;
		System.out.println("Digite os graus celcius");
		celsius = teclado.nextDouble();
		fah = celsius * 9/5 + 32;
		System.out.println(fah);	
		
		
	}
	
}
