package tp2ej3y4;

public class MergeSort {

	private int[] num;
	private int[] aux;
	private int n;

	public void sort(int[] values) {

		this.num = values;
		n = values.length;
		this.aux = new int[n];
		mergesort(0, n - 1);

	}

	private void mergesort(int min, int max) {

		if (min < max) {
			int mid = (min + max) / 2;
			mergesort(min, mid);
			mergesort(mid + 1, max);
			merge(min, mid, max);

		}

	}

	private void merge(int min, int mid, int max) {

		for (int i = min; i <= max; i++) {

			aux[i] = num[i];

		}

		int i = min;

		int j = mid + 1;

		int k = min;

		while (i <= mid && j <= max) {

			if (aux[i] <= aux[j]) {
				num[k] = aux[i];
				i++;
			} else {
				num[k] = aux[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			num[k] = aux[i];
			k++;
			i++;
		}
	}
}