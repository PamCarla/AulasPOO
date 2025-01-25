package aulas;
import java.util.Scanner;
public class Funcao1grau {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		
		int a;
		int b;
		int x;
	
		System.out.print("x= ");
		x = ler.nextInt();
		System.out.print("a= ");
		a = ler.nextInt();
		System.out.print("b= ");
		b = ler.nextInt();
		
		double funcao = a * x + b;
		
		System.out.println("f("+x+")="+a+"("+x+") + "+b);
		System.out.printf("f("+x+")=%.0f", funcao);
		  
		
		
		
		
		
		
		
	}

}
