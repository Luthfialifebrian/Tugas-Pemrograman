import  java.util.Scanner;

public class Program8{
    public static void main(String[] args) {
        //your code goes here
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();

        int box;

        switch (color) {
            case "red":
                box = 1;
                break;
            case "green":
                box = 2;
                break;
            case "black":
                box = 3;
                break;
            default:
                box = 0;
                break;
        }

        if (box != 0) {
            System.out.println(box);
        } else {
            System.out.println("unknown color");
        }
    }
}