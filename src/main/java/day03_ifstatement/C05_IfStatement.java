package day03_ifstatement;

import java.util.Scanner;

public class C05_IfStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("İki Sayı Giriniz");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Lütfen \n toplama işlemi için 1 \n cikarma islemi icin 2 \n bölme işlemi için 3" +
                " \n çarpma işlemi için 4\n giriniz");

        int islem = input.nextByte();

        if(islem ==1) {
            System.out.println(num1 + num2);
        }else if (islem ==2 ) {
            System.out.println(num1 - num2);
        }else if (islem == 3 ) {
            System.out.println(num1 / num2);
        }else if (islem ==4 ) {
            System.out.println(num1 * num2);
        }else System.out.println( "Düzgün sayı gir lann");

        }


    }



