package com.es.eoi.shop.views;

import java.util.Scanner;

public class Menu {

	public static void printMainMenu() {

		System.out.println("BIENVENIDO A MI TIENDA, INTRODUZCA UNA OPCION");
		System.out.println("1-COMPRAR ARTICULOS");
		System.out.println("2-LISTAR ARTICULOS");
		System.out.println("3-GESTIONAR ARTICULOS");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int option = scan.nextInt();

		switch (option) {
		case 1:
			System.out.println("numero 1");

			break;

		case 2:
			System.out.println("numero2");

			break;

		case 3:
			System.out.println("numero 3");

			break;
		}

	}

}
