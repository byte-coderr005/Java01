public class Hayvan
{
    String isim;
    public void sesCikar()
    {
        System.out.println("Bir ses çıkardı.");
    }
    public void yuru()
    {
        System.out.println(this.isim + " yuruyor");
    }
}
class Kedi extends Hayvan
{
    public void sesCikar()
    {
        System.out.println("Miyav!");
    }
}
class Kopek extends Hayvan
{
    public void sesCikar()
    {
        System.out.println("hav hav");
    }
}
class Kus extends Hayvan
{
    public void sesCikar()
    {
        System.out.println("cik cik");
    }
}

