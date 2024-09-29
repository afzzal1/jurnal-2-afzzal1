import java.util.Scanner;

class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjangPersegiPanjang = input.nextInt();
        int lebarPersegiPanjang = input.nextInt();
        int sisiKotak = input.nextInt();
        boolean kotakMasuk = (sisiKotak <= panjangPersegiPanjang && sisiKotak <= lebarPersegiPanjang);
        System.out.println("Kotak dapat masuk ke dalam Persegi Panjang? " + kotakMasuk);

        input.close();
    }
}
