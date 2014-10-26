import java.util.ArrayList;
import java.util.List;
 
/** 
 * La clase ArrayList en Java, es una clase que permite almacenar cualquier tipo de objeto o 
 * datos en memoria de forma similar a los Arrays, con la ventaja de que el numero de elementos
 * que almacena, lo hace de forma dinámica, es decir, que no es necesario declarar su tamaño
 * como pasa con los Arrays, esta es la mayor diferencia
 * */
public class ArrayListColecciones {

	public static void main(String[] args) {
		/** 
		 * Definimos el array ya introduciendole los elementos y el tamaño con estos elementos
		 * */
		String[] colores = { "MAGENTA", "ROJO", "AZUL", "MORADO", "BLANCO"};
		
		/** El arrayList es una implementación de lista y a su vez de colecciones, 
		 * con las llaves definimos*/
		ArrayList <String> lista = new ArrayList <String>();
		
		/** Utilizamos un for diferente, para agregar loselementos en el arreglo colores a la lista
		 * dentro de colores, para cada color lo metemos en la variable creada color*/
		for( String color : colores ) lista.add( color );
		/** Para cada string color denro de lista vamos a imprimirlo*/
		for( String color : lista ) System.out.printf("%s, ", color );
	}

}
