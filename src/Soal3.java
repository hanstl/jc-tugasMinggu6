public class Soal3 {
    public void cetakSoalNo3(){
        // DATA AWAL
        String t1_1 = "202112SOAL3";
        String t2_1 = "SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT";

        String t1_2 = "202111SOAL3";
        String t2_2 = "SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT";

        String t1_3 = "202110SOAL3";
        String t2_3 = "SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT";

        // CEK PANJANG DATA
//        System.out.println(t2_1.length());
//        System.out.println(t2_2.length());
//        System.out.println(t2_3.length());

        // DEFINISI INDEX PEMBAGI
        int idxPotong = 18;

        // UJI PEMBAGIAN DATA ke TRAILER
//        for (int i = 0; i < 5; i++) {
//            System.out.println(t2_1.substring(idxPotong*i,idxPotong*(i+1)));
//        }

//        String[] hasil1 = pemotongString(t2_1,18);
//        for (int i = 0; i < hasil1.length; i++) {
//            System.out.println(hasil1[i]);
//        }

        // MEMBUAT ARRAY SETIAP DATA
        String[] t2_1_array = pemotongString(t2_1,idxPotong);
        String[] t2_2_array = pemotongString(t2_2,idxPotong);
        String[] t2_3_array = pemotongString(t2_3,idxPotong);

        // MEMBUAT DATA SETELAH SHUFFLE
        String cetak1 = merubahPosisi(t2_1_array);
        String cetak2 = merubahPosisi(t2_2_array);
        String cetak3 = merubahPosisi(t2_3_array);

        System.out.println("=== DATA BEFORE ===");
        System.out.println(":T1:"+t1_1);
        System.out.println(":T2:"+t2_1+"\n");

        System.out.println(":T1:"+t1_2);
        System.out.println(":T2:"+t2_2+"\n");

        System.out.println(":T1:"+t1_3);
        System.out.println(":T2:"+t2_3+"\n");

        System.out.println("=== DATA AFTER ===");
        System.out.println(":T1:"+t1_1);
        System.out.println(":T2:"+cetak1+"\n");

        System.out.println(":T1:"+t1_2);
        System.out.println(":T2:"+cetak2+"\n");

        System.out.println(":T1:"+t1_3);
        System.out.println(":T2:"+cetak3+"\n");
    }

    public String[] pemotongString(String text,int cut){
        int jumlhPerulangan = text.length()/cut;
        String[] hasilPotong = new String[jumlhPerulangan];
        for (int i = 0; i < jumlhPerulangan; i++) {
            hasilPotong[i] = text.substring(cut*i,cut*(i+1));
        }
        return hasilPotong;
    }

    public String merubahPosisi(String[] inputString){
        int jmlh = inputString.length;
        int[] urutan = {3,4,5,1,2};
        String kataOutput = "";
        for (int i = 0; i < jmlh; i++) {
            kataOutput = kataOutput + inputString[urutan[i]-1];
//            System.out.println(kataOutput+"ini urutan "+(urutan[i]));
        }
        return kataOutput;
    }
}
