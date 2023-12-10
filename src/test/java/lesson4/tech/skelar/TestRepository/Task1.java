package lesson4.tech.skelar.TestRepository;

public class Task1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" ⬇ ⬇ ⬇ Triangle ⬇ ⬇ ⬇");
        System.out.println();

        int row = 7;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("  ");
            }

            int f = 0;
            while (f < 2 * i + 1) {
                System.out.print("\uD83D\uDD25");
                f++;
            }

            System.out.println();
        }
    }
}