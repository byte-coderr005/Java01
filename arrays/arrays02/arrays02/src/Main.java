//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Kelime tahmin Oyunu
                Scanner scanner = new Scanner(System.in);

                String[] kelimeler = {"Ahmet", "Mehmet", "Burak", "Sadık", "Remzi", "Ayşe"};
                System.out.println(String.join(" ", kelimeler));

                Random random = new Random();
                int tahminEdilen = random.nextInt(6); // 0 - 5 arasında

                System.out.println("Lütfen tahmininizi girin.");
                int hak = 3;

                while (hak > 0) {
                    String kelime = scanner.nextLine().trim().toLowerCase();

                    boolean bosmu = kelime == null || kelime.isEmpty();
                    boolean sayiMi = false;
                    try {
                        Integer.parseInt(kelime);
                        sayiMi = true;
                    } catch (NumberFormatException e) {
                        // sayı değilse bir şey yapma
                    }

                    boolean kelimeEle = Arrays.stream(kelimeler)
                            .anyMatch(k -> k.equalsIgnoreCase(kelime));

                    if (bosmu || sayiMi || !kelimeEle) {
                        System.out.println("Lütfen doğru bir karakter giriniz.");
                        hak--;
                    } else {
                        if (kelime.equals(kelimeler[tahminEdilen].toLowerCase())) {
                            System.out.println("Doğru!");
                            break;
                        } else {
                            System.out.println("Yanlış.. Kelime '" + kelimeler[tahminEdilen] + "' olacaktı... YENİDEN DENEYİN");
                            hak--;
                        }
                    }
                }
                scanner.close();
            }
        }

