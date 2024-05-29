package AvsomativaLPA;

import java.util.Scanner;//

public class Desafio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);//Chamando o Scanner

		double a, b, soma, multi, sub, div;//variaveis para guardar os dados
		
		//Entrada de dados
		System.out.println("Digite o primeiro valor: ");//entrada dos dados 
		a = ler.nextDouble();//Guardando dados na variavel a

		System.out.println("Digite o segundo valor: ");//Entrada dos dados
		b = ler.nextDouble();//Guardando dados na variavel b
		
		//Processamento
		soma = a+b; //somando variavel a com a b 
		multi = a*b;//multiplicando variavel a com a b 
		sub = a-b;//subtraindo variavel a com a b 
		div = a/b;//dividindo a variavel a com a b
		
		//Saída
		System.out.println("O resultado da soma é : " +soma);//resultado da soma
		System.out.println("O resultado da multiplicação é : "+multi);//resultado da multiplicacao
		System.out.println("O resultado da subtração é : " +sub );//resuldado da subtracao
		System.out.println(" O rusultado da divisão é : "+div);//resultado da divisao

	}

}
