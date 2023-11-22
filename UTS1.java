import java.util.Scanner;

public class UTS1 {
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Jumlah Barang Belanja : ");
		
		//Int totalBelanja;
		int[] hargaBarang = {2500, 3000, 4000, 5000, 6000};
		
			//System.out.println(hargaBarang.length);
		int jumlahBelanja;
		for (int i = 0; i < hargaBarang.length ; i++) {
			System.out.println("Jumlah Belanja Item-"+i+" : "); 
			jumlahBelanja = scan.nextInt();
		}
			System.out.println("Daftar Belanja dan Harga : ");
		for (int i = 0; i < hargaBarang.length ; i++) {
			System.out.println("Harga barang ke-"+i+", ");
		}	

		scan.close();
	}
}