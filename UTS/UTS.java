package UTS;
import java.util.ArrayList;
import java.util.Scanner;

class Innermahasiswasks {
    String nama;
    int sks;
    String nilai;
    int bobot;

    public Innermahasiswasks(String nama, int sks, String nilai) {
        this.nama = nama;
        this.sks = sks;
        this.nilai = nilai;
        this.bobot = konversiNilai(nilai);
    }

    int konversiNilai(String nilai) {
        switch (nilai.toUpperCase()) {
            case "A": return 4;
            case "B": return 3;
            case "C": return 2;
            case "D": return 1;
            case "E": return 0;
            default: return 0;

        }
    }

}
public class UTS{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Innermahasiswasks> daftarMataKuliah = new ArrayList<>();

        System.out.println("Daftar Nama Kuliah: ");
         while (true) {
            System.out.print("Nama Mata Kuliah (ketik 'y' jika ingin berhenti)");
            String namaMataKuliah = scanner.nextLine();

            if (namaMataKuliah.equalsIgnoreCase("y")){
                break;
            }

            System.out.print("Jumlah SKS: ");
            int sks = scanner.nextInt();

            System.out.print("Nilai A, B, C, D, atau E):");
            String nilai = scanner.next();
            scanner.nextLine();

            daftarMataKuliah.add(new Innermahasiswasks (namaMataKuliah, sks, nilai));
         }
         int totalSKS = 0;
         double totalNilai = 0;

         System.out.println("Nama Mahasiswa : " + namaMahasiswa);
         System.out.println("Semester : " + semester);
         System.out.println("====================================================================================================");
         System.out.printf("%-20s %-5s %-7s %-5s\n",
                        "Mata Kuliah", "SKS", "Nilai", "Bobot");

                        System.out.println("--------------------------------------------------------------------------------------");
                        for (Innermahasiswasks mk : daftarMataKuliah) {
                            System.out.printf("%-20s %-5s %-7s %-5s\n",
                                            mk.nama, mk.sks, mk.nilai, mk.bobot);
                                            totalSKS += mk.sks;
                                            totalNilai += mk.sks * mk.bobot;

                        }

                        double nilaiRataRata = totalNilai / totalSKS;

                        System.out.println("------------------------------------------------------------------------------");
                        System.out.println("Total SKS yang diambil: "  + totalSKS);
                        System.out.printf("Nilai rata - rata: %.2f\n", nilaiRataRata);
                        System.out.println("===============================================================================");

                        scanner.close();


    }

}



