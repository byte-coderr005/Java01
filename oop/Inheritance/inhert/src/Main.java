//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kedi k = new Kedi();
        k.isim = "Minnoş";
        k.sesCikar();
        System.out.println("Kedinin ismi: " + k.isim);
        Kopek k1 = new Kopek();
        k1.isim = "Karabaş";
        k1.sesCikar();
        Kus k2 = new Kus();
        k2.isim = "Papagan";
        k2.sesCikar();
    }
}