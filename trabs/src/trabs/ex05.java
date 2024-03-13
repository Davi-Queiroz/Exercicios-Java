package trabs;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double hr_aula, hr_trabalhadas, inss, sal_liq, sal_brut, inss_pago;
		
		System.out.print("Valor da sua hora-aula: R$ ");
		hr_aula=teclado.nextDouble();
		System.out.print("Horas Trablahadas: ");
		hr_trabalhadas=teclado.nextDouble();
		System.out.println("PORCENTAGEM de descontada do INSS: ");
		inss=teclado.nextDouble();
		
		sal_brut= hr_aula * hr_trabalhadas;
		inss_pago=sal_brut * (inss/100);
		sal_liq=sal_brut - inss_pago;
		
		System.out.println("Salario bruto: R$" + sal_brut);
		System.out.println("INSS pago: R$" + inss_pago);
		System.out.println("Salario liquido: R$" + String.format("%.2f", sal_liq));
		
		
	}

}
