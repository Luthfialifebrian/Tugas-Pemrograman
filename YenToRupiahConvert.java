import java.util.Scanner;

public class YenToRupiahConvert {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah Yen Jepang: ");
        double yen = scanner.nextDouble();
        
        // Menghitung nilai tukar 1 Yen Jepang ke Rupiah Indonesia (contoh: 1 Yen = 140 Rupiah)
        double exchange = 105.02;
        
        // Mengonversi Yen Jepang ke Rupiah Indonesia
        double rupiah = yen * exchange;
        
        // Menampilkan hasil konversi
        System.out.println(yen + " Yen Jepang sama dengan " + rupiah + " Rupiah Indonesia.");
        System.out.println("Berdasarkan kurs saat ini (11 Oktober 2023)");
        // Menutup scanner
        scanner.close();
    }
}
