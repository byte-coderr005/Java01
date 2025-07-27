import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Kullanıcıdan 5 meyve al. bunları ekrana yazdır bir meyve silmek için isim alsın listede varsa silsin.

        ArrayList<String> meyveler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Lutfen 5 adet meyve girin: ");
        while(i < 5)
        {
            String meyve = scanner.nextLine();
            meyveler.add(meyve);
            i++;
        }
        for(String s : meyveler)
        {
            System.out.println(s);
        }
        System.out.println("Lutfen silmek için bir meyve ismi girin: ");
        String silinecekMeyve = scanner.nextLine();
        boolean varMi = true;
         varMi = meyveler.contains(silinecekMeyve);
        if(varMi == true)
        {
            meyveler.remove(silinecekMeyve);
            System.out.println(silinecekMeyve + " silindi");
        }else{
            System.out.println("Bu meyve listede yok.");
        }
        for(String s : meyveler)
        {
            System.out.println(s);
        }

    }
}