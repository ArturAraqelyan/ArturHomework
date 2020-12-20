import java.util.Scanner;

public class LessonOneExTwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a > 0) {
            a = a + 2;
        } else {
            a = a * 2;
        }

        System.out.println(a);
    }
}
