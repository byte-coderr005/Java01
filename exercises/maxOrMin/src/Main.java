import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[5];

        System.out.println("Lutfen 5 adet sayi girin: ");
        for(int i = 0; i< 5; i++) {
            sayilar[i] = scanner.nextInt();
            System.out.println("Sayi: " + i);
        }
        int enBuyuk = sayilar[0];
        int enKucuk = sayilar[0];
        for(int i = 1; i< 5; i++)
        {
            if(sayilar[i]> enBuyuk)
            {
                enBuyuk = sayilar[i];
            }
            if (sayilar[i]< enKucuk)
            {
                enKucuk = sayilar[i];
            }
        }
        System.out.println("En buyuk: " + enBuyuk);
        System.out.println("En kucuk: " + enKucuk);

    }
}