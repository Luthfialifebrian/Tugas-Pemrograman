import java.util.Scanner;
	
	public class profit {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Masukkan jumlah modal: ");
			double modal = sc.nextDouble();
			
			System.out.print("Masukkan persentase keuntungan: ");
			double keuntungan = sc.nextDouble();
			
			double profit = modal + (modal * keuntungan);
			
			System.out.print("Modal: " + modal);
			System.out.print("  Keuntungan: " + keuntungan + "%");
			System.out.print("  Profit saat ini: " + profit);
		}
	}