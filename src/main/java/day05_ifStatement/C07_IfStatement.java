package day05_ifStatement;

import java.util.Scanner;

public class C07_IfStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kenar uzunluklarını giriniz");
        double kenar1 = input.nextDouble();
        double kenar2 = input.nextDouble();
        double kenar3 = input.nextDouble();
        double kenar4 = input.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar3 == kenar4) {
            System.out.println("kare işte");
        } else {
            System.out.println("kare değil");
        }
    }
}
