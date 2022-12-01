package questions;

import java.util.Scanner;

public class Q02_UcakBileti {

    /*
       A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
       Bilet tarifesi:
       km birim fiyati : 0.10$
       yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
       12 ve 24 yas arasindaysa 10% indirim,
       65 yasindan buyukse 30% indirim,
       bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz.

     */
    static double ucret;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("B , C ve D sehirlerinden birini seciniz");
        String secim = input.next();

       secim=secim.substring(0,1).toUpperCase();
       

        if (secim.equals("B")){
            ucret =500*0.10;
            System.out.println("Yas");
            int yas=input.nextInt();
            yas(yas);
            System.out.println("gidis donüs");
            boolean cevap= input.nextBoolean();
            gidisDonus(cevap);
            System.out.println(ucret);

        } else if (secim.equals("C")) {
            ucret =700*0.10;
            System.out.println("Yas");
            int yas=input.nextInt();
            yas(yas);
            System.out.println("gidis donüs");
            boolean cevap= input.nextBoolean();
            gidisDonus(cevap);
            System.out.println(ucret);

        } else if (secim.equals("D")) {
            ucret =900*0.10;
            System.out.println("Yas");
            int yas=input.nextInt();
            yas(yas);
            System.out.println("gidis donüs ");
            boolean cevap= input.nextBoolean();
            gidisDonus(cevap);
            System.out.println(ucret);

        }

    }

    public static void yas( int x){
        if (x <12 ){
            ucret = ucret /2;
        } else if (x>11 && x<24) {
            ucret = ucret *0.9;
        }else if (x>65){
            ucret = ucret *0.7;
        }

    }

    public static void gidisDonus(boolean cevap){
        if(cevap){
            ucret=ucret*0.8;

        }

    }

}
