package day05_ifStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        // Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Tevellüt ne canım");

        short yas = input.nextShort();

        if (yas >= 0) {
            if (yas >= 65) {
                System.out.println("Hayırlı olsun ikramiye zamanı");
            } else {
                System.out.println("Yoruldun mu ? Çalışmaya devammm");
                System.out.println(65 - yas + " Sene daha Çalışmaya devamm :D");
            }
        } else {
            System.out.println("yaramazlık yapmaa");
        }

    }
}
