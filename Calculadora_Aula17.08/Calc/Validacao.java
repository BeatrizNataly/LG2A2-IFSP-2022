package Calc;

public class Validacao {
	public boolean isOpcaoValida(int op) {
		if (op == 0) {
			System.out.println("Programa encerrado.");
			return false;
			
		} else if (op > 4 || op < 0) { // range de opções de escolha válidas
			System.out.println("Digite uma opção válida.");
			return false;
	}
		return true;
}
}