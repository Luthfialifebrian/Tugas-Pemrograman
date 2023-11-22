import java.util.Scanner;

public class cashier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hargaBarang = {2500, 3000, 4000, 5000, 6000};
        int[] jumlahItem = new int[hargaBarang.length];
        int totalBelanja = 0;
        int totalItem = 0;
        System.out.println("Inputkan jumlah barang belanja:");
        for (int i = 0; i < hargaBarang.length; i++) {
            System.out.print("Jumlah belanja item " + i + " (RP " + hargaBarang[i] + "): ");
            jumlahItem[i] = scan.nextInt();
        }
        System.out.println("\nDaftar barang dan harga:");
        for (int i = 0; i < hargaBarang.length; i++) {
            int subtotal = hargaBarang[i] * jumlahItem[i];
            System.out.println("Harga barang ke " + i + " " + hargaBarang[i] + ", " + jumlahItem[i] + " item " + subtotal);
            totalBelanja += subtotal;
            totalItem += jumlahItem[i];
        }
        System.out.println("Total item: " + totalItem);
        System.out.println("Total belanja RP " + totalBelanja);

        scan.close();
    }
}