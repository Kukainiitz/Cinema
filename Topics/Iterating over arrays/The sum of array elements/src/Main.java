import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for (int element : array) {
            array[element] = scanner.nextInt();
            sum = sum + array[element];
        }
        System.out.print(sum);
    }
}
