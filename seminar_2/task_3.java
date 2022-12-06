package seminar_2;
// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

// equals и StringBulder для revers

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = iScanner.next();

        System.out.println(isPalindrome(str));

        iScanner.close();
    }

    public static Boolean isPalindrome(String str) {
        return str.equals((new StringBuilder(str)).reverse().toString());
    }
}
