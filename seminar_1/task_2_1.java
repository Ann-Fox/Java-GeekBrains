package seminar_1;

import java.util.Scanner;

/*Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */

public class task_2_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        int[] arr = new int[10];
        FillMas(arr);
        PrintMas(arr);
        System.out.println(FindMaxCount(arr));
        iScanner.close();
    }

    public static void FillMas(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // System.out.println("Введите число массива: ");
            // int num = iScanner.nextInt();
            array[i] = (int) (Math.random() * 2);
        }
    }

    public static void PrintMas(int[] array) {
        for (var el : array)
            System.out.print(el + " ");
        System.out.println();
    }

    public static int FindMaxCount(int[] array) {
        int count = 1;
        int result = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] && array[i] == 1)
                count++;
            if (count > result)
                result = count;
            else {
                count = 1;
            }
        }
        return result;

    }
}
