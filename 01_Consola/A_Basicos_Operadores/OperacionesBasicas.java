import java.util.Scanner;
public class OperacionesBasicas{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa el primer numero: ");
double n1=teclado.nextDouble();
System.out.print("Ingresa el segundo numero: ");
double n2=teclado.nextDouble();
System.out.println("Suma: "+(n1+n2));
System.out.println("Resta: "+(n1-n2));
System.out.println("Multiplicacion: "+(n1*n2));
if(n2!=0){
System.out.println("Division: "+(n1/n2));
}else{
System.out.println("No se puede dividir entre cero");
}
teclado.close();
}
}