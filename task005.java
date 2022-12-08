// Написать программу вычисления n-ого треугольного числа.

import java.util.Scanner;

public class task005 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число от числа " + ( a ) + " = "   + Triangle(a) + "\n");
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}