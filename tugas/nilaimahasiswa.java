 import java.util.ArrayList;
import java.util.Scanner;

public class nilaimahasiswa {
    public static void main(String[] args) {

        // number 1
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int jmlData = input.nextInt();

        int standardNilai = 76;
        String[][] daftarMhs = new String[jmlData][3];
        for (int i = 0; i < jmlData; i++) {
            System.out.println("------------------");
            System.out.println("Mahasiswa Ke : " + (i + 1));
            System.out.print("Nama     : ");
            daftarMhs[i][0] = input.next();
            System.out.print("Nilai    : ");
            daftarMhs[i][1] = input.next();
            if (Integer.parseInt(daftarMhs[i][1]) >= standardNilai) {
                daftarMhs[i][2] = "LULUS";
            }else {
                daftarMhs[i][2] = "TIDAK LULUS";
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("===============================");
        System.out.println("No\t\tNama\t\tNilai\t\tStatus");

        int no = 1;
        int totalNilai = 0;
        for (String[] mhs : daftarMhs) {
            totalNilai += Integer.parseInt(mhs[1]);
            System.out.println(no++ + "\t\t" + mhs[0] + "\t\t" + mhs[1] + "\t\t\t" + mhs[2]);
        }
        System.out.println("===============================");
        float rataRata = ( (float) totalNilai) / ((float) jmlData) ;
        System.out.println("Jumlah : " + totalNilai);
        System.out.println("Rata - Rata : " + rataRata);
    }
}
