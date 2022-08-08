package ExerciciosJava;

import java.util.Scanner;

public class Exercicio4introducao {

	public static void main(String[] args) {
		
		int a,b,c;
		float d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		c = leia.nextInt();
		
		d = (float) (Math.pow((a+b),2) + Math.pow((b+c),2))/2;
		
		System.out.println("\nO valor de D é: "+d);

	}

}
