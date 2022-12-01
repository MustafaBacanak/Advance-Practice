package day04_ifstatement;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

         /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */

        Scanner input = new Scanner(System.in);

        System.out.println("Not değerini giriniz");

        int not = input.nextInt();

        if (not > 0 && not < 60) {
            System.out.println(" F - Zayif");
        } else if (not > 59 && not < 70) {
            System.out.println("D - Gecer");
        } else if (not > 69 && not < 80) {
            System.out.println(" C - Orta");
        } else if (not > 79 && not < 90) {
            System.out.println(" B - iyi");
        } else if (not > 89 && not <= 100) {
            System.out.println(" A - çok iyi laaaann");

        } else {
            System.out.println("adam gibi değer gir ayar etme beni");
        }


    }
}
