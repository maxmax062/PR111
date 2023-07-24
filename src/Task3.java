/*Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
        Метод принимает в качестве параметра: длину линии,
        направление, символ.

 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину линии:");
        int x = sc.nextInt();
        System.out.print("Введите символ:");
        String a = sc.next();
        System.out.print("Введите направление:");
        String a1 = sc.next();
        String b = "Горизонтальное";
        String c = "Вертикальное";
        for (int i = 0; i < x; i++) {
            if (a1.equals(b)) {
                System.out.print(a);
            }
            if (a1.equals(c)) {
                System.out.println(a);
            }
        }
    }
}
