package ex_16_ARRAYS;
// interview question second high number in arr
import java.util.Arrays;

public class Lab159_ARRAYS_INT_QnA_01 {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 2]);
        System.out.println(numbers[numbers.length - 3]);
        System.out.println(numbers[numbers.length - 4]);


    }
}
