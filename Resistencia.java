package aulas;
import java.util.Scanner;
public class Resistencia {
	public static void main (String [] args) {
		double r1;
		double r2;
		double r3;
		double r4;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Escreva os valores");
		r1 = ler.nextDouble();
		r2 = ler.nextDouble();
		r3 = ler.nextDouble();
		r4 = ler.nextDouble();
		
		double resistencia_total = r1 + r2 + r3 + r4;
		System.out.printf("A resistência total é %f.", resistencia_total);
		
		
	}

}
