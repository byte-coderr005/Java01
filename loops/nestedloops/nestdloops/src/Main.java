//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//5 satır ve 5 sütundan oluşan yıldız deseni
        for(int i = 1; i<= 5; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                System.out.print("* ");
            }
            System.out.println(); //Satır bittiğinde alt satıra geç.
        }
        for(int i = 1; i<= 5; i++)
        {
            for(int j= 1; j <= i; j++)
            {
                System.out.print( "* ");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }








    }
}