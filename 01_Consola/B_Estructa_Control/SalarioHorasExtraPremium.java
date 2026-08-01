import java.util.Scanner;
public class SalarioHorasExtraPremium{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa las horas totales: ");
double horas=teclado.nextDouble();
double salarioTotal;
if(horas>40){
double horasAdicionales=horas-40;
salarioTotal=(40*50)+(horasAdicionales*70);
}else{
salarioTotal=horas*50;
}
System.out.println("El salario total es: $"+salarioTotal);
teclado.close();
}
}