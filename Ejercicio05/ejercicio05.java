/*Hacer un programa que lea una serie de n�meros por teclado de manera 
 * que cuando el n�mero le�do sea el cero ya no se introduzcan m�s, 
 *el programa debe calcular y escribir la suma de los n�meros de la serie 
 *y cu�ntos se han introducido en total.*/
import java.util.Scanner;
public class ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int n,suma,contador;
		
		System.out.print ("Ingrese un numero:");
		n = teclado.nextInt();
		contador=0;
		suma=n;
		
		while (n!=0) {
			System.out.print ("Ingrese un numero:");
			n = teclado.nextInt();
				suma=n+suma;
				contador=contador+1;
			
			
			
		}
		
		System.out.println("La suma de los numeros es: " + suma);
		System.out.println("Has introducido: " + contador + " numeros");
	}

}