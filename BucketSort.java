import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
	private int bound;

	public BucketSort(int bound) {
		this.bound = bound;
	}

	void sort(int[] f) {
		int n = f.length; // numbers of buckets and the length of array//
		List<List<Integer>> buckets = this.createBuckets(n);
		for (int i = 0; i < n; i++) {
			int bucket_index = n * f[i] / this.bound;
			buckets.get(bucket_index).add(f[i]);
		}

		int idx = 0;

		for (int i = 0; i < n; i++) {

			Collections.sort(buckets.get(i)); // sorting elements in each bucket//
			for (int j = 0; j < buckets.get(i).size(); j++) {
				f[idx++] = buckets.get(i).get(j);
			}

		}

	}

	List<List<Integer>> createBuckets(int n) {
		List<List<Integer>> ListOfBuckets = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			List<Integer> bucket = new ArrayList<Integer>();
			ListOfBuckets.add(bucket);
		}
		return ListOfBuckets;
	}

}
