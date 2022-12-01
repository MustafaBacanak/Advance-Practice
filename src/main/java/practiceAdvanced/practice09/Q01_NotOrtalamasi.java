package practiceAdvanced.practice09;

public class Q01_NotOrtalamasi {
    public static void main(String[] args) {
//	4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan bir method yazınız.

        ortlaamaHesapla("Buse",56.5,56.8,80.9,97,48,90);
        ortlaamaHesapla("Ayşe",90,95.8,77.7,66);
        ortlaamaHesapla("Aygen",90,66,78);
        ortlaamaHesapla("Senem",99.9,99,100,100,95);


    }
    public static void ortlaamaHesapla(String isim,double... not) {
        double toplam = 0;
        for (Double w : not) {
            toplam += w;

        }
        System.out.printf(isim+"'nin not ortalaması :"+"%5.2f",toplam/not.length);
        System.out.println();


    }
}
