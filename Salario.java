package salario;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		System.out.println("Digite o valor do seu salario por hora: ");
		
		Scanner input = new Scanner(System.in);
		
		double valorHora = input.nextDouble();
		
		System.out.println("Digite o n�mero de horas trabalhadas no m�s: ");
		
		double horasMes = input.nextDouble();
		
		double salario = horasMes*valorHora;
		
		System.out.println("O sal�rio deste m�s �: " + salario);
		
		
		input.close();
		

	}

}
