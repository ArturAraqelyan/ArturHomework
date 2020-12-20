package com.company;
/* 4.Пользователю необходимо ввести число с клавиатуры.
Пользователю необходимо ввести число с клавиатуры.
Если оно является положительным, то прибавить к нему 1;
если отрицательным, то вычесть из него 2; если нулевым,
то заменить его на 10. Вывести полученное число.
*/
import java.util.Scanner;

public class OneTask4 {
    Scanner in = new Scanner(System.in);

    {


        int a = 3;
        if (a > 0) {

            a = a + 1;
        } else if (a < 0) {
            a = a - 2;
        } else {
            a = 10;

            System.out.println("a");
        }
    }
}
