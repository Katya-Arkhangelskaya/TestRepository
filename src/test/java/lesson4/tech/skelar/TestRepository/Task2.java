package lesson4.tech.skelar.TestRepository;

public class Task2 {
    public static void main(String[] args) {
    int[] array = {355, 564, 52, 8, 144, 76, 743, 4};

    int n = array.length;

        for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n- i -1; j++) {
            if (array[j] > array[j +1]) {
                int value = array[j];
                array[j] = array[j +1];
                array[j +1] = value;
            }
        }
    }

        System.out.println("");
        System.out.println("Sort result: \uD83D\uDCDC\uD83D\uDCDA✍\uFE0F");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

