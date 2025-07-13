
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Scanner nesnesi olştur.
//        System.out.print("Adınızı girin: ");
//        String ad = scanner.nextLine();

//        System.out.println("Merhaba, " + ad + "!");
        //ORnek Kullanıcıdan bir girdi al Bunu object olarak bir değişkende sakla. İnstance veya .getclass() ile tipini yazdır.
        Object[] veriler = {123, "ahmet", 45.6, 'b', true};
        for (Object veri : veriler) {
            System.out.println(veri + " => " + veri.getClass().getSimpleName());
        }
        //Scanner basit hesap makinesi
        System.out.println("Lutfen ilk  sayiyi girin");
        int sayi1 = scanner.nextInt();
        System.out.println("Lutfen ikinci sayiyi girin");
        int sayi2 = scanner.nextInt();
        System.out.println("Lutfen bir islem secin");
        scanner.nextLine();
        String islem = scanner.nextLine().toLowerCase().trim();
        int sonuc;
        if(islem.equals("+"))
        {
             sonuc = sayi1 + sayi2;
             System.out.println(sonuc);
        }
        else if (islem.equals("-"))
        {
            if(sayi1 > sayi2)
            {
                 sonuc = sayi1 - sayi2;
                 System.out.println(sonuc);
            }
            else{
                sonuc = sayi2 - sayi1;
                System.out.println(sonuc);
            }
        }
        else if (islem.equals("*"))
        {
            sonuc = sayi1 * sayi2;
            System.out.println(sonuc);
        }
        else if (islem.equals("/"))
        {
            sonuc = sayi1 / sayi2;
            System.out.println(sonuc);
        }
        else
        {
            System.out.println("Geçersiz İşlem");
        }

    }
}
