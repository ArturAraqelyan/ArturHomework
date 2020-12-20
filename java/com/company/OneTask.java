 package com.company;
/*1.Пользователю необходимо ввести число с клавиатуры
Если оно является положительным, то прибавить к нему 1;
в противном случае не изменять его. Вывести полученное число.*/
import java.util.Scanner;

public class OneTask {
    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        System.out.print("a:");
        int a = in.nextInt();
        if (a > 0) a++;
        System.out.print("a");
    }
}
