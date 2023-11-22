import  java.util.Scanner;

public class Program6{
    public static void main(String[] args) {
        //your code goes here
        Scanner scanner = new Scanner(System.in);
            double bill = scanner.nextDouble();
            double tip = bill * 15 / 100;
            System.out.println(tip);

    }
}