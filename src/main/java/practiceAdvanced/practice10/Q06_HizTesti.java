package practiceAdvanced.practice10;

import java.time.LocalTime;
import java.util.Locale;

public class Q06_HizTesti {

    //İki java işlemi arasındaki çalışma zamanı farkını gösteren bir kod yazınız.

    public static void main(String[] args) {

        int nano1 = LocalTime.now().getNano();

        int x=0;
        while (x<2000000000){
            int a = 1234*1234;
            x++;
        }
        System.out.println("nano1 = " + nano1);
        int nano2 = LocalTime.now().getNano();
        System.out.println("nano2 = " + nano2);
        int fark1=(nano2-nano1);
        System.out.println("Birinci fark: "+ fark1);

        System.out.println("================");

        int nano3 = LocalTime.now().getNano();

        long y=0;
        while (y<5000000000L){
            int a = 1234*1234;
            y++;
        }
        System.out.println("nano3 = " + nano3);
        int nano4 = LocalTime.now().getNano();
        System.out.println("nano4 = " + nano4);
        int fark2= (Math.abs(nano4-nano3));
        System.out.println("Ikinci fark: "+fark2);

        if (fark1>fark2){
            System.out.println("ilk islem daha uzun sürdü");
        }else
            System.out.println("ikinci islem daha uzun sürdü");
        

    }
}
