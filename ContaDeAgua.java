package aulas;
import java.util.Scanner;
public class ContaDeAgua {

	public void main(String [] args){
		
		double consumo, preco_total, preco_fixo, desconto, consumo_total;
		double taxa, preco_ativado;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("----- Sistema de Cobrança de Água -----");
		System.out.println(" Digite o valor consumido: ");
			consumo = ler.nextDouble();
		
		  preco_total = 0;
		  preco_fixo = 0;
		  desconto = 0;
		  consumo_total = 0;
		  taxa = 0;
		  preco_ativado = 0;
		
		if(consumo <=10){
		  preco_total = 7;
		  preco_fixo = 7;
		  consumo_atual = consumo;
		}
		
		if((consumo <= 10) && (consumo <= 30)){
		    preco_fixo = 7;
		    desconto = 10;
		    taxa = 1;
		}
		
		if((consumo > 30) && (consumo <= 100)){
		    preco_fixo = 7 + 20;
		    desconto =  30;
		    taxa = 2;
		}
		
		if(consumo > 100){
		  preco_fixo = 7 + 20 + 140;
		  desconto = 100;
		  taxa = 5;
		}
		
		consumo_atual = consumo_desconto;
		preco_ativado = taxa * consumo_atual;
		preco_total = preco_fixo + preco_ativado;
		
		System.out.println("Preço total a ser pago: " + preco_total);
		  
				
		
		
		
	}
}
