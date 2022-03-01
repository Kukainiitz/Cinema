import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int test = scanner.nextInt();
        int counter = 0;
        for (int element : array) {
            if (element == test) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
