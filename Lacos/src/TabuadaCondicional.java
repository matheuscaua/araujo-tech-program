import java.util.Scanner;

public class TabuadaCondicional {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int valor;
		int calculo;
		
		for (int cond = 0 ; cond <= 0;) {
			System.out.println("Insira o valor desejado: ");
			valor = input.nextInt();

			if (valor > 0 && valor <= 9) {
				for (int i = 0; i <= 10; i++) {
					calculo = valor * i;
					System.out.println(valor + " x " + i + " = " + calculo);
				}
				break;
			} else {
				System.out.println("Valor inválido! ");
			}
		}
	}
}
