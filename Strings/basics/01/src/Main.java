import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Stringler
        //Java String kelimesinin ilk harfinin büyük olması onun class olmasından kaynaklanır.
        String s1 = "MErhaba";
        s1 = s1 + " Dünya"; //aslında yeni bir string oluşturulur.
        String str2 = new String("Burak"); // new ile oluşturma metodu
        //STRING METOTLARI
        String metin = "Java";
        System.out.println(metin.length()); // 4
        System.out.println(metin.charAt(0)); // 'J'
        System.out.println(metin.toUpperCase());
        //Boşlukları temizleme
        String bosluklu = " MERhaba   ";
        System.out.println(bosluklu.trim());
        //Parca alma (substring)
        String text = "Merhaba Burakcım";
        System.out.println(text.substring(0,8)); //substring(başlangıc_index,bitis_index);



    }
}