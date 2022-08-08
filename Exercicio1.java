package ExerciciosJava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		
		int n1,n2,n3,maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");//5
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");//5
		n2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1>=n2 && n1>=n3) {
			maior = n1;
		} else if(n2>=n1 && n2>=n3) {
			maior = n2;
		} else if(n3>=n1 && n3>=n2) {
			maior = n3;
		}
		
		System.out.println("\nO valor maior foi de: "+maior);
	}

}
