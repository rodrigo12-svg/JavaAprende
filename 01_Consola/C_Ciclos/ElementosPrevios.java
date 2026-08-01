import java.util.Scanner;
public class ElementosPrevios{
public static void main(String[]args){
Scanner teclado=new Scanner(System.in);
System.out.print("Ingresa un numero: ");
int num=teclado.nextInt();
for(int i=1;i<num;i++){
System.out.println(i);
}
teclado.close();
}
}