package ExerciciosJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme sua idade: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14) {
			System.out.println("\nVocê é do infantil!!");
		} else if (idade>=15 && idade<=17) {
			System.out.println("\nVocê é do juvenil!!");
		} else if (idade>=18 && idade<=25) {
			System.out.println("\nVocê é adulto!!");
		} else {
			System.out.println("\nIdade inválida.");
		}
		

	}

}
