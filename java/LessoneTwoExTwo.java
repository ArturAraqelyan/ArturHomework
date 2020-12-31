import java.util.Scanner;

public class LessoneTwoExTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Цена");
        double c = in.nextDouble();

        for (int i = 1; i <= 10; ++i)
            System.out.println(i + "кг" + c * i);
    }
}
