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
        int result = 0;
        while (count < number + 1) {
            result = result + count;
            count++;
        }
        System.out.printf("Результат - %s\n", result);
        iScanner.close();
    }
}