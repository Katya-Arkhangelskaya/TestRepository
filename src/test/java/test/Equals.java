package test;

import java.util.Scanner;

public class Equals {
    /**
     public static void main(String[] args) {
     String s1 = "Привет";
     String s2 = "ПРИВЕТ";
     String s3 = s1.toUpperCase();

     System.out.println(s1.equals(s2));
     System.out.println(s1.equals(s3));
     System.out.println(s2.equals(s3));
     }
     */


    /**
     public static void main(String[] args) {
     String s1 = "Привет";
     String s2 = "ПРИВЕТ";
     String s3 = s1.toUpperCase();

     System.out.println(s1.equalsIgnoreCase(s2));
     System.out.println(s1.equalsIgnoreCase(s3));
     System.out.println(s2.equalsIgnoreCase(s3));
     }
     */


    /**
     public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
     String a = console.nextLine();
     String b = console.nextLine();
     String result = a.equals(b) ? "Одинаковые" : "Разные";
     System.out.println(result);
     }
     */


    /**
     * public static void main(String[] args) {
     * // Однакові посилання
     * String text = "Это очень важное сообщение";
     * String message = "Это очень важное сообщение";
     * <p>
     * System.out.println(text==message);
     * <p>
     * int hashCodeText = System.identityHashCode(text);
     * System.out.println(hashCodeText);
     * <p>
     * int hashCodeMessage = System.identityHashCode(message);
     * System.out.println(hashCodeMessage);
     * <p>
     * System.out.println();
     * <p>
     * // Різні посилання
     * String text1 = "Это очень важное сообщение";
     * String message1 = new String("Это очень важное сообщение");
     * <p>
     * System.out.println(text1==message1);
     * <p>
     * int hashCodeText1 = System.identityHashCode(text);
     * System.out.println(hashCodeText1);
     * <p>
     * int hashCodeMessage1 = System.identityHashCode(message1);
     * System.out.println(hashCodeMessage1);
     * <p>
     * System.out.println();
     * <p>
     * // Різні посилання інший метод
     * String text2 = "Это очень важное сообщение";
     * String message2 = new String (text2);
     * <p>
     * System.out.println(text2==message2);
     * <p>
     * int hashCodeText2 = System.identityHashCode(text2);
     * System.out.println(hashCodeText2);
     * <p>
     * int hashCodeMessage2 = System.identityHashCode(message2);
     * System.out.println(hashCodeMessage2);
     * }
     */




    /**
    public static void main(String[] args) {

        String s1 = "JavaRush - лучший сайт для изучения Java!";
        String s2 = new String("JavaRush - лучший сайт для изучения Java!");
        System.out.println(s1.equals(s2));
    }
     */




    public static void main(String[] args) {

        String s1 = "JavaRush - лучший сайт для изучения Java!";
        String s2 = new String("JavaRush - лучший сайт для изучения Java!");
        System.out.println(s1 == s2.intern());

    }
}

