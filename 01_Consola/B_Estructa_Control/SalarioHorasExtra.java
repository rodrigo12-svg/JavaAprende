import java.util.Scanner;
public class SalarioHorasExtra{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa las horas trabajadas: ");
double horas=teclado.nextDouble();
double salarioTotal;
if(horas>40){
double horasExtras=horas-40;
salarioTotal=(40*14)+(horasExtras*26);
}else{
salarioTotal=horas*14;
}
System.out.println("El salario total es: $"+salarioTotal);
teclado.close();
}
}