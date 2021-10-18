package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 8, 9, 4, 6, 1, 5};

        for(int i = 1; i < arr.length; i++) {
            int target = arr[i];
            int j = i - 1;

            while(j>=0 && arr[j] > target) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
