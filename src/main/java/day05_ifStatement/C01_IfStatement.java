package day05_ifStatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

 /*
        Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

 */

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double a1 = input.nextDouble();
        double a2 = input.nextDouble();
        double toplama = (a1 + a2);
        double carpma = a1 * a2;
        if (a1 > 0 && a2 > 0) {
            System.out.println(toplama);
        } else if (a1 < 0 && a2 < 0) {
            System.out.println(carpma);
        } else if (a1 * a2 < 0) {
            System.out.println("işlem yapamazsın");
        } else {
            System.out.println("sıfır yutar kanka GG");

        }

    }
}
