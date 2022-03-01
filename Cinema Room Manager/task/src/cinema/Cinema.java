package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Step 1 - prints out cinema seat view
        int[][] cinemaSeats = new int[7][8];
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        int counter = 1;
        for(int i = 0; i < cinemaSeats.length; i++){
            System.out.print(counter);
            for(int j = 1; j <= cinemaSeats[i].length; j++){
                System.out.print(" S");
            }
            counter++;
            System.out.println();
        }

        // Step 2 - calculate ticket price based on cinema size
        Scanner enterNumber = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numberOfRows = enterNumber.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numberOfSeats = enterNumber.nextInt();
        int cinemaSize = numberOfRows * numberOfSeats;

        if(cinemaSize <= 60){
            double ticketPrice = 10;
            double totalIncome = ticketPrice * cinemaSize;
            System.out.println("Total income:");
            System.out.println("$" + totalIncome);

        } else if (cinemaSize > 60){
            int frontRows = numberOfRows / 2;
            double ticketPriceFrontRows = 10;
            double income1 = ticketPriceFrontRows * frontRows * numberOfSeats;
            int backRows = numberOfRows - frontRows;
            double ticketPriceBackRows = 8;
            double income2 = ticketPriceBackRows * backRows * numberOfSeats;
            double totalIncome = income1 + income2;
            System.out.println("Total income:");
            System.out.println("$" + totalIncome);
        } else {
            System.out.println("Invalid number.");
        }

    }
}