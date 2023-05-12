package com.personal.classes;

import java.util.Scanner;

public class InformeUmNumero {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número: ");
		
		
		int number = scan.nextInt();
		System.out.println("O número informado foi: " + number);
		
		
	}

}
