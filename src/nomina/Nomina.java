/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

import java.util.Scanner;

/**
 *
 * @author MARIA
 */
public class Nomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double salarioMes, horasExtras, horaNormal, valorHoraExtra, valorTotalHorasExtras, salarioFinal;
	System.out.println("Este es el Taller de Nomina");
        System.out.print("Ingrese el valor del Salario mensual recibido: ");
        salarioMes = entrada.nextDouble();
        System.out.print("Ingrese el numero de horas extras laboradas durante el mes: ");
        horasExtras = entrada.nextDouble();
        horaNormal = salarioMes / 240;
        System.out.println("El valor de una hora normal es de: "+horaNormal);
        if (horasExtras <= 40){
            valorHoraExtra = horaNormal * 1.25;
            valorTotalHorasExtras = valorHoraExtra * horasExtras;
        }else{
            double primerasHoras = horaNormal * 30 * 1.50;
            double restoHoras = (horasExtras - 30)*(horaNormal * 2);
            valorTotalHorasExtras = primerasHoras + restoHoras;
        }
        System.out.println("El valor Total de las horas extras del empleado son: "+valorTotalHorasExtras);
        salarioFinal = salarioMes + valorTotalHorasExtras;
        System.out.println("El Salario Total del empleado durante el mes es: "+salarioFinal);
        
    }
    
}
