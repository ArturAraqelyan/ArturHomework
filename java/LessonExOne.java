import java.util.Arrays;

public class LessonExOne {
    public static void main(String[] args) {
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);
        printArray("array", array);
        int index = Arrays.binarySearch(array, 2);
        if (index < 0) {


            System.out.println(index);


        }
    }
    private static void printArray(String message, int array[]) {

        for (int i = 0; i < array.length; i++) {
            if (i != 0) {

            }
            System.out.println(array[i]);
        }

    }
}

