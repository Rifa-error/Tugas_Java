import java.util.Scanner;

public class iseng2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan gajiu bulanan: ");
        double gajibulanan = scanner.nextDouble();

        System.out.print("Masukan jam lembur: ");
        int jamLembur = scanner.nextInt();

        double upahLemburPerJam = (gajibulanan / 173);
        double totalUpahLembur;

        if (jamLembur > 4) {
            totalUpahLembur = (4 * upahLemburPerJam) + ((jamLembur - 4) * 2 * upahLemburPerJam);
        } else {
            totalUpahLembur = jamLembur * upahLemburPerJam;
        }
         double totalGaji = (gajibulanan + totalUpahLembur);

         System.out.println("Upah lembur per jam: " + (int)upahLemburPerJam);
         System.out.println("Total gaji:" + (int)totalGaji);
         scanner.close();
    }
    
}
