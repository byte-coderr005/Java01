import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Dizi soruları
//        //Kullanıcıdan 5 sayı al ve bu sayıların toplamını hesaplayıp ekrana yazdır.
//        int[] sayilar = new int[5];
//        int toplam = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i = 0; i< sayilar.length; i++)
//        {
//            System.out.println("Lutfen 5 adet sayi girin:");
//            sayilar[i] = scanner.nextInt();
//        }
//        for(int s : sayilar)
//        {
//            toplam += s;
//            System.out.println(s);
//        }
//        System.out.println(toplam);
        //Dizi de en büyük sayiyi bulma.
        int[] numbers = new int[5];
        for(int i = 0; i< numbers.length;i++)
        {
            System.out.println("Lutfen 5 adet sayi girin:");
         numbers[i] = scanner.nextInt();
        }
        int enBuyuk = numbers[0];
        for(int i = 1; i< numbers.length; i++)
        {
            if (numbers[i] > enBuyuk)
            {
                enBuyuk = numbers[i];
            }
        }
        System.out.println("En buyuk sayi: " + enBuyuk);
    }
}