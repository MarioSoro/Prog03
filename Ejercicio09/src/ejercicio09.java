/*Un n�mero se dice que es perfecto cuando la suma de sus divisores propios �todos los divisores a excepci�n 
 * del propio n�mero-, es igual a dicho n�mero. Hacer un programa que lea un n�mero y nos diga si es perfecto o no.
 */
import java.util.Scanner;
public class ejercicio09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		int i, n, suma;
		
		System.out.print ("Ingrese un numero:");
		n = t.nextInt();
		suma=0;
		for(i=1;i<n;i++){

			if(n%i==0){
			suma=suma+i;
			}
		}
			if(suma==n){
				System.out.println("Este numero es Perfecto");
			}
			if(suma!=n){
				System.out.println("Este numero no es Perfecto");
				
			}
		
		
}
}

