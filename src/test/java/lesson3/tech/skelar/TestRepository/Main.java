package lesson3.tech.skelar.TestRepository;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть бажану суму в USD для конвертації \uD83D\uDCB0\uD83D\uDCB0\uD83D\uDCB0:");

        int number = sc.nextInt();
        System.out.println("Дякую! Ви зазначили, що бажаєте обміняти " + number + " $");

        CurrencyConverter newCur = new CurrencyConverter(1,36.55f);
        var totalAmount = newCur.calculateTotalAmount(number);
        System.out.println("Сума до виплати: " + totalAmount + " ₴");
    }
}
