/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package problema03;

import java.util.Locale;
import java.util.Scanner;

public class Problema03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String empleado;
        int tipo;
        int anios;
        double sueldoInicial;
        double porcentaje = 0;
        double incremento;
        double bonificacion = 0;
        double nuevoSueldo;

        System.out.println("Ingrese el nombre del empleado: ");
        empleado = entrada.nextLine();
        
        System.out.println("Tipo de empleado    Porcentaje de incremento"
                + "1                        5%\n"
                + "2                        7%\n"
                + "3                        9%\n"
                + "4                        12%\n"
                + "5 o cualquier otro tipo  15%%\n");

        System.out.println("Ingrese el tipo de empleado: ");
        tipo = entrada.nextInt();
        
        System.out.println("Años de servicio                      Bonificacion\n"
                + "Menos de 2 años                             $0.00\n"
                + "Desde 2 hasta menos de 5 años               $60.00\n"
                + "Desde 5 hasta menos de 10 años              $30.00\n"
                + "10 años o mas                               $100.00\n");

        System.out.println("Ingrese los años de servicio: ");
        anios = entrada.nextInt();

        System.out.println("Ingrese el sueldo inicial: ");
        sueldoInicial = entrada.nextDouble();

        if (tipo == 1) {
            porcentaje = 0.05;

        } else {
            if (tipo == 2) {
                porcentaje = 0.07;

            } else {
                if (tipo == 3) {
                    porcentaje = 0.09;

                } else {
                    if (tipo == 4) {
                        porcentaje = 0.12;

                    } else {
                        porcentaje = 0.15;
                    }
                }
            }
        }

        if (anios < 2) {
            bonificacion = 0;

        } else {
            if (anios < 5) {
                bonificacion = 30;

            } else {
                if (anios < 10) {
                    bonificacion = 60;

                } else {
                    bonificacion = 100;
                }
            }
        }

        incremento = sueldoInicial * porcentaje;
        nuevoSueldo = sueldoInicial + incremento + bonificacion;

        System.out.printf("\nREPORTE DE INCREMENTO SALARIAL\n"
                + "\nEmpleado: %s\nTipo de empleado: %d\n"
                + "Años de servicio: %d\n"
                + "\nSueldo inicial: $%.2f\n"
                + "Porcentaje de incremento: %.0f%%\n"
                + "Incremento salarial: $%.2f\n"
                + "Bonificacion por antiguedad: $%.2f\n"
                + "\nNuevo sueldo: $%.2f\n",
                empleado, tipo, anios, sueldoInicial,
                porcentaje * 100, incremento, bonificacion, nuevoSueldo);

        
    }
}