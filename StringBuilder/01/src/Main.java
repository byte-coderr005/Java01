//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); // boş başlatma
        StringBuilder sb2 = new StringBuilder("merhaba"); // içerikle başlatma
        sb.append("Burak"); //sb ye Burak stringini ekle.
        sb.append(" ");
        sb.append("Java ogreniyor");
        System.out.println(sb);
        sb.insert(6,"Oracle "); //Belirtilen indekse karakter ya da string ekler.
        System.out.println(sb);
        sb.delete(6,12); //Belirtilen indeksteki karakterleri siler.
        System.out.println(sb); //Burak Java ogreniyor;
        sb.replace(0,5,"Yusuf"); //Belirtilen indeksi değiştirir.
        System.out.println(sb);
        //ORNEK sb2 ile
        sb2.replace(0,6,"java");
        System.out.println(sb2);
        sb2.delete(0,sb.length());
        System.out.println(sb2);
        sb2.insert(0,"avaj");
        System.out.println(sb2);
    }
}