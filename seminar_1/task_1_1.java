package seminar_1;

import java.time.LocalTime;
import java.util.Scanner;

/*В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */

public class task_1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = iScanner.next();
        // System.out.println("Hello, " + name);
        System.out.println(NowTime(name));
        iScanner.close();
    }

    public static String NowTime(String name) {
        LocalTime now_time = LocalTime.now();

        if (now_time.isAfter(LocalTime.of(5, 00)) && now_time.isBefore(LocalTime.of(11, 59))) {
            // System.out.println("Good morning, " + name);
            return "Good morning, " + name;
        }

        else if (now_time.isAfter(LocalTime.of(12, 00)) && now_time.isBefore(LocalTime.of(17, 59))) {
            // System.out.println("Good afternoon, " + name);
            return "Good afternoon, " + name;
        }

        else if (now_time.isAfter(LocalTime.of(18, 00)) && now_time.isBefore(LocalTime.of(22, 59))) {
            // System.out.println("Good evening, " + name);
            return "Good evening, " + name;
        }

        else
            // System.out.println("Good night, " + name);
            return "Good night, " + name;
    }
}
