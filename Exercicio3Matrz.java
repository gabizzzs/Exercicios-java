package ExerciciosJava;

import java.util.Scanner;

public class Exercicio3Matrz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int i,j,total=0,num=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println("\nEntre com um número: ");
				matriz[i][j] = leia.nextInt();
				
				if(matriz[i][j] > 10) {
					total++;
				}
			}
			
		}
		
		System.out.println("\nOs valores maior que 10 foram: ");
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(matriz[i][j] > 10) {
					System.out.println("\n"+matriz[i][j]);
				}
			}
		}
		
		System.out.println("\nA quantidade de números maior que 10 foram: "+total);
		
		
		

	}

}
