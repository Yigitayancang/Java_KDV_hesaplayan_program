// 1 ADIM : Kullanıcı girişi için kütüphane eklenimi
import java.util.Scanner;
 public class kdvhesaplayanprogram {
    
    public static void main(String[] args) {
        // 2 ADIM : Double veri tipinde tutulan veriler 
        double tutat , kdvtutar = 0.18;
        // 3 ADIM : Kullanıcıdan veri alma 
        Scanner giris = new Scanner(System.in);
        System.out.println("ÜCRET TUTARINI GİRİNİZ");
        tutat=giris.nextDouble();
        // 4 ADIM : Girilen değerlerin hesaplanması 
        double kdv = tutat * kdvtutar;
        double toplam = tutat + kdv;
        // 5 ADIM = Hesaplanan değerlerin ekrana bastırılması 
        System.out.println("KDV'siz Tutar : " + tutat);
        System.out.println("KDV Oranı : " + kdvtutar);
        System.out.println("Uygulanan Kdv tutarı : " + kdv);
        System.out.println("ÖDENECEK ÜCRET : " + toplam);
    }
    
 }