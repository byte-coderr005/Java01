import java.util.Scanner;

public class Main {
   public static int faktoriyelHesapla(int i) {
        if (i == 0) {
            return 1;
        } else
        {
            return i * faktoriyelHesapla(i - 1);
        }
    }
    public static int faktoriyel()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen faktoriyelini alacağınız sayiyi girin:");
        int sayi = scanner.nextInt();
        int result = 1;
        for(int i = 1; i<=sayi; i++)
        {
            result *= i;
            System.out.println(i + "! = " + result);
        }
        return result;
    }
    public static void main(String[] args) {
        int  sonuc = faktoriyelHesapla(5);
        System.out.println(sonuc);
        faktoriyel();
   }
}

