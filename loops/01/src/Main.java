import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //while dongusu
        int i = 0;
        while (i < 5)
        {
            System.out.println("i = " + i);
            i++;
        }
        //do-while dongusu
        //En az 1 kere çalışır.
        int j = 5;
        do {
            System.out.println("j = " + j);
            j++;
        }while(j <9);
        //for dongusu
        for (int k = 0; k < 5; k++)
        {
            System.out.println("K = " + k);
        }
        //1 den 10 a kadar yazdır
        for (int l = 0; l<=10;l++)
        {
            System.out.println(l);
        }
        //break => Donguyu tamamen bitirir.
        //continue => o turu atlar. bir sonraki tura geçer.
        //1 den 100 e kadar olan sayıların toplamı
        int sum = 0;
        for(int h = 0; h <=100;h++)
        {
            sum = sum + h;

            System.out.println("Toplam: " + sum);
        }
        //1 den 10 a kadar olan sayiların karesi
//        int sq = 1;
//        for(int y = 1; y <=10; y++)
//        {
//            sq = y * y;
//            System.out.println(y +". " + "SAyinin karesi: " + sq);
//        }
        //aynı işlem while ile
        int sq = 1;
        int y = 0;
        while(y <= 10)
        {
            sq = y * y;
            System.out.println(y +". " + "SAyinin karesi: " + sq);
            y++;
        }
        //KUllanıcıdan 5 sayı al bu sayıların toplamını yazdır.
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int toplam = 0;
        while(counter < 5) {
            System.out.print((counter + 1) + ". sayiyi girin:");
            int sayi = scanner.nextInt();
            toplam += sayi;
            counter++;
        }
        System.out.println("Toplam: " + toplam);
        double ortalama = (double) toplam / 5;
        System.out.println("Ortalama: " + ortalama);
    }
}