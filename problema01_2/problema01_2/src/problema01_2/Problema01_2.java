/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01_2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema01_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double num1;
        double num2;
        double resultado;
        int opcion;

        System.out.println("OPERACIONES ARITMETICAS");
        
        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextDouble();

        
        System.out.println("Ingrese la operacion requerida\n"
                + "1 Suma\n"
                + "2 Resta\n"
                + "3 Multiplicacion\n"
                + "4 Division\n"
                + "5 Modulo\n"
                + "6 Potencia\n");

        System.out.print("Ingrese una opcion: ");
        opcion = entrada.nextInt();
        
        resultado=0;
        
        if (num1 > num2) {

            if (opcion == 1) {
                resultado = num1 + num2;

                System.out.printf("\nOPERACIONES ARITMETICAS\nPrimer numero: "
                        + "%.2f\nSegundo numero: %.2f\nOperacion seleccionada: "
                        + "Suma\nResultado: %.2f\n", num1, num2, resultado);

            } else if (opcion == 2) {
                resultado = num1 - num2;

                System.out.printf("\nOPERACIONES ARITMETICAS\nPrimer numero: "
                        + "%.2f\nSegundo numero: %.2f\nOperacion seleccionada: "
                        + "Resta\nResultado: %.2f\n", num1, num2, resultado);
                
            } else if (opcion == 3) {
                resultado = num1 * num2;

                System.out.printf("\nOPERACIONES ARITMETICAS\nPrimer numero: "
                        + "%.2f\nSegundo numero: %.2f\nOperacion seleccionada: "
                        + "Multiplicacion\nResultado: %.2f\n", num1, num2,
                        resultado);

            } else if (opcion == 4) {

                if (num2 != 0) {
                    resultado = num1 / num2;

                    System.out.printf("\nOPERACIONES ARITMETICAS\nPrimer numero: "
                        + "%.2f\nSegundo numero: %.2f\nOperacion seleccionada: "
                        + "Division\nResultado: %.2f\n", num1, num2, resultado);

                } else {
                    System.out.println("No se puede dividir para cero.");
                }

            } else if (opcion == 5) {

                if (num2 != 0) {
                    resultado = num1 % num2;

                    System.out.printf("\nOPERACIONES ARITMETICAS\nPrimer numero:"
                            + " %.2f\nSegundo numero: %.2f\nOperacion seleccion"
                            + "ada: Modulo\nResultado: %.2f\n", num1, num2,
                            resultado);

                } else {
                    System.out.println("No se puede calcular el modulo con cero"
                            + ".");
                }

            } else if (opcion == 6) {
                resultado = Math.pow(num1, num2);

                System.out.printf("\nOPERACIONES ARITMETICAS\nPrimer numero: "
                        + "%.2f\nSegundo numero: %.2f\nOperacion seleccionada: "
                        + "Potencia\nResultado: %.2f\n", num1, num2, resultado);

            } else {
                System.out.println("La opcion seleccionada no es valida.");
            }

        } else {
            System.out.println("No es posible realizar la operacion.");
            System.out.println("El primer numero debe ser mayor que el segundo.");
        }

        entrada.close();
    }
}

    
    

