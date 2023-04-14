import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = inputArray();
        int dif = differentCounter(array);
        System.out.println("Different numbers amount:" + dif);
    }
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Enter the numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    public static int differentCounter(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted:" + Arrays.toString(array));
        int counter = array.length;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                counter--;
            }
        }
        return counter;
    }
}