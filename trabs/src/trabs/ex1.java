package trabs;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double base, altura, area, perimetro;
		
		
		System.out.print("Qual a ALTURA do retangulo: ");
		altura = teclado.nextDouble();
		System.out.print("Qual a BASE do retangulo: ");
		base = teclado.nextDouble();
		
		perimetro = (altura + base)*2;
		area= altura*base;
		System.out.println("Perimetro: " + perimetro);
		System.out.print("Area:" + area);
	}

}
