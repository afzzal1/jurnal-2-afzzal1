import java.util.Scanner;

class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca jumlah permen (N) dan jumlah teman (T)
        int N = input.nextInt(); // Jumlah permen
        int T = input.nextInt(); // Jumlah teman

        // Menambahkan Dira ke dalam hitungan (jadi jumlah total orang adalah T + 1)
        int totalOrang = T + 1;

        // Menghitung jatah permen setiap orang
        int permenPerOrang = N / totalOrang;

        // Menghitung sisa permen
        int sisaPermen = N % totalOrang;

        // Menampilkan hasil
        System.out.println(permenPerOrang);  // Jatah permen setiap orang
        System.out.println(sisaPermen);      // Sisa permen yang tidak terbagi

        input.close();
    }
}
