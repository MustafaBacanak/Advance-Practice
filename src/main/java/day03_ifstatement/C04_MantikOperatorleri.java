package day03_ifstatement;

public class C04_MantikOperatorleri {

    public static void main(String[] args) {

        System.out.println( 5+2 == 8);
        
        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc1 = " + sonuc1);
        
        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc2 = " + sonuc2);
        
        int sayi1 =15;
        
        boolean sonuc = 10<sayi1 && sayi1<20;;
        System.out.println("sonuc = " + sonuc);

        int sayi2 = 5;
        System.out.println(sayi2<10 || 20<sayi2 );
    }
}
