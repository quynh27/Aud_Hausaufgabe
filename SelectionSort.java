
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void sort1(int[] array) {
		int marker = array.length - 1;
		while (marker > 0) {
			int index_max = 0;
			for (int i = 1; i <= marker; i++) {
				if (array[i] > array[index_max]) {
					index_max = i;
				}
			}
			this.swap(array, marker, index_max);
			marker--;
		}
	}

	public void swap(int[] a, int indx1, int indx2) {
		int tmp = a[indx1];
		a[indx1] = a[indx2];
		a[indx2] = tmp;
	}

	public void sort2(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int index_min = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index_min]) {
					index_min = j;
				}
			}
			if (index_min != i) {
				this.swap(array, i, index_min);
			}
		}
	}

}
