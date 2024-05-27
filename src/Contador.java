import java.util.Scanner;

class ParametrosInvalidosExceptions extends Exception{
	public ParametrosInvalidosExceptions(String message){
		super(message);
	}
}


public class Contador {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosExceptions message) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("Erro : " + message.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExceptions {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois){
			throw new ParametrosInvalidosExceptions("O segundo parâmetro deve ser MAIOR que o primeiro");
		}

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for (int i=1; i <= contagem; i++){
			System.out.println("Imprimindo o número : " + (parametroUm + i));
		}
	}
}
