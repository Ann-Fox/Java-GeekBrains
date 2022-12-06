package homework_3;
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task_3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int temp = random.nextInt(10);
            list.add(temp);
        }

        for (int el : list) {
            System.out.print(el + " ");
        }

        System.out.println();
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        double avg = getAverage(list);
        System.out.println(avg);

    }

    public static double getAverage(List<Integer> list) {
        long sum = 0;
        for (int i: list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }

}
