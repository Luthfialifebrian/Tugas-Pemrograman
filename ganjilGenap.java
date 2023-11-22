import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Angka :");
        int angka = scan.nextInt();

        if (angka %2 == 0 ) {
            System.out.println("Angka Genap");
        } else if (angka %2 != 0) {
            System.out.println("Angka Ganjil");
        }

        scan.close();
    } 
}