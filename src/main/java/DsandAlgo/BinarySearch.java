package DsandAlgo;
public class BinarySearch {
	
	static String[] a = { "aa", "bb", "cc", "dd", "ee", "ff", "gg" };
	static int min = 0;
	static int max = a.length - 1;
	static int mid;
	static String key = "bb";

	public static int stringBinarySearch() {
		while (min <= max) {
			mid = (min + max) / 2;
			if (a[mid].compareTo(key) < 0) { min = mid + 1; } else if (a[mid].compareTo(key) > 0) {
				max = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;

	}
	public static void main(String[] args) {
		System.out.println("Key Found at : " + stringBinarySearch() + " position");
	}

}

