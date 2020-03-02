package com.dailycodingproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DailyOne {

	public static void main(String[] args) {
		
		List<Integer> listaNumeros = new ArrayList<Integer>();
		Scanner numeros= null;
		
		System.out.println("Deseja adicionar quantos números na lista?");
		numeros = new Scanner(System.in);
		int auxNumeros = numeros.nextInt();
		int i = 1;
			
		while(i <= auxNumeros) {
			System.out.println("Informe o " + i + "º número:");
			listaNumeros.add(numeros.nextInt());
			i++;
		}
		
		System.out.println("Informe outro número para verificar se ele é resultado da soma dos números da lista");
		auxNumeros = numeros.nextInt();
		numeros.close();
		
		boolean resultadoSomaNumeros = false;
		int auxPrimeiroNumero = 0;
		int auxSegundoNumero = 0;
		
		for (Integer primeiroNumero : listaNumeros) {
			for (Integer segundoNumero : listaNumeros) {
				if((primeiroNumero + segundoNumero) == auxNumeros) {
					resultadoSomaNumeros = true;
					auxPrimeiroNumero = primeiroNumero;
					auxSegundoNumero = segundoNumero;
				}
			}
		}
		
		if(resultadoSomaNumeros){
			System.out.println(auxNumeros + " é resultado da soma dos números " + auxPrimeiroNumero + " e " + auxSegundoNumero + " da lista");
		}
	}
}
