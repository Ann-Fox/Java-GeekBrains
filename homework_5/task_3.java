package homework_5;
// 3) Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class task_3 {
    public void main(int[] arr) {
        int n = arr.length;

        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Один за другим извлекаем элементы из кучи
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
    void heapify(int[] arr, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2 * i + 1; // левый = 2*i + 1
        int r = 2 * i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }

    /* Вспомогательная функция для вывода на экран массива размера n */
    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    // Управляющая программа
    public static void main(String[] args) {
        //            1
        //         /      \
        //       3        5
        //     /   \     /  \
        //   4       6      13 10
        // / \    /  \
        // 9  8  15   17
        int[] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};

        task_3 ob = new task_3();
        ob.main(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}







/**

 Входные данные: 4, 10, 3, 5, 1
         4(0)
        /   \
     10(1)   3(2)
    /   \
 5(3)    1(4)
Числа в скобках представляют индексы в представлении данных в виде массива.
Применение процедуры heapify к индексу 1:
         4(0)
        /   \
    10(1)    3(2)
    /   \
5(3)    1(4)
Применение процедуры heapify к индексу 0:
        10(0)
        /  \
     5(1)  3(2)
    /   \
 4(3)    1(4)
Процедура heapify вызывает себя рекурсивно для создания кучи  сверху вниз.
*/