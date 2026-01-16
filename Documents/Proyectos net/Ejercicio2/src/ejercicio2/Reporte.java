/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author labesp
 */
public class Reporte {
    
    public void mostrar(Estudiante e, double promedioAntes, double promedioDespues) {
        System.out.println("================================");
        System.out.println("REPORTE DE NOTAS");
        System.out.println("Estudiante: " + e.getNombre());
        System.out.println("Promedio antes del ajuste: " + promedioAntes);
        System.out.println("Promedio despues del ajuste: " + promedioDespues);
        System.out.println("================================");
    }
    
}
