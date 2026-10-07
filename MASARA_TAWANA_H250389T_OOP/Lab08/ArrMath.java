package Lab08;

import java.util.Arrays;

public class ArrMath {
    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        return Arrays.stream(arr).average().orElse(0);
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25};
        System.out.println("Array tracking evaluation math average: " + calculateAverage(data));
    }
}