import java.util.Scanner;
public class ParImpar{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa un numero entero: ");
int num=teclado.nextInt();
if(num%2==0){
System.out.println("El numero es par");
}else{
System.out.println("El numero es impar");
}
boolean esPrimo=num>1;
for(int i=2;i<=Math.sqrt(num);i++){
if(num%i==0){
esPrimo=false;
break;
}
}
if(esPrimo){
System.out.println("El numero es primo");
}else{
System.out.println("El numero no es primo");
}
teclado.close();
}
}