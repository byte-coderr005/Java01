import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1 den 9 a kadar olan sayıların toplamı
        int sum = 0;
        for(int i = 0; i< 10; i++){
            sum = sum + i;
            System.out.println(sum);
        }
        //1 den 9 a kadar olan sayıların çarpımı
        int carp = 1;
        for(int i = 1; i< 10; i++)
        {
            carp = carp * i;
            System.out.println(carp);
        }
        //Asal sayı bulan loop 1 ile 100 arasında
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin:");
        boolean asalMi = true;
        int sayi = scanner.nextInt();
        if(sayi < 2)
        {
            asalMi = false;
        }else {
            for(int i = 2; i <= Math.sqrt(sayi);i++)
            {
                if(sayi % i == 0)
                {
                    asalMi = false;
                    break;
                }
            }
        }
        if(asalMi)
        {
            System.out.println(sayi + " bir asal sayidir.");
        }
        else {
            System.out.println(sayi + " asal sayi degildir.");
        }

        //1 ile 100 arası asalları bulan app
        for(int i = 2; i<100; i++)
        {
           boolean asal = true;
           for(int j = 2; j <= Math.sqrt(i);j++)
           {
               if(i % j == 0){
                   asal = false;
                   break;
               }
           }
           if(asal)
           {
               System.out.println(i + "asal sayidir.");
           }
        }


    }
}