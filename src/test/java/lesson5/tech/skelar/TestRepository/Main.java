package lesson5.tech.skelar.TestRepository;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть чисельник 1:");
        int numerator1 = sc.nextInt();

        System.out.println("Введіть знаменник 1:");
        int denominator1 = sc.nextInt();

        System.out.println("Введіть чисельник 2:");
        int numerator2 = sc.nextInt();

        System.out.println("Введіть знаменник 2:");
        int denominator2 = sc.nextInt();

        Fraction division1 = new Fraction(numerator1, denominator1);
        Fraction division2 = new Fraction(numerator2, denominator2);

        System.out.println("Результат: " + division1.equals(division2) + " \uD83D\uDCAB");
    }
}
