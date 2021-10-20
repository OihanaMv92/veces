package es.studium.veces;

import java.util.Scanner;

public class Veces {
	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int numero, veces, i;
	System.out.println("Dame un numero ");
	veces=teclado.nextInt();
	System.out.println("Dame otro numero ");
	numero=teclado.nextInt();
	teclado.close();
	for(i=1; i<=veces;i++) {
		
		System.out.println("El numero es " + numero);

		}
	
	
	}
}
