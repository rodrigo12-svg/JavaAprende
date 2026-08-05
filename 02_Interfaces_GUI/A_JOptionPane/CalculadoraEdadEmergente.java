/**
 * RETO DEL GIMNASIO DE CÓDIGO (GUI - Nivel 1)
 * Reto 3: Desglose de Edad Visual
 */

import javax.swing.JOptionPane;

public class CalculadoraEdadEmergente {
    public static void main(String[] args) {
        String inputEdad = JOptionPane.showInputDialog("¿Cuántos años tienes?");
        int edad = Integer.parseInt(inputEdad);
        int meses = edad*12;
        int dias = edad*365;
        JOptionPane.showMessageDialog(null, "Tienes"+meses+ "meses y"+dias+ "días vividos.");

        
        // TODO: Convierte inputEdad a un entero usando Integer.parseInt()
        // TODO: Calcula los meses (edad * 12) y días (edad * 365)
        // TODO: Muestra un mensaje que diga "Tienes X meses y Y días vividos."
    }
}