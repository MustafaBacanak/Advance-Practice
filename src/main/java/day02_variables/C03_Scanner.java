package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("lütfen çemberin yariçapini giriniz");
//        double r = input.nextDouble();
//
//        System.out.println(" çevre = " + r*2*314/100);
//        System.out.println( "alan = " + r*r*314/100);

//        System.out.println("Üçgenin kenar uzunluklarını giriniz");

//        byte a = input.nextByte();
//        byte b = input.nextByte();
//        byte c = input.nextByte();
//
//        System.out.println("çevre = " +(a+b+c) );
//



        Scanner input2 = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

        char ab=input2.next().charAt(0);

        System.out.println("  " + ab + " ");
        System.out.println(" "+ab+" "+ab);
        System.out.println(ab+" "+ab+" "+ab);
    }
}
