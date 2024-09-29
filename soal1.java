import java.util.Scanner;

class soal1{
    public static void main(String[] args){
        try (Scanner userInput = new Scanner(System.in)){
            System.out.println("Nama:");
            String Nama = userInput.nextLine(); 

            System.out.println("Tahun");
            String Tahun = userInput.nextLine();

            System.out.println("Usia:");
            String umur = userInput.nextLine(); 

            System.out.println("Halo, " + Nama + "\nTernyata usiamu baru " + umur + " tahun ya!"); 
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
