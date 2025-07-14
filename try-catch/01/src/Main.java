//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        try {
            //Hata oluşma ihtimali olan kod buraya yazılır.
        }catch (Exception e){
            //Hata olursa burası çalışır.
        } finally {
            //Hata olsa da olmasa da çalışır.
            System.out.println("Program sonlandı");
        }

        try {
            int sayi = 10 / 0; // Bu satir hata verir.
        }catch(ArithmeticException e){
            System.out.println("Sıfıra bolme hatası: " + e.getMessage());
        }
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Bir sayi girin:");
            int sayi  = scanner.nextInt();
            System.out.println("Girdiginiz Sayi : " + sayi);
        } catch (Exception e)
        {
            System.out.println("Geçersiz giriş! Lutfen bir tam sayi girin.");
        }
        //0 a bölme
        int sayi1,sayi2;
        try
        {
            System.out.println("1.sayiyi girin");
             sayi1 = scanner.nextInt();
             System.out.println("2. sayiyi girin");
             sayi2 = scanner.nextInt();
             int sonuc = sayi1 / sayi2;
             System.out.println("Sonuc:" + sonuc);
        }catch(ArithmeticException e)
        {
          System.out.println("Hata: Sıfıra bolme yapılamaz!");
        }catch (Exception e){
            System.out.println("Beklenmeyen hata oluştu: " + e.getMessage());
        }
        System.out.println("Program devam ediyor...");
        scanner.close();
        }
    }