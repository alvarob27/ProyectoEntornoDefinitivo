package entornos;

import java.util.Scanner;

public class ProyectoEntornos {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		repetirLetra();	
		factorial();
		
	}	
	
	//Dado un String, repetir cada ocurrencia de su letra.
	public static void repetirLetra () {
		String complete="";
		System.out.println("Introduce una palabra");
		String entrada=sc.next();
		for(int i=0;i<entrada.length();i++) {
			char letra=entrada.charAt(i);
			complete+=letra;
			complete+=letra;

		}
		System.out.println(complete);
	}
	
	//Calcular el factorial
	public static void factorial() {
		int numero=0;
		long mult=1;
		do {
			System.out.println("Introduce un numero :");
			numero=sc.nextInt();
		}while(numero<0);
		System.out.print("!"+numero+" = ");
		if(numero==0) System.out.println(" 1");
		for(int i=numero;i>0;i--) {
			System.out.print(numero);
			mult = mult*numero;
			numero--;
			if(i>1)System.out.print("*");
			if(i==1)System.out.print(" = "+mult);
			}
	}
}
