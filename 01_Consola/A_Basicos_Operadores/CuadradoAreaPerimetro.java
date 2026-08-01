import java.util.Scanner;
public class CuadradoAreaPerimetro{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa el valor del lado: ");
double lado=teclado.nextDouble();
double area=lado*lado;
double perimetro=lado*4;
System.out.println("Area: "+area);
System.out.println("Perimetro: "+perimetro);
teclado.close();
}
}