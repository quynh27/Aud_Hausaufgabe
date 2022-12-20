
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 2, 4, 3, 1, 5, 7, 6 };
		InsertionSort sorter = new InsertionSort();
		sorter.sort(array);
		for (int a : array) {
			System.out.println(a);
		}

	}

}
