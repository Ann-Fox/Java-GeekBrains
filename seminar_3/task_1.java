package seminar_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Заполнить список десятью случайными числами.

// Отсортировать список методом sort() и вывести его на экран.

public class task_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int temp = random.nextInt(20);
            list.add(temp);
        }

        for (int el : list) {
            System.out.print(el + " ");
        }

        list.sort(null);
        System.out.println();

        for (int el : list) {
            System.out.print(el + " ");
        }
    }
}



