package paketon;

import java.util.Scanner;

public class Conditionals {

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		
		
		
		int diaSemana;
		String asignatura;
		
		
		System.out.println("Introduzca un número de la semana: ");
		diaSemana = Integer.parseInt(teclado.nextLine());
		
		
		switch(diaSemana) {
			case 1: 
			case 4:
			case 5: asignatura = "Programación"; break;
			case 2: asignatura = "FOL"; break;
			case 3: asignatura = "LM"; break;
			default: asignatura = "No hay."; break;
			
		}
		System.out.println("La asignatura que esa es:" + asignatura) ;
}
}
