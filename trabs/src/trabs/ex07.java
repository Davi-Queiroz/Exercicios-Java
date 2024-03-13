package trabs;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1, res;
		
		System.out.println("Digite o valor de X: ");
		num1 = teclado.nextDouble();
		
		res= Math.sqrt(1 + Math.pow((Math.pow(num1,4)-1)/2*Math.pow(num1,2),2)) - (Math.pow(num1,2)/2);

		System.out.println("Resultado "+res);
	}

}
