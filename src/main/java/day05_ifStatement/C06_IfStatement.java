package day05_ifStatement;

import java.util.Scanner;

public class C06_IfStatement {
    public static void main(String[] args) {

        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
        // Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın

        System.out.println("4 basamaklı sayı lütfen");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if (a < 1000 || a > 999) {

        } else if (a % 5 == 0) {
            if (a % 10 == 0) {
                System.out.println("5e bölünen çift sayi");

            } else {
                System.out.println("5e bölünen tek sayi");
            }

        } else {
            System.out.println("tekrar denee");
        }
    }
}