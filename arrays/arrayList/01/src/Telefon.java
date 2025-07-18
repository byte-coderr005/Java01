public class Telefon
{ String marka;
    String model;
    int fiyat;

    public Telefon(String marka,String model, int fiyat)
    {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }
    public void bilgiYaz()
    {
        System.out.println("Marka: " + marka + ", Model: " + model + ", fiyat: " + fiyat + "TL");
    }

}
