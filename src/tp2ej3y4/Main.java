package tp2ej3y4;

import java.util.Date;

public class Main {

	final static int size = 100000;
	public static void main(String[] args) {
		// ------------------------ EJERCICIO 3 ----------------------
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		BubbleSort bs = new BubbleSort();

		for (int i = 0; i < size; i++) {
			int temp = (int) (Math.random() * 1000000);
			arr1[i] = temp;
			arr2[i] = temp;
		}

		System.out.println();
		System.out.println("ARREGLO ORDENADO BURBUJA");
		Date inicioArray = new Date();
		bs.burble(arr1);
		Date finalArray = new Date();

		// ------------------------ EJERCICIO 4 ----------------------
		MergeSort merge = new MergeSort();
		Date inicioMerge = new Date();
		merge.sort(arr2);
		Date finalMerge = new Date();

		System.out.println();
		System.out.println(inicioArray);
		System.out.println(finalArray);

		long resultadoArray = finalArray.getTime() - inicioArray.getTime();
		System.out.println(resultadoArray / 1000 + " segundos con BUBBLESORT");

		System.out.println();
		System.out.println(inicioMerge);
		System.out.println(finalMerge);

		long resultadoMerge = finalMerge.getTime() - inicioMerge.getTime();
		System.out.println(resultadoMerge / 1000 + " segundos con MERGESORT");

		for (int i = 0; i < 1000; i++) {
			System.out.print(arr2[i] + " - ");
		}
		/*Se puede observar que el tiempo del metodo burbujeo 
		 *es ampliamente mayor que el tiempo empleado por el metodo mergesort
		 *(mergesort practicamente tarda 0 segundos)
		 *para ordenar el mismo arreglo.
		 */
	}
}