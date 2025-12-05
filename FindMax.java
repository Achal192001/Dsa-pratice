public class FindMax {

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 9, 2};

        int max = arr[0];

        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Maximum Element: " + max);
    }
}
