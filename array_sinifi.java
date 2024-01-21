import java.util.Arrays;
public class array_sinifi {
    public static void main(String[] args) {
        /*double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
  Arrays.sort(numbers); // Sort the whole array
  Arrays.parallelSort(numbers); // Sort the whole array
    System.out.println(numbers[5]);*/

    int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    System.out.println("1. Index is " +
    java.util.Arrays.binarySearch(list, 11));//dizi içinde 11 var ve 4. indexte olduğunu gösterir
    System.out.println("2. Index is " +
    java.util.Arrays.binarySearch(list, 12));//dizi içinde 12 var ve - değer döndürür
    }
}
