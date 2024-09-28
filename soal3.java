import java.util.Scanner;

class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca masukan panjang dan lebar persegi panjang
        int panjangPersegiPanjang = input.nextInt();
        int lebarPersegiPanjang = input.nextInt();

        // Membaca panjang sisi kotak
        int sisiKotak = input.nextInt();

        // Memeriksa apakah kotak dapat masuk ke dalam persegi panjang
        boolean kotakMasuk = (sisiKotak <= panjangPersegiPanjang && sisiKotak <= lebarPersegiPanjang);

        // Menampilkan hasil
        System.out.println("Kotak dapat masuk ke dalam Persegi Panjang? " + kotakMasuk);

        input.close();
    }
}
