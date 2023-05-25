javac Seminar3/Main.java - компилируем  

java Seminar3.Main - запускаем 


Обязательно должна быть отдельная папка для проекта в основной папке. 
package Seminar3; - обязательно должно быть в начале кода каждого файла. 
Seminar3 - папка, в которой хранитсья проект. 
Main.java - основной файл


System.out.println("Введите имя! ");
Scanner in = new Scanner(System.in, "Cp866");
String name = in.nextLine();


/*=========================================
 * 
 * Вывести все простые числа от 1 до 1000
 * 
 ========================================*/

public class Seminar1Task4 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis(); // фиксирую время начала выполнения программы
        String outString = "2";
        for (int i = 3; i < 1001; i = i + 2) {
            int n = i;
            int count = 0;
            for (int j = 3; j < n; j = j + 2) {
                if (n % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                outString = outString + " " + n;
            }

        }
        System.out.println(outString);
        System.out.println(System.currentTimeMillis() - time); // время, за которое выполняется программа

    }

}

// если в циклах увеличивать итератор на 1, то время увеличивается на 2 - 3
// милисекунды

