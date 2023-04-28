package exeption.homework_1;
/*
 * Урок 1. Обработка ошибок в программировании

 
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов
 в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
*
 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 и возвращающий новый массив, каждый элемент которого равен частному элементов двух 
 входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
 оповестить пользователя. 
 
 Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */
public class Program {
    public static void main(String[] args) {
        int[] arr1 = { 22, 2, 9 };
        int[] arr2 = { 8, 1, 12 };
        Program service = new Program();
        int[] result = service.differenceArrays(arr1, arr2);
        printArray(result);
        result = service.divisionArrays(arr1, arr2);
        printArray(result);
    }

    public void checkNotEmptyArray(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array Null"); //Массив Null
        }
        if (array.length == 0) {
            throw new RuntimeException("Array is empty"); //Массив пустой
        }
    }

    public void checkLengthMatchArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Arrays of different lengths"); //Массивы разной длины
        }
    }

    public void checkZeroElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                //Элемент массива равен 0. Деление на 0 невозможно
                throw new RuntimeException("The array element is 0. Division by 0 is not possible.");
            }
        }
    }

    public int[] differenceArrays(int[] array1, int[] array2) {
        checkNotEmptyArray(array1);
        checkNotEmptyArray(array2);
        checkLengthMatchArrays(array1, array2);
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }

    public int[] divisionArrays(int[] array1, int[] array2) {
        checkNotEmptyArray(array1);
        checkNotEmptyArray(array2);
        checkLengthMatchArrays(array1, array2);
        checkZeroElement(array2);
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] / array2[i];
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
