package trabs;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double tempo, vel, consumo, distancia;
		
		System.out.print("Digite sua velocidade media: ");
		vel = teclado.nextDouble();
		System.out.print("Digite as horas gastas:");
		tempo=teclado.nextDouble();
		
		distancia = tempo * vel;
		consumo= distancia/10.5;
		System.out.println("Voce gastou " + consumo + "L de gasolina");
	}
}
