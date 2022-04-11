package DsandAlgo;

import java.util.Scanner;

public class PrimeNumb {
	public void primenumb(int first , int second) {
        int i , j , value;

        for(i=first;i<=second;i++) {
            if(i==0 || i==1)
                continue;
            value = 1;

            for(j=2;j<=i/2;++j) {
                if(i%j == 0) {
                    value = 0;
                    break;
                }
            }
            if(value == 1)
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lower Bound: ");
        int first = sc.nextInt();

        System.out.print("Upper Bound: ");
        int second = sc.nextInt();

        PrimeNumb prime = new PrimeNumb();
        System.out.println(" ");
        prime.primenumb(first,second);
        
    }

}
