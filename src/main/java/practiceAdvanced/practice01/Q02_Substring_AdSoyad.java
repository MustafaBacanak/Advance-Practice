package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {

    public static void main(String[] args) {

        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

        Scanner input = new Scanner(System.in);

        System.out.println( " Ad soyadı aralarında boşluk bırakarak giriniz");
        String name = input.nextLine();

        String isim = name.substring(0,name.indexOf(" "));
        System.out.println("isim = " + isim);
        String soyad = name.substring(name.indexOf(" ")+1);
        System.out.println("soyad = " + soyad);


    }
}
