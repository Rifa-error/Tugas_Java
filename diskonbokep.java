import java.util.Scanner;

public class diskonbokep {
    public static void main(String[] args) throws Exception {
        double totalBayar, discount;
        Scanner inputx = new Scanner(System.in);

        discount = 5000.0;
        System.out.print("Masukan Total Belanja: ");
        totalBayar = inputx.nextDouble();

        if (totalBayar > 50000) {
            totalBayar -= discount;
        }
        
        System.out.println("Total bayar: " + totalBayar);
        inputx.close();
    }
}
