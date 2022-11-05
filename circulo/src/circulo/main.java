package circulo;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		System.out.println("digite a cor: ");
		String cor = scan.next();
		
		System.out.println("digite o radio ");
		double raio = scan.nextDouble();
	
		double area = Math.PI * (Math.pow(raio, 2));
		
		
		Circulo c = new Circulo(cor,raio,area);
		
		System.out.println(c.cor);
		System.out.println(c.raio);
		System.out.println(c.area);
		
		
		
	}
}
