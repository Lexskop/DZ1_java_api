
// Задание №4*:Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

// Суть решения: вводите каждую цифру чисел отдельно. Если цифра не известна, то ставьте любой символ. 
// По итогу получите все варианты решений с неизвестными цифрами. Неизвестные цифры могут быть как в сумме, так и в слагаемых.

package DZ1_java_api;
import java.util.Scanner;
public class task4 {

    public static boolean isNumeric(String string) {
        int intValue;

        if (string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }

    public static void main(String[] args) {
 
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первую цифру уравнения: ");
        String temp_q = iScanner.nextLine();
        System.out.println("Введите вторую цифру уравнения: ");
        String temp_w = iScanner.nextLine();
        System.out.println("Введите третью цифру уравнения: ");
        String temp_e = iScanner.nextLine();
        System.out.println("Введите четвертую цифру уравнения: ");
        String temp_r = iScanner.nextLine();
        System.out.println("Введите пятую цифру уравнения: ");
        String temp_t = iScanner.nextLine();
        System.out.println("Введите шестую цифру уравнения: ");
        String temp_y = iScanner.nextLine();
        int q = 10;
        int w = 10;
        int e = 10;
        int r = 10;
        int t = 10;
        int y = 10;

        for (int i = 0; i < q; i++) {
            if (isNumeric(temp_q)) {
                i = Integer.parseInt(temp_q);
                q = i;
            }
            for (int j = 0; j < w; j++) {
                if (isNumeric(temp_w)) {
                    j = Integer.parseInt(temp_w);
                    w = j;
                }
                for (int k = 0; k < e; k++) {
                    if (isNumeric(temp_e)) {
                        k = Integer.parseInt(temp_e);
                        e = k;
                    }
                    for (int l = 0; l < r; l++) {
                        if (isNumeric(temp_r)) {
                            l = Integer.parseInt(temp_r);
                            r = l;
                        }
                        for (int m = 0; m < t; m++) {
                            if (isNumeric(temp_t)) {
                                m = Integer.parseInt(temp_t);
                                t = m;
                            }
                            for (int n = 0; n < y; n++) {
                                if (isNumeric(temp_y)) {
                                    n = Integer.parseInt(temp_y);
                                    y = n;
                                }
                                if (isNumeric(temp_y)) n = Integer.parseInt(temp_y);
                                if ((i * 10 + j) + (k * 10 + l) == (m * 10 + n)) {
                                    int num1 = i * 10 + j;
                                    int num2 = k * 10 + l;
                                    int num3 = m * 10 + n;
                                    System.out.printf("%s + %s = %s   ", num1, num2, num3);
                                }
                            }
                        }
                    }
                }
                
            }
        }
        iScanner.close();
    }
}

