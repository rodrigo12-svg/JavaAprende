import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu edad en años:");
        int años = teclado.nextInt();
        double decadas = años / 10.0;
        double lustros = años / 5.0;
        int meses = años * 12;
        int semanas = años * 52;
        int dias = años * 365;
        int horas = años * 8760;
        int minutos = años * 525600;
        System.out.println("Decadas: " + decadas);
        System.out.println("Lustros: " + lustros);
        System.out.println("Meses: " + meses);
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        teclado.close();
    }
}