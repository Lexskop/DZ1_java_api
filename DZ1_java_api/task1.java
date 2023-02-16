/*
Задание №1: Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
n! (произведение чисел от 1 до n)
 */
package DZ1_java_api;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        String temp = iScanner.nextLine();
        int number = Integer.parseInt(temp);
        System.out.printf("Вы ввели - %s\n", number);
        int count = 1;
        int result_sum = 0;
        while (count < number + 1) {
            result_sum = result_sum + count;
            count++;
        }
        count = 1;
        System.out.printf("Результат вычисления треугольного числа - %s\n", result_sum);
        System.out.printf("Результат вычисления n! - %s\n", factor(number));
        iScanner.close();
    }
    static int factor (int n) { // Решение n! через метод-рекурсию
        if(n==1) return 1;
        return n * factor(n-1);
    }
}