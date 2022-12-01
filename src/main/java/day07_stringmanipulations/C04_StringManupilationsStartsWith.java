package day07_stringmanipulations;

public class C04_StringManupilationsStartsWith {

    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String cumle = "Kazananlar hic hata yapmayanlar degil,vazgecmeyenlerdir";

        //Ka ile basliyo mu ?

        System.out.println(cumle.startsWith("Ka"));

        //dir ile bitiyor mu ?

        System.out.println(cumle.endsWith("dir"));




    }
}
