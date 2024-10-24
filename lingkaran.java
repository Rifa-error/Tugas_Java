import java.util.Scanner;

public class lingkaran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Konversi celcius ke fahrenheit
        System.out.print("masukan suhu dalam celcius ");
        Double celcius = input.nextDouble();
        Double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println("Suhu dalam fahrenheit: " + fahrenheit);

        // Menghitung keliling lingkaran
        System.out.print("Masukan jari-jari lingkaran");
        Double jarijari = input.nextDouble();
        Double keliling = 2 * Math.PI * jarijari;
        System.out.println("keliling lingkaran: " + keliling);

        // Menghitung luas persegi panjang
        System.out.print(" Masukan panjang persegi panjang ");
        Double panjang = input.nextDouble();
        System.out.print("Masukan lebar persegi panjang ");
        Double lebar = input.nextDouble();
        Double luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);

        // Menghitung volume kubus
        System.out.print("Masukan sisi kubus ");
        Double sisi = input.nextDouble();
        Double volume = sisi * sisi * sisi;
        System.out.println("volume kubus: " + volume);

        input.close();
    
    }
}
    

