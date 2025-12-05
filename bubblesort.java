public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print Sorted Array
        System.out.print("Sorted Array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
