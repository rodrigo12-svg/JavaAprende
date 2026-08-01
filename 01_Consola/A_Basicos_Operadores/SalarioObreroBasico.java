public class SalarioObreroBasico{
public static void main(String[]args){
double bruto=15*8*50;
double compensacion=bruto*0.02;
double imss=bruto*0.015;
double ispt=bruto*0.012;
double neto=bruto+compensacion-imss-ispt;
System.out.println("Sueldo Bruto: "+bruto);
System.out.println("Compensacion (+2%): "+compensacion);
System.out.println("IMSS (-1.5%): "+imss);
System.out.println("ISPT (-1.2%): "+ispt);
System.out.println("Salario Neto: "+neto);
}
}