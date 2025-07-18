//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void selamVer() //Parametresiz void Method
    {
        System.out.println("Selam Ronie!");
    }
    public static void yaz(String isim) //Parametreli void Method
    {
        System.out.println("Merhaba " + isim);
    }
    public static int topla(int a,int b)
    {
        return a + b;
    }
    public static void main(String[] args) {
        //MeThodlar
        selamVer();
        yaz("Burak");
        int sonuc = topla(4,5);
        System.out.println("Toplam: " + sonuc);

    }
    }