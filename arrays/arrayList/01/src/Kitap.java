public class Kitap {
    String ad;
    String yazar;
    int sayfa;

    public Kitap(String ad,String yazar, int sayfa)
    {
        this.ad = ad;
        this.yazar = yazar;
        this.sayfa = sayfa;
    }
    public void bilgiGoster()
    {
        System.out.println("Kitap adı:" + ad + " Kitap yazarı " + yazar + " Sayfa sayisi " +sayfa);
    }
}
