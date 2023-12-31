import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Soal1 soal1 = new Soal1();
        Soal2 soal2 = new Soal2();
        Soal3 soal3 = new Soal3();

        System.out.print("MASUKAN (1-3) : ");
        int n = input.nextInt();

        if(n == 1){
            soal1.cetakSoalNo1();
        } else if (n == 2) {
            soal2.cetakSoalNo2();
        } else if (n == 3) {
            soal3.cetakSoalNo3();
        } else{
            System.out.println("TOLONG MASUKAN ANGKA ANTARA (1-3)");
        }
    }
}