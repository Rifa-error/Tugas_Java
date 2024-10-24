import java.util.Scanner;

public class codingcoyy {
    public static void main(String[] args) throws Exception{
        double totalBayar, discount;
        String isMember;
        Scanner inputx = new Scanner(System.in);
        System.out.print("Masukan Total Belanja ");
        totalBayar = inputx.nextDouble();
        System.out.print("Apakah ada member?: ");
        isMember = inputx.next().toLowerCase();

        if (totalBayar >= 200000) {
            discount = 15.0/100.0*totalBayar;
            totalBayar -= discount;
            if (isMember.equals("y") || isMember.equals("ya")) {
                discount = 10.0/100.0*totalBayar;
                totalBayar -= discount;
            }
        }else if (totalBayar >= 100000) {
            discount = 10.0/100.0*totalBayar;
            totalBayar -= discount;
            if (isMember.equals("y") || isMember.equals("ya")) {
                discount = 10.0/100.0*totalBayar;
                totalBayar -= discount;
            
            }
        }else {
            discount = 0.0;
            totalBayar -= discount;
            if (isMember.equals("y") || isMember.equals("ya")) {
                discount = 10.0/100.0*totalBayar;
                totalBayar -= discount;
            }
        }
        System.out.println("Total bayar: " + totalBayar);
        inputx.close();
    }
    
}
