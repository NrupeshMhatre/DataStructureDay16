package DsandAlgo;

import java.util.Scanner;

public class NumbFind {
	public int binarySearch(int[] arr, int lower, int upper) {
        int midnum = (lower + upper) / 2;
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1 element Is Equal To Mid " + midnum + "\n2 element Is Greater Than Mid "
                    + midnum + "\n3 element Is Lower Than Mid " + midnum);
            System.out.print("Enter Your Choice: ");
            int x = sc.nextInt();
            if (x == 1) {
                return midnum;
            } else if (x == 2) {
                lower = midnum + 1;
                return binarySearch(arr, lower, upper);
            } else if (x == 3) {
                upper = midnum - 1;
                return binarySearch(arr, lower, upper);
            } else {
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumbFind  find = new NumbFind ();
        System.out.print("Upper Bound: ");
        int upper = sc.nextInt();
        int lower = 0;
        int[] arr = new int[upper];
        System.out.println("Think One Number Between " + lower + " And " + upper + " \n");

        int result = find.binarySearch(arr, lower, upper);

        if (result == -1) {
            System.out.println("Number Is Out Of Bound");
        } else {
            System.out.println("Your Number Is " + result);
        }
    }
}	
