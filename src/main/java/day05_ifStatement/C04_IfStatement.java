package day05_ifStatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Cinsiyet lütfennn.Kadınsa K, Erkekse E ");

        char cinsiyet = input.next().toUpperCase().charAt(0);

        System.out.println("Yaş Lütfennn");
        double yas = input.nextDouble();

        if(cinsiyet=='K'){
            if(yas <0 || yas>120) {
                System.out.println("Sen insan mısın ?");
            }else if (yas>60) {
                System.out.println("Hadi yine iyisinn :) ");
            }else {
                System.out.println("Senin askerlik bitmemiş " + (60 - yas) + " sene daha devam");
            }


        }else if (cinsiyet=='E') {
            if (yas<0 || yas>120){
                System.out.println("Sen insan mısın?");
            } else if (yas>65) {
                System.out.println("Tebrikler artık sanada toplu taşıma bedavaa");
            }else{
                System.out.println("Maç 90 dk " + (65-yas) + " sene daha yapıştııır");
            }

        } else System.out.println("Yaraamazlık yapmaa");


        }


    }

