import java.util.Scanner;
public class MaximoDeCinco{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa el numero 1: ");
double mayor=teclado.nextDouble();
for(int i=2;i<=5;i++){
System.out.print("Ingresa el numero "+i+": ");
double num=teclado.nextDouble();
if(num>mayor){
mayor=num;
}
}
System.out.println("El numero mayor es: "+mayor);
teclado.close();
}
}