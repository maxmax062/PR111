/*Напишите метод, который проверяет является ли
        шестизначное число «счастливым». Число передаётся
        в качестве параметра. 

 */
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int a = number.charAt(0);
        int b = number.charAt(1);
        int c = number.charAt(2);
        int d = number.charAt(3);
        int e = number.charAt(4);
        int f = number.charAt(5);
        if (a + b + c == d + e + f){
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число не счастливое");
        }
    }
}
