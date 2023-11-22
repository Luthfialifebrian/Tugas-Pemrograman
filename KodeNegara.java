import java.util.Scanner;

public class KodeNegara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// Konversi kode negara
        System.out.print("Masukkan kode negara (2 huruf): ");
        String kodeNegara = scanner.next().toUpperCase();
        String namaNegara;

        if (kodeNegara.equals("ES")) {
            namaNegara = "Spain";
        } else if (kodeNegara.equals("TN")) {
            namaNegara = "TUNISIA";
        } else if (kodeNegara.equals("ID")) {
            namaNegara = "INDONESIA";
        } else if (kodeNegara.equals("MM")) {
            namaNegara = "Myanmar";
        } else if (kodeNegara.equals("IN")) {
            namaNegara = "INDIA";
        } else {
            System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
            return;
        }

        System.out.println("Nama negara: " + namaNegara);
    }
}