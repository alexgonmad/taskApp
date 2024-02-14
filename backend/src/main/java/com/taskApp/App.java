package com.taskApp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa una cadena de texto: ");
        
        String input = scanner.nextLine();
        System.out.println("La cadena de texto ingresada es: " + input);

        scanner.close();
    }
}
