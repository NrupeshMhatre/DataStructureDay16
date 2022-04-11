package DsandAlgo;

public class MergeSort {
		public static String[] mergeSort(String[] list) {
			String[] sort = new String[list.length];
			if (list.length == 1) {
				sort = list;
			} else {
				int mid = list.length / 2;
				String[] left = null;
				String[] right = null;
				if ((list.length % 2) == 0) {
					left = new String[list.length / 2];
					right = new String[list.length / 2];
				} else {
					left = new String[list.length / 2];
					right = new String[(list.length / 2) + 1];
				}
				int x = 0;
				int y = 0;
				for (; x < mid; x++) {
					left[x] = list[x];
				}
				for (; x < list.length; x++) {
					right[y++] = list[x];
				}
				left = mergeSort(left);
				right = mergeSort(right);
				sort = mergeArray(left, right);
			}

			return sort;
		}

		

		private static String[] mergeArray(String[] left, String[] right) {
			String[] merge = new String[left.length + right.length];
			int lIndex = 0;
			int rIndex = 0;
			int mIndex = 0;
			int comp = 0;
			while (lIndex < left.length || rIndex < right.length) {
				if (lIndex == left.length) {
					merge[mIndex++] = right[rIndex++];
				} else if (rIndex == right.length) {
					merge[mIndex++] = left[lIndex++];
				} else {
					comp = left[lIndex].compareTo(right[rIndex]);
					if (comp > 0) {
						merge[mIndex++] = right[rIndex++];
					} else if (comp < 0) {
						merge[mIndex++] = left[lIndex++];
					} else {
						merge[mIndex++] = left[lIndex++];
					}
				}
			}
			return merge;
		}


		public static void main(String[] args) {
			String[] arr = { "Grape", "Mango", "Orange", "papaya", "pineapple", "Kiwi", "Apple" };

			String[] sortedArray = mergeSort(arr);
			for (int i = 0; i < sortedArray.length; i++) {
				System.out.println(sortedArray[i] + " ");
			}
		}
	}

