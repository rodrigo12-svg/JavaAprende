/**
 * RETO DEL GIMNASIO DE CÓDIGO (GUI - Nivel 3)
 * Reto 11: Suma de los Cuadrados de los primeros 100 números
 */

import javax.swing.*;
import java.awt.FlowLayout;


public class SumaCuadradosVisual extends JFrame {
    JButton btnCalcular;
    JLabel etiquetaResultado;

    public SumaCuadradosVisual() {
        setTitle("Suma de Cuadrados");
        setSize(280, 150);
        setLayout(new FlowLayout());
        
        btnCalcular = new JButton("Calcular Suma (1 al 100)");
        etiquetaResultado = new JLabel("Resultado: ---");
        
        btnCalcular.addActionListener(e -> {
            int resultado = 0;
            for (int i = 1; i <= 100; i++) {
                resultado += (i * i);
            }
            etiquetaResultado.setText("Resultado: " + resultado);
            // TODO: Declarar variable sumador = 0
            // TODO: Bucle for de 1 a 100 sumando (i * i) al sumador
            // TODO: Mostrar el resultado final en etiquetaResultado
        });
        
        add(btnCalcular); add(etiquetaResultado);
    }

    public static void main(String[] args) {
        new SumaCuadradosVisual().setVisible(true);
    }
}