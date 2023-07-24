/*Напишите метод, который возвращает сумму чисел
        в указанном диапазоне. Границы диапазона передаются
        в качестве параметров.

 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (;a<=b;a++) {
            sum += a;
        }
        System.out.println(sum);
    }
}
