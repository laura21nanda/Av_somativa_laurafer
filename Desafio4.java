package AvsomativaLPA;
import java.util.Scanner;
public class Desafio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);//Chamando o Scanner
		int valores[] = new int[15];//criando  para guardar os dados digitados
		int soma = 0;//criando uma variavel para guardar 15 dados
		
		//Entrada
		for (int i =0;i<15; i++) {//processamento que ira se repitir 15 vezes 
		System.out.print("Informe um valor "+i+":");//entrada de dados
		valores[i]=ler.nextInt();//guardando valores nas variavis 
		}
		for (int valor : valores) {//processamento
		soma += valor;//Soma de todos os dados digitatos
		}
		//Saída
			System.out.print("A soma de todos os valores é : "+soma);


	}

}
