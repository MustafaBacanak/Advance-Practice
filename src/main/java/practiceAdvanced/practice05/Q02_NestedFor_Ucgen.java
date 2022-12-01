package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q02_NestedFor_Ucgen {
    /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();

        for(int i=0; i<satir; i++){//Satır kontrolü

            for (int bosluk=satir-i; bosluk>1; bosluk--){

                System.out.print(" ");
            }
            for (int yildiz=0; yildiz<=i; yildiz++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2.Yol :

        Scanner scan = new Scanner(System.in);
        System.out.println("satir sayisini veriiii misin");
        int s = scan.nextInt();
        for (int i =1; i<=s ; i++)
        {
            System.out.print(" ".repeat(s-i));
            System.out.println("* ".repeat(i));
        }
    }
}