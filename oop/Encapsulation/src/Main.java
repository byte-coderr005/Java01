//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.setMarka("Mercedes");
        araba.setModel("E250");
        araba.setHiz(100);
        araba.hizlan(50);

        System.out.println("Marka: " + araba.getMarka());
    }
}