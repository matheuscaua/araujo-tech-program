import java.util.Scanner;

public class Vendas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		double valorUnitario;
		int quantidade;
		int anoVencimento;
		int anoAtual;
		
		System.out.println("Nome do remédio: ");
		nome = input.next();
		System.out.println("Valor unitário: ");
		valorUnitario = input.nextDouble();
		System.out.println("Quantidade: ");
		quantidade = input.nextInt();
		System.out.println("Ano de Vencimento: ");
		anoVencimento = input.nextInt();
		System.out.println("Ano atual: ");
		anoAtual = input.nextInt();
		
		
		double totalCompra = quantidade * valorUnitario;
		
		int vencimento = anoVencimento - anoAtual;
		
		
		System.out.println("Nome do Remédio: " + nome);
		System.out.println("Total: " + totalCompra);
		
		if(vencimento < 0) {
			System.out.println("Produto Vencido!");
		}else {
			System.out.println("Produto Não Vencido!");
			System.out.println("Anos para vencimento: " + vencimento);
		}
		
	}
}
