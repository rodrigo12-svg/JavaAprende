import java.util.Scanner;
public class SalarioDinamico{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa las horas trabajadas: ");
double horas=teclado.nextDouble();
System.out.print("Ingresa el pago por hora: ");
double pagoHora=teclado.nextDouble();
if(horas<0||pagoHora<0){
System.out.println("Error: Los valores no pueden ser negativos");
}else{
double bruto=horas*pagoHora;
double compensacion=bruto*0.02;
double imss=bruto*0.015;
double ispt=bruto*0.012;
double neto=bruto+compensacion-imss-ispt;
if(neto<0){
System.out.println("Error: El salario neto es negativo");
}else{
System.out.println("Sueldo Bruto: "+bruto);
System.out.println("Compensacion (+2%): "+compensacion);
System.out.println("IMSS (-1.5%): "+imss);
System.out.println("ISPT (-1.2%): "+ispt);
System.out.println("Salario Neto: "+neto);
}
}
teclado.close();
}
}