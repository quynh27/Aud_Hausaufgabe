
public class MergeSort {
	public void sort(int[] f) {
		int[] tmpF = new int[f.length];
		this.mergeSort(f, tmpF, 0, f.length - 1);
	}

	private void mergeSort(int[] f, int[] tmpF, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			this.mergeSort(f, tmpF, left, mid);
			this.mergeSort(f, tmpF, mid + 1, right);
			this.merge(f, tmpF, left, mid + 1, right);
		}

	}

	private void merge(int[] f, int[] tmpF, int startLeft, int startRight, int endRight) {

		int endLeft = startRight - 1;
		int i = startLeft;
		int numElements = endRight - startLeft + 1;

		while (startLeft <= endLeft && startRight <= endRight) {

			if (f[startLeft] < f[startRight]) {
				tmpF[i++] = f[startLeft++];
			} else {
				tmpF[i++] = f[startRight++];

			}

		}
		while (startLeft <= endLeft) {
			tmpF[i++] = f[startLeft];
			startLeft++;

		}
		while (startRight <= endRight) {
			tmpF[i++] = f[startRight];
			startRight++;

		}
		for (int j = 0; j < numElements; j++, endRight--) {
			f[endRight] = tmpF[endRight];
		}

	}

}
