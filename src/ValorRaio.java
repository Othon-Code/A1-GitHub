import java.util.Locale;
import java.util.Scanner;

public class ValorRaio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		double raio, area;
		
		System.out.println("Entre com o raio: ");
		raio = sc.nextDouble();
		area = Math.PI * Math.pow(raio, 2.0);
		System.out.println();
		System.out.printf("A área é de: %.4f%n", area);
		
		
		
		
		
		
		
		
		
		
	}

}
