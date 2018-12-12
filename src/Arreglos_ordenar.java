import java.util.Scanner;

/* 
 * 
muestra como ordenar un arreglo de num enteros en forma
 * ascendente y descendente usando el algoritmo de seleccion.
 */
 

public class Arreglos_ordenar {
	
	public static void main(String[] ar){
			
		Scanner teclado = new Scanner(System.in);
		
		int numeros[] = {7,5,8,5};
		int i=0;
	
		System.out.println("Array desordenado");
		imprimirArray(numeros);
		
		
		//ordenamos
		intercambio(numeros);
		
		System.out.println("array ordenado");
		imprimirArray(numeros);
	}
	
	
	public static void imprimirArray(int numeros[]){
		
		for(int i=0; i < numeros.length; i++){			
			//teclado.nextLine(); //limpiar el buffer
			//System.out.println("Posicion ["+ i +"]= ");
			System.out.println(numeros[i]);
		}
	}
	
	public static void intercambio(int numeros[]){
		//bucle anidado
		for(int i = 0; i < (numeros.length-1); i++){
				for(int j=i+1; j < numeros.length; j++){
					if(numeros[i] > numeros[j]){
					
						//intercambio valores
						int aux = numeros[i];
						numeros[i]=numeros[j];
						numeros[j]= aux;
						
						
					}
					
				}
			
		}
		
	}
}
