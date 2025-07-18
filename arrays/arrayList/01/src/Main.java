import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Kitap> kitapListesi = new ArrayList<>();

    public static void kitapEkle(Kitap kitap) {
        kitapListesi.add(kitap);
        System.out.println("Kitap başarıyla eklendi");
    }

    public static void kitapSil(String kitapAdi) {
        for (Kitap k : kitapListesi) {

            if (k.ad.equalsIgnoreCase(kitapAdi)) {
                kitapListesi.remove(k);
            }
            System.out.println("Kitap başarıyla silindi");
        }
        }
        public static void kitaplariListele() {
            for (Kitap k : kitapListesi) {
                k.bilgiGoster();
            }
        }
        public static void main (String[]args){
            //Normalde arrayler sabit uzunluktadır. Arralist ise istediğin kadar veri ekleyip çıkarabildiğin
            //Dinamik listedir.
            ArrayList<Telefon> telefonListesi = new ArrayList<>();

            Telefon t1 = new Telefon("Samsung", "S22", 25000);
            Telefon t2 = new Telefon("Apple", "iphone 14", 50000);
            telefonListesi.add(t1);
            telefonListesi.add(t2);

            //Listeyi Yazdır.
            for (Telefon t : telefonListesi) {
                t.bilgiYaz();
            }

            Kitap k1 = new Kitap("Ezilenler", "Dostoyevski", 356);
            kitapListesi.add(k1);
            for (Kitap k : kitapListesi) {
                k.bilgiGoster();
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Silmek istediğiniz kitabın adını girin:");
            String silinecekAd = scanner.nextLine();

            kitapSil(silinecekAd);

            System.out.println("\nGüncel Kitap Listesi");
            kitaplariListele();



            }
    }

