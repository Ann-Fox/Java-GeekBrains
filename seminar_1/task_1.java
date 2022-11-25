package seminar_1;

// import java.time.LocalDateTime;
import java.util.Scanner;

/* Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
*/
public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = iScanner.next();
        System.out.println("Hello, " + name);
        iScanner.close();
        // System.out.println(LocalDateTime.now());
    }
}

