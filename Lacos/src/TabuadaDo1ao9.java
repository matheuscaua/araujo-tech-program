
public class TabuadaDo1ao9 {

	public static void main(String[] args) {
		
		
		
		int calculo;
		for(int i = 0; i <= 9; i++) {
			System.out.println("--------------");
			for(int o = 0; o < 10; o++) {
				calculo = i * o;
				System.out.println(i + " x " + o + " = " + calculo);
			}
		}
	}

}
