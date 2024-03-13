package trabs;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double kw, cash, conta, dis_conta;
		
		cash = 1.412;
		System.out.print("Quantos KW foram gastos: ");
		kw = teclado.nextDouble();
		System.out.println("Um quilowatts custa R$2,01");
		conta = kw * 2.01;
		System.out.println("Sua conta vai custar R$" + conta);
		dis_conta= conta - (conta/9);
		System.out.println("Sua conta com 10% de desconto da R$" + dis_conta);
		
	}

}
