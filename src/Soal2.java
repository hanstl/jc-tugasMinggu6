import java.sql.Struct;

public class Soal2 {
    public void cetakSoalNo2() {
        int n = 5;
        String cetak = "";
        for (int i = 1; i < n*2; i++) {
            if(i%2==0){
                cetak+="_";
            }
            else{
                cetak = cetak+ String.valueOf(i);
            }
        }
        int panjang = cetak.length();
        for (int i = 0; i < n; i++) {
            System.out.println(cetak.substring(0+i,panjang-i));
        }
    }
}
