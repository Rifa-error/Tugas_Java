import java.util.Scanner;

public class mahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah   data: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Array untuk menyimpan nama dan nilai
        String[] nama = new String[jumlahMahasiswa];
        int[] nilai = new int[jumlahMahasiswa];

        // Input data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa Ke: " + (i + 1));
            System.out.print("Nama: ");
            nama[i] = scanner.next();
            System.out.print("Nilai: ");
            nilai[i] = scanner.nextInt();
        }

        // Hitung jumlah dan rata-rata nilai
        int jumlahNilai = 0;
        for (int nilaiMahasiswa : nilai) {
            jumlahNilai += nilaiMahasiswa;
        }
        double rataRata = (double) jumlahNilai / jumlahMahasiswa;

        // Tampilkan daftar nilai
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("No\tNama\tNilai\tStatus");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(i + 1 + "\t" + nama[i] + "\t" + nilai[i] + "\t");
            if (nilai[i] >= 60) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus");
            }
        }

        // Tampilkan jumlah dan rata-rata
        System.out.println("\nJumlah: " + jumlahNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}