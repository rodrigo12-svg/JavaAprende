import java.util.Scanner;
public class LapicesColores{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa la cantidad de lapices: ");
int cantidad=teclado.nextInt();
double precio;
if(cantidad>=100){
precio=0.80;
}else if(cantidad>=51){
precio=1.20;
}else if(cantidad>=30){
precio=1.50;
}else{
precio=2.10;
}
double total=cantidad*precio;
System.out.println("Precio unitario: $"+precio);
System.out.println("Costo total: $"+total);
teclado.close();
}
}