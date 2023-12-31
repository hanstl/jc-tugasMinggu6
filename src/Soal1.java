public class Soal1 {
    public void cetakSoalNo1(){
        for (int i = 1; i < 101; i++) {
            if(i%3 == 0 && i%5 == 0 ){
                System.out.println("BIZZBUZZ");
            } else if (i%3 == 0) {
                System.out.println("BIIZZ");
            } else if(i%5 == 0){
                System.out.println("BUZZ");
            }
            else{
                System.out.println(i);
            }

        }
    }
}
