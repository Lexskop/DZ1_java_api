/*
Задание №3: Реализовать простой калькулятор
 */
package DZ1_java_api;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        String temp = iScanner.nextLine();
        int a = Integer.parseInt(temp);
        System.out.println("Введите число B: ");
        temp = iScanner.nextLine();
        int b = Integer.parseInt(temp);
        System.out.println("Введите действие (любой знак: + - * /): ");
        String action = iScanner.nextLine();
        switch (action) {
            case "+":
                System.out.printf("Ответ: %s\n",a+b);
                break;

            case "-":
                System.out.printf("Ответ: %s\n",a-b);
                break;

            case "*":
                System.out.printf("Ответ: %s\n",a*b);
                break;

            case "/":
                System.out.printf("Ответ: %s\n",a/b);
                break;

            default:
                System.out.println("Введите правильное действие");
                break;
        }
        iScanner.close();
    }
}
