
class Ogrenci{
    static String okulAdi = "YTU";
    String ad; // instance (örnek degisken)
}

class Araba {
    String model;
}
public class Main {
    public static void main(String[] args) {
        byte b = 10; // 8-bit
        short s = 2000; // 16-bit
        int yas  = 27; // 32-bit
        long buyukSAyi = 1000000000L; //64- bit tamsayi
        float oran = 5.6f; //Ondalıklı sayi
        double pi = 3.14159; // büyük ondalık
        boolean dogruMu = true; // true-false
        char harf = 'B'; // Tek karakter
        String ad = "Burak"; // String metin tutar
        int[] sayilar = {1,2,3,4}; //Array Dizi
        Araba araba = new Araba();
        araba.model = "Bmw";
        //GEÇERSİZ
        //int 5yas; Sayi ile baslayamaz.
        //String ad soyad; // bosluk olamaz
        //Type casting
         int a = 10;
         double d = a; // otomatik donustu
        //Manuel (narrowing)
        double piSayisi = 3.14;
        int k = (int) piSayisi; // 3 olur.
    }
}
