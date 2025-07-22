import java.util.Scanner;

public class wordCounter {
    String word;

    public void changer() {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("please enter a word or letter");

            this.word = scanner.nextLine(); //Sınıf değişkenine ata.

            char[] array = word.toCharArray(); // karakter dizisine dönüştür.
            for (char k : array) { //Diziyi dön.
                System.out.println(k);
            }
        }
    }
}