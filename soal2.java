import java.util.Scanner;

class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); 
        int T = input.nextInt(); 
        int totalOrang = T + 1;
        int permenPerOrang = N / totalOrang;
        int sisaPermen = N % totalOrang;
        System.out.println(permenPerOrang);  
        System.out.println(sisaPermen);      

        input.close();
    }
}
