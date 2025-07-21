import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// degisken = (kosul) ? dogruysa_bu : degilse_bu;

        int sayi = 10;
        String sonuc = (sayi > 0) ? "Pozitif" : "Negatif veya Sıfır";
        System.out.println(sonuc); // Pozitif
        //Hangi Sayi Kucuk ?
        int a = 6;
        int b = 9;
        String sonuc1 = (a > b) ? "Buyuk" : "Kucuk";
        System.out.println(sonuc1); // kucuk
        //Yaş kontrolü
        int yas = 28;
        String mesaj = (yas >= 18) ? "Resit" : "Resit Degil";
        System.out.println(mesaj);
        //Tek mi çift mi
        Scanner scanner = new Scanner(System.in);
        int sayi1 = scanner.nextInt();
        String mesaj1 = (sayi1 % 2 == 0) ? "Sayi çift" : "sayi tek";
        System.out.println(mesaj1);
        //Bir öğrencinin notu giriliyor 50 üzeriyse "geçti veya kaldı" eğer not 90 ve üzeriyse "Pekiyi" yaz.
        System.out.println("Lutfen notu girin:");
        int not = scanner.nextInt();
        String mesaj2 = (not > 50) ? (not >= 90 ) ? "Pekiyi" : "Geçti": "Kaldı";
        System.out.println(mesaj2);
        }
    }
