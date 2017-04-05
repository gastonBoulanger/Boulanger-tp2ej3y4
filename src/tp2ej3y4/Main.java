package tp2ej3y4;

import java.util.Date;

public class Main {

	final static int size = 50000;
	final static int random = 1000000;
	
	public static void main(String[] args) {
		int sizePrint = size/2;
		// ------------------------ EJERCICIO 3 ----------------------
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		BubbleSort bs = new BubbleSort();

		//Se cargan los arreglos
		for (int i = 0; i < size; i++) {
			int temp = (int) (Math.random() * random);
			arr1[i] = temp;
			arr2[i] = temp;
		}

		System.out.println();
		System.out.println("ARREGLO ORDENADO BURBUJA");
		//Se ordena por burbuja
		Date inicioBubble = new Date();
		bs.burble(arr1);
		Date finalBubble = new Date();

		// ------------------------ EJERCICIO 4 ----------------------
		//Se ordena por mergesort
		MergeSort merge = new MergeSort();
		Date inicioMerge = new Date();
		merge.sort(arr2);
		Date finalMerge = new Date();

		//Se imprime inicio y fin de ordenamiento de burbuja
		System.out.println();
		System.out.println(inicioBubble);
		System.out.println(finalBubble);

		//Se calcula e imprime el tiempo final de ordenamiento burbuja en long
		long resultBubble = finalBubble.getTime() - inicioBubble.getTime();
		System.out.println(resultBubble + " con BUBBLESORT");

		//Se imprime inicio y fin de ordenamiento por merge
		System.out.println();
		System.out.println(inicioMerge);
		System.out.println(finalMerge);

		//Se calcula e imprime el tiempo final de ordenamiento merge en long
		long resultMerge = finalMerge.getTime() - inicioMerge.getTime();
		System.out.println(resultMerge  + " con MERGESORT");

		for (int i = 0; i < sizePrint; i++) {
			System.out.print(arr1[i] + " - ");
		}
		System.out.println(" - ");
		for (int i = 0; i < sizePrint; i++) {
			System.out.print(arr2[i] + " - ");
		}
		/*En arreglo de tamaño chico se puede observar que el tiempo del metodo burbujeo
		 *es similar al tiempo empleado por el metodo mergesort
		 *Por el contrario cuanto mas grande es el arreglo mas rapido es el mergesort.
		 */
	}
}