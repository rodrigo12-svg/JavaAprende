import java.util.Scanner;
public class ValidadorNumero{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa un numero entero: ");
int numero=teclado.nextInt();
if(numero%2==0){
System.out.println("El numero es Par");
}else{
System.out.println("El numero es Impar");
}
boolean esPrimo=numero>1;
for(int i=2;i<numero;i++){
if(numero%i==0){
esPrimo=false;
break;
}
}
if(esPrimo){
System.out.println("Es un numero primo");
}else{
System.out.println("No es un numero primo");
}
teclado.close();
}
}