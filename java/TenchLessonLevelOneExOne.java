import java.util.ArrayList;
import java.util.List;

public class TenchLessonLevelOneExOne {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Телевизор");
        list.add("Интернет");
        list.add("Пулть");
        list.add("Фильми");
        list.stream().forEach(prosmotor ->  System.out.println(prosmotor));

    }
}






