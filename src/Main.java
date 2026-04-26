import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr3 = new int[n];
        Random rand = new Random();
        for(int i = 0; i < n; i++){
            arr3[i] = rand.nextInt(1000);
        }

        int[] array = {1,3,2,4,7,6,5,9,8,10};
        bubble b = new bubble();
        System.out.println("Before sorting:");
        b.printArray(array);
        b.bubbleSort(array);
        System.out.println("\nAfter sorting:");
        b.printArray(array);


        QuickSort qs = new QuickSort();

        int[] arr1 = {5, 3, 8, 4, 2, 7, 1, 10};

        System.out.println("\nBefore sorting:");
        qs.printArray(arr1);

        qs.quickSort(arr1, 0, arr1.length - 1);

        System.out.println("After sorting:");
        qs.printArray(arr1);

        System.out.println("\nBefore sorting:");
        qs.printArray(arr3);

        qs.quickSort(arr3, 0, arr3.length - 1);

        System.out.println("After sorting:");
        qs.printArray(arr3);

        BinarySearch bs = new BinarySearch();
        int[] arr2 = {5, 3, 8, 4, 2, 7, 1, 10};
        System.out.println(bs.search(arr2,10));

        Experiment e = new Experiment();
        e.runAllExperiments();






    }
    }


