package test;

import java.util.Scanner;

public class IfElse {
    /**
     public static void main(String[] args) {
     int age = 18;

     if(age < 17)
     System.out.println("Доступ заборонений");
     else
     System.out.println("Доступ надано");
     }
     */


    /**
     public static void main(String[] args) {
     int temperature = 10;
     if(temperature < 0)
     System.out.println("Cold");
     else
     System.out.println("Warm");
     }
     */


    /**
     public static void main(String[] args) {
     int price = 999;

     if(price == 999)
     {
     System.out.println("Нормальна ціна)");
     System.out.println("Можна купляти)))");
     }
     else
     System.out.println("Треба подумати");
     }
     */


    /**
     public static void main(String[] args) {
     int test = 10;
     if(test > 15)
     System.out.println("Pass");
     else
     {
     }
     }
     */


    /**
     * public static void main(String[] args) {
     * int test = 10;
     * if(test > 15)
     * System.out.println("Pass");
     * }
     */



//    Якщо температура вища за 20 градусів - надіти сорочку
//    Якщо температура вище 10 градусів і менше (або дорівнює) 20 - надягти светр
//    Якщо температура вище 0 градусів і менше (або дорівнює) 10 - надіти плащ
//    Якщо температура нижче 0 градусів – надіти пальто.
    /**
    public static void main(String[] args) {
        int temperature = -15;

        if (temperature > 20) {
            System.out.println("Одягнути сорочку");
        } else {
            if (temperature > 10) {
                System.out.println("Одягнути світер");
            } else {
                if (temperature > 0) {
                    System.out.println("Одягути плащ");
                } else
                    System.out.println("Одягнути пальто");
            }
        }
    }
    */






    /**
    public static void main(String[] args) {
        int temperature = 9;

        if (temperature > 20) {
            System.out.println("надеть рубашку");
        } else if (temperature > 10) {
            System.out.println("надеть свитер");
        } else if (temperature > 0) {
            System.out.println("надеть плащ");
        } else {
            System.out.println("надеть пальто");
        }
    }
     */





    /**
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        if (a < b)
            System.out.println(a);
        else
            System.out.println(b);
        }
     */






    /**
    public static void main(String[] args) {
        int age = 25;
        int money;
        if (age > 30)
            money = 100;
        else
            money = 50;


        // OR
        int age1 = 25;
        int money1 = age > 30 ? 100 : 50;
    }
     */





    /**
    public static void main(String[] args) {
    double a = 1.000001;
    double b = 1.000002;

    if (Math.abs(b - a) < 0.0001 )
            System.out.println("Числа равны");
    else
        System.out.println("Числа не равны");
    }
     */








}



