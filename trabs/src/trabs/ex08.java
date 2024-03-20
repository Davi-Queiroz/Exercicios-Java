package trabs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		String dig1;

		System.out.println("Digite um numero de 3 caracter");
		num1 = teclado.nextInt();
		
		dig1 = Integer.toString(num1);
		char valor = dig1.charAt(1);
		System.out.println("O caractere na posição 3 é: " + valor);
		DecimalFormat mascara = new DecimalFormat();
	}

}
