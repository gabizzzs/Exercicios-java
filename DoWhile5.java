package ExerciciosJava;

import java.util.Scanner;

public class DoWhile5 {

	public static void main(String[] args) {
		
		int n,soma=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\nEntre com um número do teclado: ");
			n = ler.nextInt();
			soma += n;
		} while (n != 0);
		
		System.out.println("\nO somatório é: "+soma);
	}

}
