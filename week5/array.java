package week5;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan jumlah data: ");
        int n = inputan.nextInt();
        String[] mahasiswa= new String[n];

        for(int i=0; i<n; i++){
            System.out.print("m=Masukan Nama Mahasiswa: ");
            mahasiswa[i] = inputan.next();
        }

        System.out.print("Nama-nama Mahasiswa yang di input: ");
        for(int a=0; a<mahasiswa.length; a++) {
            System.out.print(mahasiswa[a]+" ");
        }
        inputan.close();

        

    }
    
}
