public  class Araba
{ String marka;
    String model;
    int yil;
    //Constructor
    public Araba(String marka, String model, int yil) {
 this.marka = marka; // yukarıdaki String markayı işaretliyoruz.
 this.model = model; // yukarıdaki String modeli işaretliyoruz.
 this.yil = yil;
}
    public void bilgileriGoster()
    {
        System.out.println("Marka, " + marka + " Model: " + model + " Yili: " + yil);
    }
}
