import java.util.Scanner;
public class RelojFuturo{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa la hora actual (0-23): ");
int t=teclado.nextInt();
System.out.print("Ingresa las horas a sumar: ");
int h=teclado.nextInt();
int horaFutura=(t+h)%24;
System.out.println("En "+h+" horas, el reloj marcara las: "+horaFutura);
teclado.close();
}
}