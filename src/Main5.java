import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(100000);
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        selectionSort(array);
        stopwatch.stop();
        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn là: " + elapsedTime + " miliseconds.");
    }
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}