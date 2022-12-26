
public class QuickSort {
	void sort(int[] f) {
		this.quickSort(f, 0, f.length - 1);

	}

	void quickSort(int[] f, int u, int o) {
		if (u < o) {
			int p = o; // choose the last element as pivot element//
			int pn = this.split(f, u, o, p);
			this.quickSort(f, u, pn - 1);
			this.quickSort(f, pn + 1, o);
		}
	}

	private int split(int[] f, int u, int o, int p) {
		int pivot = f[p];
		this.swap(f, p, o);// choose the last element as pivot element if it isnt //
		int i = u;
		for (int j = u; j < o; j++) {
			if (f[j] <= pivot) {
				this.swap(f, i, j);

				i++;
			}
		}
		this.swap(f, i, o);
		return i;

	}

	private void swap(int[] array, int idx1, int idx2) {
		int tmp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = tmp;
	}

}
