package DsandAlgo;
public class BubbleSort {
    public <T extends Comparable<T>> T[] bubbleSort(T[] array2) {
        for (Integer i = 0; i < array2.length; i++) {
            for (Integer j = 0; j < array2.length-i-1; j++) {
                if(array2[j].compareTo(array2[j+1])>0) {
                    Integer x = (Integer) array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] = (T)x;
                }
            }
        }
        return array2;
    }


    public void display(Integer[] array2) {
        for(Integer i : array2) {
            System.out.print(i+" ");
        }
        System.out.println( );
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();

        Integer array[] = {50,60,45,32,15,10,51};
        Integer [] sortedArray = sort.bubbleSort(array);
        System.out.print("Bubblesort is: ");
        sort.display(sortedArray);
    }
}
