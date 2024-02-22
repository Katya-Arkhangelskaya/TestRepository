package test;

public class BaseInfo {

    // Переменные
    /**
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println("Amigo");
        System.out.println("Risha & Amigo");

        // Создаем переменную по имени a типа int.
        int a;

        // Создаем переменную по имени s типа String.
        String s;

        // Создаем переменную по имени c типа double.
        double c;

        int i;
        int а, b;
        int x;

        a = 1;
        b = a + 1;

        x = 3;
        x = x + 1;

        int f = 5;
        int q = 6;
        String l = "I'm Amigo";
    }
     */




    // Тип int
    /**
    public static void main(String[] args) {
        int a = 64;
        int b = a/8;
        int c = b/4;
        int d = c*3;

        System.out.println("Result: " + d);
    }
    */




    // Тип String
    /**
    public static void main(String[] args) {
        String s = "Amigo _";
        String d = "123 _";
        String k = "Bond 007 _";
        int x = 333;
        String j = "Test" + 333;
        String имя1, имя2, имя3;
        String name = "Ееее", city = "New York", message = "Hello!";

        System.out.println("Result: " + s + " " + d + " " + k + " " + j +" :)");
    }
     */




    /**
     * Метод возвращает максимальное значение
     * из трех переданных аргументов
     * @param a - первый параметр
     * @param b - второй параметр
     * @param c - третий параметр
     * @return - максимальный из параметров

    public int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    */




    // Преобразование строки в число
    /**
    public static void main(String[] args) {
        String a = "1";
        int x = Integer.parseInt(a);
        System.out.println(x);
    }
     */




    // Перевод объекта/примитива в строку
    /**
    public static void main(String[] args) {
        String a = String.valueOf(1);
        String b = String.valueOf(12.0D);
        String c = String.valueOf(123.4F);
        String d = String.valueOf(123456L);
        String s = String.valueOf(true);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
    }
     */





    // Методы работы со строками

    // length() позволяет узнать длину строки – сколько в ней символов
    /**
    public static void main(String[] args) {
        String m = "Test";
        int count = (m + 4 + 444).length() + 12;
        System.out.println("Result: " + count);
    }
     */




    // Метод toLowerCase() позволяет преобразовать все символы строки в маленькие (строчные)
    /**
    public static void main(String[] args) {
        String name = "ROM123";
        String name2 = name.toLowerCase();
        System.out.println(name2);
    }
     */




    // Метод toUpperCase() позволяет преобразовать все символы строки в большие (заглавные)
    /**
    public static void main(String[] args) {
        String name = "rom123";
        String name2 = name.toUpperCase();
        System.out.println(name2);
    }
     */
}
