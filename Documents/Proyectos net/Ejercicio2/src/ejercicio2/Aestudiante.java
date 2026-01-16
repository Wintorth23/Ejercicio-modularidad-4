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
public class Aestudiante implements AumentoNotas {
    
    @Override
    public void aplicar(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] += 0.5;
        }
    }
    
    
}
