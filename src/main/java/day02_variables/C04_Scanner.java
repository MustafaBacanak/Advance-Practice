package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
//        System.out.println("lütfen 4 basamaklı bir sayi giriniz");
//        int sayi = input.nextInt();
//
//        //bir sayinin birler basamagindaki rakami %10 ile hesaplatabiliriz
//
//        int sonRakam = sayi%10;
//        int ilkRakam = sayi/1000;
//
//        System.out.println("toplam = " +(ilkRakam + sonRakam));
        //Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

        System.out.println("3 basamakli sayi giriniz");
        int sayi1 = input.nextInt();
        if(sayi1 > 99 && sayi1<1000 && sayi1<-99 && sayi1>1000) {
            int birler;
            int onlar;
            int yüzler;
            birler = sayi1 % 10;
            int x = sayi1 % 100;
            onlar = (x - birler) / 10;
            yüzler = (sayi1 - x) / 100;
            System.out.println("birler = " + birler);
            System.out.println("onlar = " + onlar);
            System.out.println("yüzler = " + yüzler);
        } else {
        System.out.println("Mikropluk yapma adam gibi bir sayı gir... ");
    }

        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12


        System.out.println("Lütfen 5 basamakli bir sayi giriniz..");

        int num = input.nextInt();
        int ilkIkiRkm = num/1000;
        System.out.println("ilkIkiRakam = " + ilkIkiRkm);
        int ilkIkiTop=(ilkIkiRkm%10)+(ilkIkiRkm/10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);
                int sonIkiRkm=num%100;
        System.out.println("sonIkiRkm = " + sonIkiRkm);//45
        int sonIkiTop=(sonIkiRkm%10)+(sonIkiRkm/10);//5+4
        System.out.println("sonIkiTop = " + sonIkiTop);


        int toplam=ilkIkiTop+sonIkiTop;
        System.out.println("toplam = " + toplam);

    }
}
