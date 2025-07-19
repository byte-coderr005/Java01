import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fibonacci istenen degere kadar.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen fibonacci için kaç sayı olacak onu girin:");
        int son = scanner.nextInt();
        int onceki,sonraki,temp;
        onceki = 0;
        sonraki = 1;
        System.out.println(onceki);
        System.out.println(sonraki);
        for(int i = 2; i< son; i++)
        {
            temp = onceki + sonraki;
            System.out.println(temp);
            onceki = sonraki;
            sonraki = temp;
        }
        //Fibonacci Dizisini ek.















        }
    }
