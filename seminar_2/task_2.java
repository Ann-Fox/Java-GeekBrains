package seminar_2;
// Напишите метод, который сжимает строку. 

// Пример: вход aaaabbbcdd.
// Выход abcd
// charAt(i) и indefOf(s)

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = iScanner.next();
        System.out.println(NewString(str));
        iScanner.close();
    }

    public static String NewString(String oldStr) {
        String res = "";
        char last = oldStr.charAt(0);
        for (int i = 0; i < oldStr.length(); i++) {
            if (oldStr.charAt(i) != last) {
                res = res + last;
                last = oldStr.charAt(i);
            } 
        }
        return res + last;
    }
}
