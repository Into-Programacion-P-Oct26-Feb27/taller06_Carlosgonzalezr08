/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String propietario;
        String tipoVehiculo = "";
        int opcion;
        double avaluo;
        double porcentaje = 0;
        double valorFijo = 0;
        double recargo = 0;
        double valorBase;
        double total;
        
        System.out.println("Ingrese el nombre del propietario: ");
        propietario = entrada.nextLine();
        
        
        System.out.println("TIPO     DESCRIPCION\n"
                + "1      Vehículo liviano particular\n"
                + "2      Vehículo grande particular\n"
                + "3      Taxi\n"
                + "4      Bus Urbano\n");
        
        System.out.println("TIPO     PORCENTJE DEL EVALUO   VALOR FIJO\n"
                + "1         0.01%                 $2.00\n"
                + "2         0.02%                 $2.50\n"
                + "3         0.04%                 $1.50\n"
                + "4         0.05%                 $2.20\n");
        
        System.out.println("Ingrese el avaluo comercial del vehiculo: ");
        avaluo = entrada.nextDouble();
        
        System.out.println("Ingrece el tipo de Vehiculo: ");
        opcion = entrada.nextInt();
        
        
        if (opcion==1){
            tipoVehiculo = "Vehiculo liviano particular";
            porcentaje = 0.0001;
            valorFijo = 2.00;

            if (avaluo > 30000) {
                recargo = 1.50;
            }

        } else {if (opcion == 2) {
                tipoVehiculo = "Vehiculo grande particular";
                porcentaje = 0.0002;
                valorFijo = 2.50;

                if (avaluo > 30000) {
                    recargo = 1.50;
                }

            } else{ if (opcion == 3) {
                    tipoVehiculo = "Taxi";
                    porcentaje = 0.0004;
                    valorFijo = 1.50;

                    } else {if (opcion == 4) {
                            tipoVehiculo = "Bus urbano";
                            porcentaje = 0.0005;
                            valorFijo = 2.20;

                            } else {
                            System.out.println("\nEl tipo de vehiculo ingresado"
                                    + " no es valido.");
                        }
                    }
                }
            }
        
        if (opcion >= 1 && opcion <= 4) {

            valorBase = (avaluo * porcentaje) + valorFijo;
            total = valorBase + recargo;

            System.out.printf("\nPEAJE BUENA VIA\nPropietario: %s\nTipo: %s\n"
                    + "Avaluo: $%.2f\nValor base del peaje: $%.2f\nRecargo"
                    + ": $%.2f\n    Total a cancelar: $%.2f\n", propietario,
                    tipoVehiculo, avaluo, valorBase, recargo, total);
        }

    }
}

    

