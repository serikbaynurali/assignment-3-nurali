public class Experiment {

    bubble b = new bubble();
    QuickSort qs = new QuickSort();
    BinarySearch bs = new BinarySearch();


    public long measureSortTime(int[] arr, String type) {
        long start = System.nanoTime();

        if (type.equals("bubble")) {
            b.bubbleSort(arr);
        } else if (type.equals("quick")) {
            qs.quickSort(arr, 0, arr.length - 1);
        }

        long end = System.nanoTime();
        return end - start;
    }


    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();

        bs.search(arr, target);

        long end = System.nanoTime();
        return end - start;
    }

    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {


            int[] arr = new int[size];
            java.util.Random rand = new java.util.Random();

            for (int i = 0; i < size; i++) {
                arr[i] = rand.nextInt(1000);
            }


            int[] arrBubble = arr.clone();
            int[] arrQuick = arr.clone();


            long bubbleTime = measureSortTime(arrBubble, "bubble");
            long quickTime = measureSortTime(arrQuick, "quick");


            qs.quickSort(arr, 0, arr.length - 1);

            int target = arr[size / 2];
            long searchTime = measureSearchTime(arr, target);


            System.out.println("Array Size: " + size);
            System.out.println("Bubble Sort Time: " + bubbleTime + " ns");
            System.out.println("Quick Sort Time: " + quickTime + " ns");
            System.out.println("Binary Search Time: " + searchTime + " ns");
            System.out.println("-----------------------------");
        }
    }
}