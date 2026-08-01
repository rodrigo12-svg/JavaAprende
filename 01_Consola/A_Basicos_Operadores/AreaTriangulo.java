import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la base:");
        double base = teclado.nextDouble();
        System.out.println("Ingresa la altura:");
        double altura = teclado.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El area es: " + area);
        teclado.close();
    }
}