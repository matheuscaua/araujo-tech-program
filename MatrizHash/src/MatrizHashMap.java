import java.util.HashMap;

public class MatrizHashMap {
	public static void main(String[] args) {
		HashMap<String, String> cadastro = new HashMap<>();
		//Adciona INSERT	
		cadastro.put("Matheus", "matheus@teste.com");
		cadastro.put("Pedro", "pedro@teste.com");
		//Retorna o registro
		System.out.println(cadastro.get("Matheus"));
		//Remove
		cadastro.remove("Matheus");
		
		System.out.println(cadastro);
		
		//Mostra quantidade
		
		System.out.println(cadastro.size());
	}
}
