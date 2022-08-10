package ExerciciosJava;

import java.util.Scanner;

public class Exercicio2Vetor {

	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		int somaPares=0,somaImpares=0,numPares=0,numImpares=0,x;
		
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("\nEntre com um número: ");
			vetor[x] = leia.nextInt();
			if(vetor[x] %2==0) {
				somaPares++;
			}
			else {
				somaImpares++;
			}
		}
		
			
		System.out.println("\nA soma dos pares são: "+somaPares);
		System.out.println("\nA soma dos impares são: "+somaImpares);
	}

}
