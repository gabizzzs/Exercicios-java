package ExerciciosJava;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		
		int idade,totalj=0,totalv=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nQual a sua idade: ");
		idade = ler.nextInt();
		
		while(idade != -99) {
			if(idade < 21) {
				totalj++;
			} else if(idade >50) {
				totalv++;
			} else;
			
			System.out.println("\nQual a sua idade: ");
			idade = ler.nextInt();
		}
		
		System.out.println("\nO total de pessoas com menos de 21 anos é: "+totalj);
		System.out.println("\nO total de pessoas com mais de 50 anos é: "+totalv);
		

	}

}
