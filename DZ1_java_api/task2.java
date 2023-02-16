/*
Задание №2: Вывести все простые числа от 1 до 1000
 */
package DZ1_java_api;

public class task2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean prime_num = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime_num = false;
                    break; 
                } 
            }
            if (prime_num){
                System.out.println(i);
            }
        }

    }
}

