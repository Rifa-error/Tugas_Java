package UTS;
import java.util.Scanner;
public class upahlembur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan gaji bulanan: ");
        double gajibulanan = scanner.nextDouble();

        System.out.print("Masukan jam lembur: ");
        int jamLembur = scanner.nextInt();

        double upahLemburPerJam = (gajibulanan / 150);
        double totalUpahLembur;

        if (jamLembur > 5 ) {
            totalUpahLembur = (5 * upahLemburPerJam) + ((jamLembur - 5)* 1.5 * upahLemburPerJam);
        } else {
            totalUpahLembur = jamLembur * upahLemburPerJam;
        }
        double totalGaji = (gajibulanan + totalUpahLembur);

        System.out.println("Upah lembur per jam: " + (int)upahLemburPerJam);
        System.out.println("Total gaji:" + (int)totalGaji);
        scanner.close();
    }
    
}
