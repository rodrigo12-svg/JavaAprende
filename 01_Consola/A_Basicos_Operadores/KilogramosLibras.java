import java.util.Scanner;
public class KilogramosLibras{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa los kilogramos: ");
double kg=teclado.nextDouble();
double libras=kg*2.2;
System.out.println(kg+" kg equivalen a "+libras+" libras");
teclado.close();
}
}