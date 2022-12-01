package day04_ifstatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Gün ismi girer misin tatlım");

        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin


        String gun = input.next().toLowerCase();

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gun.equals("Cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutlas gun");
        }
        if (!gun.equals("cuma") && !gun.equals("pazar") && !gun.equals("cumartesi")) {
            System.out.println("Ateist Stylaa");
        }
        //2.YOL
     /*   String gun = input.next();
        if (gun.equalsIgnoreCase("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gun.equalsIgnoreCase("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }
        if(gun.equalsIgnoreCase("pazar")){
            System.out.println("Hristiyanlar icin Kutsal Gun");
        }
        if (!gun.equalsIgnoreCase("cuma")&& !gun.equalsIgnoreCase("cumartesi")&& !gun.equalsIgnoreCase("pazar")){
            System.out.println("Kutsal Gun Degil");
        }*/

        //3.YOL
        String gunn = input.next().toLowerCase();


        if (gunn.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gunn.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gunn.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");

        } else System.out.println("Kutsal Gun degil");


    }
}
