import java.util.Scanner;

class soal1{
    public static void main(String[] args){
        try (Scanner userInput = new Scanner(System.in)){
            System.out.println("Nama:");
            String Nama = userInput.nextLine(); // Fix nextLine and Scanner variable name

            System.out.println("Usia:");
            String umur = userInput.nextLine(); // Fix Scanner method call

            System.out.println("Halo, " + Nama + "\nTernyata usiamu baru " + umur + " tahun ya!"); // Fix variable umur
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
