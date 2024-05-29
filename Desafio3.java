package AvsomativaLPA;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);//Chamando o Scanner
		 
		int dia;//variaveis para guardar os dados
		
		System.out.println("Informe o dia: ");//entrada dos dados 
		dia = ler.nextInt();
		//Processamento e saida se verdadeiro 
		if (dia == 1) {//verificando se a informacao e verdadeira
			System.out.println("Domingo");
		}
		//Processamento e saida se verdadeiro 
		else if (dia == 2) {//verificando se a informacao e verdadeira
			System.out.println("Segunda-Feira");
		}
		//Processamento e saida se verdadeiro 
		else if (dia == 3) {//verificando se a informacao e verdadeira
				System.out.println("Terça-Feira");
		}
		//Processamento e saida se verdadeiro 
		else if (dia == 4) {//verificando se a informacao e verdadeira
			System.out.println("Quarta-Feira");
		}
		//Processamento e saida se verdadeiro 
		else if (dia == 5) {//verificando se a informacao e verdadeira
			System.out.println("Quinta-Feira");
		}
		//Processamento e saida se verdadeiro 
		else if (dia == 6) {//verificando se a informacao e verdadeira
			System.out.println("Sexta-Feira");
		}
		//Processamento e saida se verdadeiro 
		else if (dia == 7) {//verificando se a informacao e verdadeira
			System.out.println("Sábado");
		}
		//Processamento e saida se verdadeiro 
		else {
			System.out.println("Dia inválido");
		}
		ler.close();
	    }

}
