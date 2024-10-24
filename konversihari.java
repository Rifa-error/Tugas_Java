import java.util.Scanner;

public class konversihari {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String day, dayInEnglish;
        System.out.print("Masukan Nama Hari: ");
        day = sc.nextLine().toLowerCase();

        switch (day){
        case "senin":
            dayInEnglish = "Monday";
            break;
         case "selasa":
            dayInEnglish = "Tuesday";
            break;
          case "Rabu":
             dayInEnglish = "Wenesday";
             break;
         case "Kamis":
             dayInEnglish = "Thursday";
             break;
         case "Jumat":
            dayInEnglish = "Friday";
            break;
         case "Sabtu":
            dayInEnglish = "Saturday";
            break;
          case "Minggu":
            dayInEnglish = "Sunday";
            break;
         default:
           dayInEnglish = "invalid Day";
            break;       

        }
    
        System.out.println("Hari dalam Bahasa Inggris: "+dayInEnglish);
        sc.close();    
        
    }
}
