import java.util.Scanner;

public class MeterToFeetConvert {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang dalam meter: ");
        double meter = scanner.nextDouble();
        
        // Mengonversi meter ke feet
        double feet = meter * 3.281;
        
        // Menampilkan hasil konversi
        System.out.println(meter + " meter sama dengan " + feet + " kaki.");
        
        // Menutup scanner
        scanner.close();
    }
}