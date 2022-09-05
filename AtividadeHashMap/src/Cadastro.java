import java.util.HashMap;
import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> cadastro = new HashMap<>();
		String nome;
		String email;
		int opcao = 0;
		System.out.println("- Digite 1 para Cadastro -");
		System.out.println("- Digite 2 para visualizar os cadastros -");
		System.out.println("- Digite 3 para excluir ");
		System.out.println("- Para sair digite 4 -");
		
		
		
		System.out.print("Opção desejada: ");
		opcao = input.nextInt();
		while (opcao != 4) {
			switch (opcao) {
			case 1:
				System.out.println("Nome: ");
				nome = input.next();
				System.out.println("Email: ");
				email = input.next();
				cadastro.put(nome, email);
				break;
			case 2:
				if (cadastro.size() == 0) {
					System.out.println("Está vazio! Não há cadastros!");
				} else {
					System.out.println(cadastro);
				}
				break;
			case 3:
				System.out.println("Cadastro a ser excluído: ");
				nome = input.next();
				cadastro.remove(nome);
				break;

			}
			System.out.println("Escolha novamente a opção desejada: ");
			opcao = input.nextInt();
			if(opcao == 4) {
				System.out.println("Saindo...");
			}
		}
	}
}
