import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda: ");
        String nama = userInput.nextLine();
        
        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = userInput.nextInt();
        
        int tahunSekarang = 2024;
        
        int umur = tahunSekarang - tahunLahir;
        
        System.out.println("Halo, " + nama + ".");
        System.out.println("Ternyata usiamu baru " + umur + " tahun ya!");
        
        userInput.close();
    }
}