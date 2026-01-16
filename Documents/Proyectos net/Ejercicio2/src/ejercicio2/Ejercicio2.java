/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Cantidad de notas: ");
        int n = sc.nextInt();

        IngresoEstudiante ingreso = new IngresoEstudiante();
        double[] notas = ingreso.ingresar(n);

        Estudiante estudiante = new Estudiante(nombre, notas);

        CalcularPromedio calc = new CalcularPromedio();
        double promedioAntes = calc.calcular(estudiante.getNotas());

        Aestudiante aumento = new Aestudiante();
        aumento.aplicar(estudiante.getNotas()); 

        double promedioDespues = calc.calcular(estudiante.getNotas());
	Reporte reporte = new Reporte();
	reporte.mostrar(estudiante, promedioAntes, promedioDespues);
    }
    
}
