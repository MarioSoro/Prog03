
/*Hacer un programa que vaya leyendo n�meros por el teclado hasta que lea el cero, que indicar�
el fin de la entrada de datos. El programa debe calcular y escribir 
la suma de los n�meros introducidos en lugar par y de los introducidos en lugar impar,
es decir los introducidos primero, tercero, quinto, etc. y la suma de los introducidos segundo, cuarto, sexto, etc.*/
import java.util.Scanner;
public class ejercicio06 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner t= new Scanner (System.in);
	
			int n,sp,si;
			
			
			System.out.print ("Ingrese un numero:");
			n = t.nextInt();
			si=n;
			
			System.out.print ("Ingrese un numero:");
			n = t.nextInt();
			sp=n;
			while (n!=0) {
				
				System.out.print ("Ingrese un numero:");
				n = t.nextInt();
				si=si + n;
				
				System.out.print ("Ingrese un numero:");
				n = t.nextInt();
				sp=sp + n;

			
		}
			System.out.println(si);
			System.out.println(sp);	
		
	}
}
