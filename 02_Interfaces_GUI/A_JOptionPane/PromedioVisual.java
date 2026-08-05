/**
 * RETO DEL GIMNASIO DE CÓDIGO (GUI - Nivel 1)
 * Reto 1: Promedio Visual
 * Descripción: Pedir cuatro calificaciones y mostrar el promedio en ventanas emergentes.
 */

import javax.swing.JOptionPane;

public class PromedioVisual {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Ingresa la primera calificación:");
        String input2 = JOptionPane.showInputDialog("Ingresa la segunda calificación:");
        String input3 = JOptionPane.showInputDialog("Ingresa la primera calificación:");
        String input4 = JOptionPane.showInputDialog("Ingresa la segunda calificación:");
        double calificacion1 = Double.parseDouble(input1);
        double calificacion2 = Double.parseDouble(input2);
        double calificacion3 = Double.parseDouble(input3);
        double calificacion4 = Double.parseDouble(input4);
        double Promedio = (calificacion1+calificacion2+calificacion3+calificacion4) /4.0;
        JOptionPane.showMessageDialog(null, "Tu promedio es:"+Promedio );
        
        // TODO: Convierte input1 e input2 a double usando Double.parseDouble()
        // TODO: Calcula el promedio sumándolos y dividiendo entre 2.0
        // TODO: Muestra el resultado usando JOptionPane.showMessageDialog(...)
    }
}