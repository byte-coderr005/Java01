import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print((i + 1) + ". sayiyi girin: ");
            numbers[i] = scanner.nextDouble();
        }
        System.out.println("Girdiginiz sayilar: ");
        for(double k : numbers)
        {
            System.out.println(k);
        }
        double toplam = 0;
        for(double k : numbers)
        {
            toplam += k;
        }
        double ort = toplam / numbers.length;
        System.out.println("Ortalama: " + ort);
        //Ornek KUllanıcıdan 5 adet sınav notu alıp bir double[] dizisine kaydeden ve
        //1-Notlar ekranda listeleyen
        //2- en yüksek notu bulan
        //3- Ortalama notu hesaplayan
        int[] notlar = new int[5];
        System.out.println("Lutfen 5 adet notu girin:");
        for(int i = 0; i< notlar.length;i++)
        {
            notlar[i] = scanner.nextInt();
        }
        for(int s : notlar)
        {
            System.out.println(s);
        }
        int enYuksek = notlar[0];
        for(int l = 0; l < notlar.length; l++)
        {
            if(notlar[l] > enYuksek)
            {
                enYuksek = notlar[l];
            }
        }
        System.out.println("En yuksek not: " + enYuksek);
        }
    }