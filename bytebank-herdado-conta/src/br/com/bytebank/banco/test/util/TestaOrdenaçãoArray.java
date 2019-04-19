package br.com.bytebank.banco.test.util;

import java.util.Arrays;

public class TestaOrdenaçãoArray {

	public static void main(String[] args) {
		int[] numeros = new int[] {1,5,6,7,8,0};
		Arrays.sort(numeros); //método utilitário sort
		
		System.out.println(Arrays.toString(numeros));
		System.out.println("-----------");
		System.out.println(numeros);
		
	}

}
