public class Araba {
    private String marka;
    private String model;
    private int hiz;
    public void setMarka(String marka)
    {
        this.marka = marka;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public void setHiz(int hiz)
    {
        this.hiz = hiz;
    }
    public String getMarka()
    {
        return marka;
    }
    public String getModel()
    {
        return model;
    }
    public int getHiz()
    {
        return hiz;
    }
    public void hizlan(int artis)
    {
        hiz += artis;
        System.out.println(marka + " hızlandı: " + hiz + " km/s");
    }
    public void yavasla(int azalis)
    {
        hiz -= azalis;
        System.out.println(marka + " yavaşladı. " + hiz + " km/s");
    }
}
