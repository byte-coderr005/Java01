import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] sayilar = new int[5]; // 5 elemanlı bir integer dizisi
//        int[] sayilar2 = {1,2,3,4,5};
//        int[] sayilar3;
//        sayilar3 = new int[]{5,10,15};
//        int[][] tablo = {{1,2,3},{4,5,6} };
//        //dizi elemanina erişim:
//        System.out.println(sayilar[0]);
//        //dizi boyutu
//        System.out.println("Dizi uzunlugu: " + sayilar2.length);
//        //Dongu ile gezmek
//        for(int i = 0; i< sayilar2.length; i++)
//        {
//            System.out.println(sayilar2[i]);
//        }
//        //foreach dongusu
//        for(int s : sayilar2)
//        {
//            System.out.println(s);
//        }
        //ORnek 3 sayi alıp dizide sakla ve ortalamasını hesapla
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];
       for(int i = 0; i < numbers.length; i++)
       {
           System.out.print((i + 1) + ". sayiyi girin: ");
           numbers[i] = scanner.nextDouble();
       }
       System.out.println("Girdiginiz sayilar: ");
        for(double k : numbers)
        {
            System.out.println(k);
        }
        double toplam = 0;
        for(double k : numbers)
        {
            toplam += k;
        }
        double ort = toplam / numbers.length;
        System.out.println("Ortalama: " + ort);
        //Ornek KUllanıcıdan 5 adet sınav notu alıp bir double[] dizisine kaydeden ve
        //1-Notlar ekranda listeleyen
        //2- en yüksek notu bulan
        //3- Ortalama notu hesaplayan
        int[] notlar = new int[5];
        System.out.println("Lutfen 5 adet notu girin:");
        for(int i = 0; i< notlar.length;i++)
        {
            notlar[i] = scanner.nextInt();
        }
        for(int s : notlar)
        {
            System.out.println(s);
        }
        int enYuksek = notlar[0];
        for(int l = 0; l < notlar.length; l++)
        {
            if(notlar[l] > enYuksek)
            {
                enYuksek = notlar[l];
            }
        }
        System.out.println("En yuksek not: " + enYuksek);
    }
    }
