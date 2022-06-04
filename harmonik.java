import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        double sayi = input.nextInt();
        double sonuc = 0;
        while (sayi > 0) {
            sonuc += (1 / sayi);
            sayi--;
        }

        System.out.print("Harmonik Seri Değeri = " + sonuc);

        
    }
    
}
