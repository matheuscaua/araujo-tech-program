import java.util.Scanner;

public class LacoFor {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int valor;
		int calculo;
		
		System.out.println("Insira o valor desejado: ");
		valor = input.nextInt();
		for(int i = 0; i <= 10; i++) {
			calculo = valor * i;
			System.out.println(valor + " x " + i + " = " + calculo);
		}
	}
}
