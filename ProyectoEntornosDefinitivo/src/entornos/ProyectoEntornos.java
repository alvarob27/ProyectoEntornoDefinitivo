package entornos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
	
public class ProyectoEntornos {
	static Scanner sc=new Scanner (System.in);
	static Scanner entrada = new Scanner ( System.in);
	public static void main(String[] args) {
		
		repetirLetra();	
			factorial();
			array();
			tiempo();
			System.out.println("La letra se repite "+ codigo() + " veces");
			

			

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

		public static void array() {
			System.out.println();
			System.out.println("Introduce el numero máximo de posiciones del array: ");
			int entradaUsuario = sc.nextInt();
			
			int[] arrayUsuario = new int [entradaUsuario];
			
			for (int i = 0; i < arrayUsuario.length; i++) {
				arrayUsuario[i] = (int) (Math.random()*10);
				System.out.println(arrayUsuario[i]);
				
			}
			
			
			Arrays.sort(arrayUsuario);
			System.out.println(Arrays.toString(arrayUsuario));
		}
		
			
		
		
		//Numero  de ocurrencias
	    public static int codigo () {
	        System.out.println("Introduce una frase: ");

	        String respuesta = entrada.nextLine();
	        respuesta.toLowerCase();
	        System.out.println();
	        System.out.print("La letra que quieres buscar:");

	        String letra = entrada.next();
	        letra.toLowerCase();

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
	        System.out.println("Ingrese los segundos ");
	        num=sc.nextInt();
	        
	        hora=num/3600;
	        min=(num-(3600*hora))/60;
	        seg=num-((hora*3600)+(min*60));
	        
	        System.out.println(hora+"h "+min+"m "+seg+"s");
		}
	    
	}

