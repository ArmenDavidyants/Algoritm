import java.util.ArrayList;
import java.util.List;

public class Lection1 {

    public static void main(String[] args) {
        List<Integer> result = deliteli(12);
        System.out.println(result);

    }


     // Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.

     

    // вычисление делителей числа
    public static List<Integer> deliteli(int number) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

}




// long time = System.currentTimeMillis(); // фиксирую время начала выполнения
// программы
// String outString = "2";
// for (int i = 3; i < 1001; i = i + 2) {
// int n = i;
// int count = 0;
// for (int j = 3; j < n; j = j + 2) {
// if (n % j == 0) {
// count++;
// }
// }
// if (count == 0) {
// outString = outString + " " + n;
// }

// }
// System.out.println(outString);
// System.out.println(System.currentTimeMillis() - time); // время, за которое
// выполняется программа
