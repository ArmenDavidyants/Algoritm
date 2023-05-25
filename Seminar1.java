import javax.swing.text.Position;

public class Seminar1 {
    public static void main(String[] args) {

        // вариант 1
        // long time1 = System.currentTimeMillis();
        // System.out.println("Первый вариант " + fib1(15));
        // System.out.println("Время, первый вариант: " + (System.currentTimeMillis() - time1));
        // при 40: 102334155 время: 446
        // при 45: 1134903170 время: 4954 дальше глючит
        // O(2^(n-1))

        // вариант 2
        long time2 = System.currentTimeMillis();
        System.out.println("Второй вариант: " + fib2(45));
        System.out.println("Время, второй вариант: " + (System.currentTimeMillis() - time2));


        
        // вариант 3
        long time3 = System.currentTimeMillis();
        System.out.println("Третий вариант: " + fib3(45));
        System.out.println("Время, третий вариант: " + (System.currentTimeMillis() - time3));

    }

    // вариант 1
    // экспоненциальная 
    public static int fib1(int possition) {
        if (possition == 1 || possition == 2) {
            return 1;
        }
        return fib1(possition - 1) + fib1(possition - 2);
    }

    // вариант 2
    //  3n ??? 
    public static int fib2(int possition) {
        int fibPrePre = 1;
        int fibPre = 1;
        for (int i = 3; i <= possition; i++) {
            int fibTek = fibPrePre + fibPre;
            fibPrePre = fibPre;
            fibPre = fibTek;
        }
        return fibPre;
    }


    //  Формула Бине - до 71-ого числа O(1)
    public static int fib3(int possition) {
    double a = (1 + Math.pow(5, 0.5) ) / 2;  // (1+5^0.5) /2
    double fib = Math.round(Math.pow(a, possition)/Math.pow(5, 0.5));
    int fibInt = (int)fib;
    return fibInt;  
    }



    //  Матричное умножение  O(log n)

}
