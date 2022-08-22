/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Karen V
 */

public class Operaciones {
    
    public double multiplicar (double num1, double num2){
        double resultado = num1 * num2;
        return resultado;
    }
    
    public double seno(double angulo){
        
        double resultado = Math.sin(Math.toRadians(angulo));
        return resultado;
    }
    
}
