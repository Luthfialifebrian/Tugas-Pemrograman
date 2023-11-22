public class pertukaran {
    public static void main(String[] args) {
        int A = 20;
        int B = 31;

        // Menampilkan nilai sebelum pertukaran
        System.out.println("Sebelum pertukaran: A = " + A + ", B = " + B);

        // Menukar nilai antara A dan B tanpa variabel sementara
        int tempA = A;
		A = B;
        B = tempA;

        // Menampilkan nilai setelah pertukaran
        System.out.println("Setelah pertukaran: A = " + A + ", B = " + B);
    }
}
