/* Напишите метод, который принимает два числа в качестве параметра и отображает все четные числа между ними

 */


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (; num1 <= num2; num1++) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
        }
    }
}
