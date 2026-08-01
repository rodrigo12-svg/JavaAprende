import java.util.Scanner;
public class VentaBates{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa la cantidad de bates: ");
int cantidad=teclado.nextInt();
double precio;
if(cantidad<10){
precio=108;
}else{
precio=100;
}
double total=cantidad*precio;
System.out.println("Precio unitario: $"+precio);
System.out.println("Costo total: $"+total);
teclado.close();
}
}