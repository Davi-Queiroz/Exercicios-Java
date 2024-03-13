package trabs;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1, res;
		
		System.out.println("Digite o valor de X: ");
		num1 = teclado.nextDouble();
		
		res = Math.sqrt(Math.cbrt(num1- (1/2)));
		System.out.println("Resposta: "+ String.format("%.2f", res));
	}

}
