package com.dio.calculadora;

import java.util.Scanner;



public class Calculadora {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Digite um valor para a: ");
		int a=input.nextInt();
		System.out.print("Digite um valor para b: ");
		int b= input.nextInt();
		
		int s=soma(a,b);
		int sub=subtracao(a,b);
		int mult=multiplicacao(a,b);
		float div=divisao(a,b);
		
		System.out.println("A soma de "+a+" + "+b+" e igual a: "+s);
		System.out.println("A subtracao entre "+a+" - "+b+" e igual a: "+sub);
		System.out.println("A multiplicacao entre "+a+" x "+b+" e igual a: "+mult);
		System.out.println("A divisao entre "+a+" / "+b+" e igual a: "+div);
		
	}
	
	public static int soma(int a, int b) {
		return a+b;
	}
	public static int subtracao(int a, int b) {
		return a-b;
	}
	public static int multiplicacao(int a, int b) {
		return a*b;
	}
	public static float divisao(int a, int b) {
		return a/b;
	}

}
