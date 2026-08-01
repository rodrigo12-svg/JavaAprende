import java.util.Scanner;
public class PiesAPulgadas{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa los pies: ");
double pies=teclado.nextDouble();
double pulgadas=pies*12;
System.out.println(pies+" pies equivalen a "+pulgadas+" pulgadas");
teclado.close();
}
}