

public class Main {
    static void tiktakYazdir(int sonDeger)
    {
        for(int i = 0; i<= sonDeger; i++)
        {
            if(i % 5 == 0 && i % 3 == 0)
            {
                System.out.println("tiktak");
            }
            else if(i % 3 == 0)
            {
                System.out.println("tik");
            }
            else if(i % 5 == 0)
            {
                System.out.println("tak");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {

            tiktakYazdir(20);
        }

}
