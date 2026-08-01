import java.util.Scanner;
public class ValidadorRango{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
double calificacion;
do{
System.out.print("Ingresa una calificacion (0 a 10): ");
calificacion=teclado.nextDouble();
}while(calificacion<0||calificacion>10);
System.out.println("Calificacion valida ingresada: "+calificacion);
teclado.close();
}
}