package homework_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task_2 {
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
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        for (var el : list) {
            System.out.print(el + " ");
        }
    }
}
