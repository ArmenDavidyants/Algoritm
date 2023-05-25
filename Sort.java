import java.util.ArrayList;
import java.util.Random;

public class Sort {

    public static void main(String[] args) {

        // заполнение массива
        System.out.println("Исходный массив");
        int[] array = randomNumberList(10);
        printArray(array);

        // сортировка пузырьком
        // long timeBubble = System.currentTimeMillis();
        // sortBubble(array);
        // printArray(array);
        // System.out.println(System.currentTimeMillis() - timeBubble);

        // сортировка выбором
        // long timeSelection = System.currentTimeMillis();
        // sortSelection(array);
        // printArray(array);
        // System.out.println(System.currentTimeMillis() - timeSelection);


         // сортировка вставками
         long timeInsert = System.currentTimeMillis();
         sortInsert(array);
         printArray(array);
         System.out.println(System.currentTimeMillis() - timeInsert);

    }

    // сортировка пузырьком
    public static void sortBubble(int[] array) {
        boolean check;
        do {
            check = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    check = true;
                }
            }
        } while (check);
    }

    // сортировка выбором
    public static void sortSelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (minPosition != i) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

    // сортировка вставками
    public static void sortInsert(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // метод генерации случайного числа
    public static int checkRandom() {
        Random random = new Random();
        int min = 1;
        int max = 1000;
        int diff = max - min;
        int num = random.nextInt(diff + 1) + min;
        return num;
    }

    // метод запонения ArrayList
    public static int[] randomNumberList(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = checkRandom();
        }
        return array;
    }

    // метод печати массива
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println('\n');
    }
}
