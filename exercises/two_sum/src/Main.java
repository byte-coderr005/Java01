
public class Main {
    public static void main(String[] args) {
        int[] sayilar = {4,8,125,15,23,42};
        int hedef = 23;
        int sonuc = LinearSearch.search(sayilar,hedef);
        System.out.println("Bulunduğu indeks: " + sonuc); // 4
        //Bir String[] dizisinde verilen bir ismi bulan ve indeksini döndüren metodu yaz.
        String[] words = {"burak","cemal","ismet","hakan"};
        String hedef1 = "ismet";
        int sonc = LinearSearch.stringAra(words,hedef1);
        System.out.println("Bulundugu indeks: " + sonc);


    }

    }
