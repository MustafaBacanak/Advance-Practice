package day04_ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */

        Scanner input = new Scanner(System.in);

        System.out.println( "Yes mi No mu kankaa");
        char harf = input.next().charAt(0);

        if (harf =='Y'|| harf == 'y' ) {
            System.out.println("Yes");
        } else if (harf =='N'|| harf=='n') {
            System.out.println("No");
        }else{
            System.out.println("Ayarımı Kaçırma Moruk");
            
        }
    }
}

