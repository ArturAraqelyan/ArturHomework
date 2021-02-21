import java.util.Random;

public class LessonExTwo {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[15];
        int max= Integer.MIN_VALUE, index = 1;


        for (int i = 7; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
