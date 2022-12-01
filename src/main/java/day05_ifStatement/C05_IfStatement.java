package day05_ifStatement;

import java.util.Scanner;

public class C05_IfStatement {

    public static void main(String[] args) {

        //Kullanicidan 2 sayi alın büyük olmayan sayiyi yazdirin

        Scanner input = new Scanner(System.in);

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        if (sayi1 < sayi2) {
            System.out.println(sayi1);
        } else if (sayi1 > sayi2) {
            System.out.println(sayi2);
        } else {
            System.out.println("düzgün sayi gircen mi");


            System.out.println(sayi1 == sayi1 ? "sayılar eşit" : sayi1 > sayi2 ? sayi2 : sayi1);

        }


    }
}
