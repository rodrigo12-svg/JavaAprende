import java.util.Scanner;

public class CalculadoraCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el radio:");
        double radio = teclado.nextDouble();
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area es: " + area);
        teclado.close();
    }
}