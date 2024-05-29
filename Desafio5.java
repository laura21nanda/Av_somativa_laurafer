package AvsomativaLPA;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		String a[]= new String [6];//Criando uma variavel que guarde 6 dados  

		Scanner ler = new Scanner(System.in);//chamando o Scanner

		for (int i =0; i<6; i++) {//Processamento ue irá se repetir 6 vezes 
			System.out.println("informe o carro da vaga "+ i+":");//entrada de dados 
			a[i]= ler.next();//guardando os dados nas variaveis 

		}
		//saída
		for (int i =0; i<6; i++) {
			System.out.println("o carro "+ a[i] + " esta na posição " + i );

		}

		ler.close();

	}

}
