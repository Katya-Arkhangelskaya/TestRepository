package test;

public class TypeInt {

    // Переменные типа int способны хранить целые числа в диапазоне от ~-2 миллиарда до ~+2 миллиарда
    int x;
    int y;
    int z;
    int имя1, имя2, имя3;

    int day;
    int month;
    int year;
    int day1, month1, year1;

    int name1 = 1, name2 = 2, name3 = 3;



    /**
    public static void main(String[] args) {
        int a = 5, b = 10, c = a + b;
        System.out.println(c);
    }
     */



    // Вычисление целочисленных выражений
    /**
    public static void main(String[] args) {
        int a = (2 + 2) * 2;
        int b = (6 - 3) / (9 - 6);
        int c = (-2) * (-3);

        int f = 1;
        int g = 2;
        int h = f * g + 2;

        int x = 5;
        x = x + 1;
        x = x + 1;
        x = x + 1;
        x = x + 1;
        x = x + 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(h);
        System.out.println(x);
    }
     */





    // Деление целых чисел
    /**
    public static void main(String[] args) {
        int a = 3 / 2; // 1,5
        int b = 4 / 2; // 2
        int k = -8 / 8; // -1
        int g = 5 / 3; // 1,6666666667
        int h = 5 / 4; // 1,25

        System.out.println(a);
        System.out.println(b);
        System.out.println(k);
        System.out.println(g);
        System.out.println(h);
    }
     */






    // Остаток от деления целых чисел
    /**
    public static void main(String[] args) {
        int a = 5 % 2;
        int b = 20 % 4;
        int c = 9 % 5;
        int d = 1 % 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
     */





    // Инкремент и декремент
    // a++; - Увеличение на единицу, то же самое что a = a + 1;
    // a--; - Уменьшение на единицу, то же самое что a = a - 1;
    /**
    public static void main(String[] args) {
        int k = 5;
        k++;
        k++;
        k++;
        k++;
        k++;

        int x = 5;
        x--;
        x--;
        x--;
        x--;
        x--;
        x--;

        System.out.println(k);
        System.out.println(x);
    }
     */





    // Тип double - вещественные числа
    /**
    public static void main(String[] args) {
        double name1 = 1.0, name2 = 2, name3 = 3.12;

        int t = 1000;
        double x =  t * t;

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(x);
        System.out.println(5 * 2);
        System.out.println(5 * 2.0);


        int l = (int)(5.5); // В переменной x хранится значение 5
        double a = 5.999;
        int d = (int)(a); // В переменной x хранится значение 5
        double f = 5.999;
        int b = 2;
        int s = (int)(f * b);

        System.out.println("");
        System.out.println(l);
        System.out.println(d);
        System.out.println(s);
    }
     */





    // Деление целых и вещественных чисел в Java
    /**
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double d = 1.0 * a / b;

        int h = 5;
        int k = 2;
        double j = h * 1.0 / k;

        int q = 5;
        int f = 2;
        double o = q / f * 1.0;

        System.out.println(d);
        System.out.println(j);
        System.out.println(o);
    }
     */






    // Округление вещественных чисел
    public static void main(String[] args) {

        // Метод Math.round() округляет число до ближайшего целого
        int q = (int) Math.round(4.1);
        int w = (int) Math.round(4.5);
        int e = (int) Math.round(4.9);

        // Метод Math.ceil() округляет число до целого вверх
        int r = (int) Math.ceil(4.1);
        int t = (int) Math.ceil(4.5);
        int y = (int) Math.ceil(4.9);

        // Метод Math.floor() округляет число до целого вниз
        int u = (int) Math.floor(4.1);
        int i = (int) Math.floor(4.5);
        int o = (int) Math.floor(4.9);

        //


    }
}
