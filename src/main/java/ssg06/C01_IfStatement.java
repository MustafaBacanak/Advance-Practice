package ssg06;

import java.util.Scanner;

public class C01_IfStatement {

    // Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun  isimlerini yazdirin
    //Ornek: ilkHarf=P output = "Pazar, Pazartesi veya Persembe"
    // ilkHarf=S output = "Sali"


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin ilk harfini giriniz");
        String harf= input.next().toUpperCase();//Kullanici ne girerse girsin sen buyuk harf algila


        if(harf.equals("P")){
            System.out.println("Pazar, Pazartesi veya Persembe");

        }else if(harf.equals("S")){
            System.out.println("Sali");
        }else if (harf.equals("C")){
            System.out.println("Cuma,Cumartesi,Carsamba");
        }else
            System.out.println("Lutfen gecerli veri giriniz");

    }


}