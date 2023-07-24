/*Напишите метод, который возвращает сумму чисел
        в указанном диапазоне. Границы диапазона передаются
        в качестве параметров.

 */
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        boolean isSimple = true;
        for (i = 2; i < n; i++)
            if (n % i == 0) {
                isSimple =false;
                break;
            }
        if (isSimple){
            System.out.println("Число простое");
        } else {
            System.out.println("Число составное");
        }
    }
}
