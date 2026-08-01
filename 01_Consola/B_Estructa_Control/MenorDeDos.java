import java.util.Scanner;
public class MenorDeDos{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa el primer numero: ");
int n1=teclado.nextInt();
System.out.print("Ingresa el segundo numero: ");
int n2=teclado.nextInt();
if(n1<n2){
System.out.println("El menor es: "+n1);
}else if(n2<n1){
System.out.println("El menor es: "+n2);
}else{
System.out.println("Ambos numeros son iguales");
}
teclado.close();
}
}