import java.util.Scanner;

public class ganjilgenap {
    public static boolean cekGenap(int bilangan) {
        return bilangan % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bilangan;
    
        System.out.print("Masukan bilangan: ");
        bilangan = scan.nextInt();
        scan.close();

        System.out.println(bilangan + (cekGenap(bilangan) ? " adalah " : " bukan ") + "bilangan genap"); 

    }
    
    
}
