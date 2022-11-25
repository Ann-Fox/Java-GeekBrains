package homework_1;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int value = iScanner.nextInt();

        System.out.printf("Вы ввели число: %d \n", value);

        System.out.println(showTotalAmount(value));
        iScanner.close();
    }

    public static int showTotalAmount(int value) {
        int result = 0;
        for (int i = 1; i <= value; i++) {
            result += i;
        }
        return result;
    }

}
