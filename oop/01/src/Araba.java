public class Araba {
    String marka;
    String model;
    int hiz;


   public void hizlan(int artis)
    {
        hiz += artis;
        System.out.println(marka + " " + model + " hizlandi: " + hiz + "km/s.");
    }
    public void yavasla(int azalma)
    {
        hiz -= azalma;
        System.out.println(marka + " " + model + " yavasladi " + hiz + "km/s.");
    }
}
