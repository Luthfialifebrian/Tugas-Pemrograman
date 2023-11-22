public class pertukaran2 {
    public static void main(String[] args) {
        int A = 20;
        int B = 31;

        // Menampilkan nilai sebelum pertukaran
        System.out.println("Sebelum pertukaran: A = " + A + ", B = " + B);

        // Menukar nilai antara A dan B tanpa variabel sementara
        A = A + B;
        B = A - B;
        A = A - B;

        // Menampilkan nilai setelah pertukaran
        System.out.println("Setelah pertukaran: A = " + A + ", B = " + B);
    }
}
