import java.util.Scanner;

public class KodeNegara2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// Konversi kode negara
        System.out.print("Masukkan kode negara (2 huruf): ");
        String kodeNegara = scanner.next().toUpperCase();
        String namaNegara;

       switch (kodeNegara) {
            case "ES":
                namaNegara = "Spain";
                break;
            case "TN":
                namaNegara = "TUNISIA";
                break;
            case "ID":
                namaNegara = "INDONESIA";
                break;
            case "MM":
                namaNegara = "MYANMAR";
                break;
            case "IN":
                namaNegara = "INDIA";
                break;
            default:
                System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
                return;
        }

        System.out.println("Nama negara: " + namaNegara);
    }
}