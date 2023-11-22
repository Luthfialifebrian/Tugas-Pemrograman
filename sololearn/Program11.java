import  java.util.Scanner;

public class Program11{
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        
        int choice;

        //check if the input is an integer
        if (sc.hasNextInt()) {
            choice = sc.nextInt();

            //check if the choice is within the valid range
                if (choice >= 0 && choice < menu.length) {
                String dDrink = menu[choice];
                System.out.println(dDrink);
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("invalid input. Please enter a valid integer.");
        }


    }

}