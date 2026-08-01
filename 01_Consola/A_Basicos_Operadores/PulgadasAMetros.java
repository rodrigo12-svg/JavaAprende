import java.util.Scanner;
public class PulgadasAMetros{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa las pulgadas: ");
double pulgadas=teclado.nextDouble();
double metros=pulgadas*0.0254;
System.out.println(pulgadas+" pulgadas equivalen a "+metros+" metros");
teclado.close();
}
}