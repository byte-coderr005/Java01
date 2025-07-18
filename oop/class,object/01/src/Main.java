public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.ad = "burak";
        ogr1.yas = 27;
        ogr1.bilgileriYazdir();
        Araba ar1 = new Araba("bmw","530i",2019);
        ar1.bilgileriGoster();
        }
    }