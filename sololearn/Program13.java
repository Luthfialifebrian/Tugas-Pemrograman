import java.util.Scanner;

public class Program13{
    
    public static void main(String[] args) {
        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner cash = new Scanner(System.in);
        
        int row = cash.nextInt();
        int column = cash.nextInt();

        if (row >= 0 && row < seats.length && column >= 0 && column < seats[row].length) {
            if (seats[row][column] == 0) {
                System.out.println("Free");
            } else {
                System.out.println("Sold");
            }
        } else {
            System.out.println("invalid seat selection");
        }
    }

}