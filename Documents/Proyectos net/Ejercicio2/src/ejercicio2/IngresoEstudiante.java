/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class IngresoEstudiante {
    
    public double[] ingresar(int cantidad) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        return notas;
    }
}
