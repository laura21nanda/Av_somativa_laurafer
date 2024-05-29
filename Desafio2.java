package AvsomativaLPA;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);//Chamando o Scanner
		double b, h, area;//variaveis para guardar os dados
		//entrada
		System.out.println("Informe o valor da base:");//entrada dos dados 
        b = ler.nextDouble();//Guardando dados na variavel b
        
        System.out.println("Informe o valor da altura:");//entrada dos dados  
        h = ler.nextDouble();//Guardando dados na variavel h
        //processamento
        area = (b*h)/2;//Guardando dados na variavel h
        //saida
        System.out.println("A area do triangulo é: " +area);//Resultado da area
        
	}

}
