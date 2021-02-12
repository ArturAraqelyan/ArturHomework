import java.util.ArrayList;

public class LessonExTsevenFour {
    public static void main(String[] args) {
        String ster = "okno";
        reshat(ster);
    }

    public static void reshat(String ster) {
        char[] sinvol = ster.toCharArray();
        ArrayList<Character> strig = new ArrayList<Character>();
        for (int i = 0; i < ster.length(); i++) {
            strig.add(sinvol[i]);
        }
        for (Character charac : strig) {
            int count = 0;
            for (int i = 0; i < ster.length(); i++) {
                if (ster.charAt(i) == charac) count++;
                if (count == 2) {
                    System.out.println("Sinvol" + ster.charAt(i));
                    return;
                }
            }
        }
    }
}
