//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sayi = 56.5;
        int sayi1 = (int) sayi;
        System.out.println(sayi1);
        int sayi2 = 565 / 4;
        double sayi3 = (double) sayi2;
        System.out.println(sayi3);
        String metin = "Hello Java";
        char ilkHarf = metin.charAt(0); // H
        System.out.println(ilkHarf);
        char harf = 'G';
        String harfStr = String.valueOf(harf); // "G"
        String harfStr2 = Character.toString(harf);
        System.out.println(harfStr);
        if (harfStr2 instanceof String)
        {
            System.out.println("Bu bir string");
        }
        //Uygulama Gorev: Karışık tiplerden oluşan birr listeyi sırayla yaz ve türünü tanı.
        Object[] veriler = {"Merhaba",3.14,5.20,true,46,'B'};
        for (Object veri : veriler)
        {
            System.out.println(veri + " => " + veri.getClass().getSimpleName());

        }



        }
    }
