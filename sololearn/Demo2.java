import java.util.Scanner;

class Demo2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int fact = 1;
        for(int x=1; x <=number; x++) {
            fact *= x;
        }
        System.out.println(fact);
   }
}