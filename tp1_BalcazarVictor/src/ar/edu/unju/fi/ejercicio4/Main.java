package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero,i = 1;
		Boolean band = true;
        double factorial = 1;
        Scanner sc = new Scanner(System.in);

    	System.out.print("Introduce un numero entre 0 y 10: ");
        numero = sc.nextInt();
        
        while(i <= numero && band) {
            if (numero>= 0 && numero<=10) {
            	factorial = factorial * i;
            	i++;}
            else {
            	System.out.println("numero no valido");
            	band = false;}
        }
        if (band)
        System.out.printf(numero+"! = "+ factorial);
	}

}
