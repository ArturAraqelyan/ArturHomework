public class LessonExTsevenThree {
    public static void main(String[] args) {


        String abc = "qwertyuiopasdfghjklzxcvbnm";
        int beginLength = abc.length();
        String s = "ThisIsALongLongWord";
        for (char chStr : s.toLowerCase().toCharArray()) {
            abc = abc.replace(chStr, '=');

        }
        abc = abc.replaceAll("=", "");
        System.out.printf("Строка содержит \'%d\' разных букв", (beginLength - abc.length()));
    }
}
