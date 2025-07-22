//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Araba ar1 = new Araba();
        ar1.model = "5.35i";
        ar1.marka = "Bmw";
        ar1.hiz = 150;
        ar1.hizlan(30);
        ar1.yavasla(50);
    }
}