package DsandAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PrimeAnagramPalindrom {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound of the interval: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper bound of the interval: ");
        int upper = sc.nextInt();

        System.out.println("Prime numbers between " +lower + " and " +upper+ " are: ");
        checkPrime(lower, upper);
    }

    public static void checkPrime(int lowerBound, int upperBound) {
        int value = 0;
        ArrayList<String> array = new ArrayList();

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i == 1 || i == 0)
                continue;
            value = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    value = 0;
                    break;
                }
            }
            if (value == 1) {
                System.out.print(i + " ");
                array.add(Integer.toString(i));
            }
        }
        System.out.println();
        printAnagrams(array);
        checkPalindromePair(array);
    }

    private static void printAnagrams(ArrayList<String> arr) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (int i = 0; i < arr.size(); i++) {
            String word = arr.get(i);
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            
            if (map.containsKey(newWord)) {
                map.get(newWord).add(word);
            }
            else {
                List<String> words = new ArrayList<String>();
                words.add(word);
                map.put(newWord, words);
            }
        }

        System.out.println("Anagrams are: ");
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() > 1) {
                System.out.print(values);
            }
        }
        System.out.println();
    }

    private static boolean isPalindrome(String str) {
        int length = str.length();
        
        for (int i = 0; i < length/2; i++ )
            if (str.charAt(i) != str.charAt(length-i-1))
                return false;
        return true;
    }

    private static boolean checkPalindromePair(List<String> array) {
        boolean value = false;
        System.out.println("\n" + "Palindrome numbers");
        for (int i = 0; i < array.size()-1; i++) {
            if (isPalindrome(array.get(i))) {
                System.out.print(array.get(i) + " ");
                value = true;
            }
        }
        return value;
    }
}

