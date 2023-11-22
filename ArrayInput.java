import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Jumlah Angka :");
        int jumlahAngka = scan.nextInt();
        
        System.out.println("Inputkan data berikut sebanyak "+jumlahAngka+" integer : ");
        System.out.println("----------");
        int total = 0 ;
        float rataRata;

        int[] angka = new int[jumlahAngka];

        for (int i = 0; i < jumlahAngka; i++) {
			System.out.println("Data ke-"+ i +":");
           angka[i] = scan.nextInt();
           total += angka[i];
        }

        System.out.println("Menampilkan Data ");
		
        for (int i = 0; i < jumlahAngka; i++) {
            if (angka[i] %2 == 0 ) {
                System.out.println(angka[i]+" <--Angka Genap");
            } else if (angka[i] %2 != 0) {
                System.out.println(angka[i]+" <--Angka Ganjil");
            }
        }

        rataRata = total/jumlahAngka;
        System.out.println("----------");
        System.out.println("Total Penjumlahan : "+total);
        System.out.println("Rata-Ratanya adalah : "+rataRata);


        scan.close();
    } 
}