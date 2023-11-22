import java.util.Scanner;

public class Program14{
    
    public static void bot() {
        Scanner user = new Scanner(System.in);

        int userInput = user.nextInt();

        if (userInput == 1) {
            System.out.println("Order confirmed");
        } else if (userInput == 2) {
            System.out.println("info@sololearn.com");
        } else {
            System.out.println("Try again");
        }
        
        user.close();
    }

    public static void main(String[] args) {
        bot();
    }
}