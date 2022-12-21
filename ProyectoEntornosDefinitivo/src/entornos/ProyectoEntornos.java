package entornos;

import java.util.Scanner;

public class ProyectoEntornos {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
		repetirLetra();	
		factorial();
		tiempo();
		
		System.out.println("Introduce una frase: ");
		
		String respuesta = sc.nextLine();
		respuesta.toLowerCase();
		
		System.out.print("La letra que quieres buscar:");
		
		String letra = sc.next();
		letra.toLowerCase();
		
		System.out.println("La letra se repite "+ codigo(respuesta, letra) + " veces");
		

	}	
	
	//Dado un String, repetir cada ocurrencia de su letra.
	public static void repetirLetra () {
		String complete="";
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
			System.out.println("Introduce un numero");
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
	
	//Numero  de ocurrencias
	public static int codigo (String respuesta, String letra) {
			
			int contador =0;
				
			for (int i = 0; i < respuesta.length(); i++) {
				char caracter = respuesta.charAt(i);
			
				if (letra.equalsIgnoreCase(String.valueOf(caracter))) {
					contador++;
				}
			
			}
			
			return contador;


		}
	//Tiempo codigo hecho por Jorge Diez y commit hecho por Juan Querol.
	public static void tiempo() {
		int num,hora,min,seg;
        System.out.println("ingrese los segundos ");
        num=sc.nextInt();
        
        hora=num/3600;
        min=(num-(3600*hora))/60;
        seg=num-((hora*3600)+(min*60));
        
        System.out.println(hora+"h "+min+"m "+seg+"s");
	}
	}
	
