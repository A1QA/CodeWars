package kyu8;

/*
Kata: Sum of positive
Task: You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
 */
public class Kata021 {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int tmp : arr) {
            if (tmp > 0) sum += tmp;
        }
        return sum;
    }
}
