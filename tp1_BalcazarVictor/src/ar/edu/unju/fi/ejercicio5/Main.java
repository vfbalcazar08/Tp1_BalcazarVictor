package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Introduce un numero entre 1 y 9: ");
	    numero = sc.nextInt();		
		
		for (int i=1;i<=10;i++) {
			if (numero>= 1 && numero<=9) {
            	System.out.println(numero +" x "+i+" = "+numero*i);;
            	}
            else {
            	System.out.println("numero no valido");
            	i = 11;}
		}
	}

}
