package Exercicios;

import java.util.Scanner;

public class InfNum {

	public int infNumInt() {
		System.out.print("Informe um número inteiro: ");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		return num;
	}
	public int infNumIntM(String texto) {
		System.out.print(texto);
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		return num;
	}
	
	public float infNota() {
		System.out.print("Informe uma nota: ");
		Scanner entrada = new Scanner(System.in);
		float num = entrada.nextFloat();
		return num;			
	}
	
	public float infFloat(String texto) {
		System.out.print(texto);
		Scanner entrada = new Scanner(System.in);
		float num = entrada.nextFloat();
		return num;			
	}
	
	public float infNotaNumerada(int posicao) {
		System.out.print("Informe a " + posicao +"ª nota: ");
		Scanner entrada = new Scanner(System.in);
		float num = entrada.nextFloat();
		return num;		
	}

	public char infChar(String texto) {
		System.out.print(texto);
		Scanner entrada = new Scanner(System.in);
		return entrada.next().charAt(0);
	}
	
	public String infTexto(String texto) {
		System.out.print(texto);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}
}