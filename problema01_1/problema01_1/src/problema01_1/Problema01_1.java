/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01_1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema01_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opcion;
        double num1;
        double num2;
        double suma;
        double resta;
        double multiplicacion;
        double division;
        double modulo;
        double potencia;
        double resultado;
        
        resultado=0;
        System.out.println("OPERACIONES ARITMETICAS\n"
                + "1 Suma\n"
                + "2 Resta\n"
                + "3 Multiplicacion\n"
                + "4 Division\n"
                + "5 Modulo\n"
                + "6 Potencia\n");
        System.out.println("Ingrese la Opcion requerica");
        opcion = entrada.nextInt();
        
        System.out.println("Ingrese el primer valor");
        num1 = entrada.nextDouble(); 
        
        System.out.println("Ingrese el segundo valor");
        num2 = entrada.nextDouble(); 
        
        if (num1 > num2){
        
            switch(opcion){
                case 1:
                
                    suma = num1 + num2;
                    resultado=suma;
                    break;
                
                case 2:
                    resta = num1 - num2;
                    resultado=resta;
                    break;
            
                case 3:
                    multiplicacion = num1 * num2;
                    resultado=multiplicacion;
                    break;
                
                case 4:
                    if (num2>0){
                        division = num1 / num2;
                        resultado=division;
                        break;
                    }else{
                        System.out.println("El segundo numero no puede ser 0");
                    }
                    
                case 5:
                    if (num2>0){
                        modulo = num1 % num2;
                        resultado=modulo;
                        break;
                    }else{
                        System.out.println("El segundo numero no puede ser 0");
                    }
                
                case 6:
                    potencia = Math.pow(num1, num2);
                    resultado=potencia;
                    break;
            
                default:
                    System.out.println("Opciones no valida");
                    break;
            }
        
            System.out.printf("OPERACIONES ARITMETICAS\nPrimer numero: %.2f\n"
               + "Segundo numero: %.2f\nOperacion Seleccionada: %s\n\nResultado"
               + ": %.2f\n", num1, num2, opcion, resultado); 
        }else{
            System.out.println("el primer número ingresado debe ser mayor que "
                    + "el segundo");
        }
    }
    
}
