import java.util.Scanner;

public class nilaiIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalNilai = 0;
        int totalSKS = 0;
		double totalBobot = 0;

        // Menginputkan nilai mata kuliah dan sks
        for (int i = 1; i <= 4; i++) {
            System.out.print("Masukkan nilai mata kuliah " + i + " : ");
            double nilai = scanner.nextDouble();
            while (nilai < 0 || nilai > 100) {
                System.out.println("Nilai harus berada di antara 0 dan 100. Silahkan coba lagi.");
                System.out.print("Masukkan nilai mata kuliah " + i + " : ");
                nilai = scanner.nextDouble();
            }
			double bobot = 0;
			if(nilai<60){
				bobot = 0;
			}else if (nilai >= 60 && nilai <=66){
				bobot = 1;
			}else if (nilai >= 67 && nilai <=69){
				bobot = 1.3;
			}else if (nilai >= 70 && nilai <=72){
				bobot = 1.7;
			}else if (nilai >= 73 && nilai <=76){
				bobot = 2;
			}else if (nilai >= 77 && nilai <=79){
				bobot = 2.3;
			}else if (nilai >= 80 && nilai <=82){
				bobot = 2.7;
			}else if (nilai >= 83 && nilai <=86){
				bobot = 3;
			}else if (nilai >= 87 && nilai <=89){
				bobot = 3.3;
			}else if (nilai >= 90 && nilai <=92){
				bobot = 3.7;
			}else if (nilai >= 93 && nilai <=96){
				bobot = 4;
			}else if (nilai >= 97 && nilai <=100){
				bobot = 4;
			}
			
            System.out.print("Masukkan SKS mata kuliah " + i + ": ");
            int sks = scanner.nextInt();
            while (sks <= 0) {
                System.out.println("SKS harus lebih besar dari 0. Silakan coba lagi.");
                System.out.print("Masukkan SKS mata kuliah " + i + ": ");
                sks = scanner.nextInt();
            }
			totalBobot += bobot;
            totalNilai += bobot * sks;
            totalSKS += sks;
        }
			System.out.println("Total Bobot : " + totalBobot + ", Total Nilai : " + totalNilai + ", Total SKS : " + totalSKS);
        // Menghitung IP
        double ip = totalNilai / totalSKS ;

        // Menampilkan hasil IP
        System.out.println("IP Mahasiswa: " + ip);
    }
}