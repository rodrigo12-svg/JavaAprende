import java.util.Scanner;
public class FiltrarCalificaciones{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
int aprobadas=0;
for(int i=1;i<=10;i++){
System.out.print("Ingresa la calificacion "+i+": ");
double cal=teclado.nextDouble();
if(cal>=6&&cal<=10){
aprobadas++;
}
}
System.out.println("Total de calificaciones aprobatorias: "+aprobadas);
teclado.close();
}
}