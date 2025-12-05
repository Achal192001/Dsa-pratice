public class FindMin {

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 9, 2};

        int min = arr[0];

        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }

        System.out.println("Minimum Element: " + min);
    }
}
