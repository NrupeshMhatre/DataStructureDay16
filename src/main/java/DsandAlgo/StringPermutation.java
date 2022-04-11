package DsandAlgo;

public class StringPermutation{

		
		public static void findPermutationIterative(String string) {

			int len = string.length();
			int f = factorial(len);
			for (int i = 0; i < f; i++) {
				StringBuilder sb = new StringBuilder(string);
				int temp = i;
				for (int div = len; div >= 1; div--) {
					int quotient = temp / div;
					int remainder = temp % div;
					System.out.print(sb.charAt(remainder));
					sb.deleteCharAt(remainder);
					temp = quotient;
				}
				System.out.println();
			}
		}

		public static int factorial(int n) {
			int factorial = 1;
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			return factorial;
		}


		public static void findPermutationRecursive(String string, int left, int right) {
			if (left == right)
				System.out.println(string);
			else {
				for (int i = left; i <= right; i++) {
					string = swap(string, left, i);
					findPermutationRecursive(string, left + 1, right);
					string = swap(string, left, i);
				}
			}
		}
		
		public static String swap(String a, int i, int j) {
			char temp;
			char[] charArray = a.toCharArray();
			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			return String.valueOf(charArray);
		}
		public static void main(String [] args)
		{ 
			System.out.println("Welcome to algorithm and data structure programs");
			System.out.println("Iterative");
			StringPermutation.findPermutationIterative("abc");
		}
	
}
