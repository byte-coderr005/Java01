//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class Main {
    //SAYI Tahmin oyunu
    public static int rastgeleSayiUret(int min,int max)
    {
        Random random = new Random();
        int maxDeger = random.nextInt(max - min + 1) + min;
        return maxDeger;
    }

    public static void oyunuBaslat()
    {
        System.out.println("Sayı tahmin oyununa hoşgeldin");
        System.out.println("1 ile 100 arasında bir sayi tuttum. Tahmin et!");
    }
    public static void ipucuVer(int tahmin,int hedef)
    {
        if(tahmin < hedef)
        {
            System.out.println("Daha büyük bir sayi gir.");

        }else {
            System.out.println("Daha kücük bir sayi gir.");
        }

    }
    public static void main(String[] args) {
        oyunuBaslat();
        int hedefSayi = rastgeleSayiUret(1,10);
        Scanner scanner = new Scanner(System.in);
        int tahmin = scanner.nextInt();
        int hak = 3;
        while(hak > 0) {
            if (hedefSayi == tahmin) {
                System.out.println("Tahmin Dogru");
                break;
            } else {
                System.out.println("Yanlış tahmin");
                hak--;
                System.out.println("Lutfen yeni tahmininizi girin:  Kalan Hak: " + hak);
                ipucuVer(tahmin,hedefSayi);
                tahmin = scanner.nextInt();
            }
        }
        System.out.println("Dogru sayi: " + hedefSayi);
        }
    }
