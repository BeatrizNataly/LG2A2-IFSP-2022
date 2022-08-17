package Calc;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double num1, num2 = 0;
		int op = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Insira a operação:");
			System.out.println("1. Adição");
			System.out.println("2. Subtração");
			System.out.println("3. Multiplicação");
			System.out.println("4. Divisão");
			System.out.println("0. Encerrar");

			op = sc.nextInt();
				
			if(new Validacao().isOpcaoValida(op)){
				SolicitacaoScanner.pedirDoisValoresDecimal(sc);
				Calculadora calc = new Calculadora(op);
				System.out.println("O resultado é " + calc.getResult());
				SolicitacaoScanner.limpaValorVariaveis();
			}
			
		} while (op != 0);
		
		sc.close();

	}

}
