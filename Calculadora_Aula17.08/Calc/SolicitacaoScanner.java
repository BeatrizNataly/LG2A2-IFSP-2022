package Calc;

import java.util.Scanner;

public class SolicitacaoScanner {
	
	private static int valInt1, valInt2;
	private static double valDouble1, valDouble2;

	public static void pedirUmValorDecimal(Scanner sc) {
		System.out.println("Digite o valor: ");
		valDouble1 = sc.nextDouble();
	}
	
	public static void pedirDoisValoresDecimal(Scanner sc) {
		System.out.println("Digite o primeiro valor: ");
		valDouble1 = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		valDouble2 = sc.nextDouble();
	}
	
	public static void pedirUmValorInteiro(Scanner sc) {
		System.out.println("Digite o valor inteiro: ");
		valInt1 = sc.nextInt();
	}
	
	public static void pedirDoisValoresInteiro(Scanner sc) {
		System.out.println("Digite o primeiro valor inteiro: ");
		valInt1 = sc.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		valInt2 = sc.nextInt();
	}
	
	public static int getInteiro1() {
		return valInt1;
	}
	
	public static int getInteiro2() {
		return valInt2;
	}
	
	public static double getDecimal1() {
		return valDouble1;
	}
	
	public static double getDecimal2() {
		return valDouble2;
	}

	public static void limpaValorVariaveis(){
		valDouble1 = 0;
		valDouble2 = 0;
		valInt1 = 0;
		valInt2 = 0;
	}
}
