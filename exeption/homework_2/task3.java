package exeption.homework_2;
/*
 * 3. Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

 */
public class task3 {
    public static void main(String[] args) /*throws Exception*/ {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } /*catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }*/ catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
     }
     public static void printSum(Integer a, Integer b) /*throws FileNotFoundException*/ {
        System.out.println(a + b);
     }
}
