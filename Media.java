package calculos;
import java.util.Scanner;
public class Media {
	public static void main (String [] args) {
		double n1;
		double n2;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo para calcular a média entre dois números!");
		System.out.println("Digite o primeira nota: ");
		n1 = ler.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextDouble();
		 
		double media = (n1 + n2) / 2;
		
		System.out.printf("O valor da média é: %f.", media);
	}

}
