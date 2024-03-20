package trabs;

import java.util.Scanner;

public class ex082 {
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			int num1;
			System.out.println("Digite um numero de 3 caracter");
			num1 = teclado.nextInt();
			
			num1 = (num1%100)/10;
			System.out.println(num1);
			

}
		}
