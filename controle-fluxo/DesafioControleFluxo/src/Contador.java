import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {

			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {

			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		// Validar se o segundo parâmetro é maior que o primeiro
		if (parametroDois <= parametroUm) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
			System.out.printf("Imprimindo o numero %d\n", i+1);
        }
		//realizar o for para imprimir os números com base na variável contagem
	}
}