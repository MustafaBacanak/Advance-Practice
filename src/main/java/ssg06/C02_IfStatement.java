package ssg06;

import java.util.Scanner;

public class C02_IfStatement {

    /* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
    en kucuk olanlarini konsola yazdiriniz
    int num1
    int num2
    int num3
*/


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 Tamsayi giriniz");
        int num1 =input.nextInt();
        int num2 =input.nextInt();
        int num3= input.nextInt();


        if (num1>=num2 && num1>=num3){
            System.out.println(num1+" en buyuk sayidir");

            if(num2>=num3){
                System.out.println(num3+ " En kucuk sayidir");

            }else
                System.out.println(num2+ " En kucuk sayidir");




        }else if(num2>=num1 && num2>=num3) {
            System.out.println(num2+"En buyuk sayidir");

            if(num1>=num3){
                System.out.println(num3+ " En kucuk sayidir");
            }else
                System.out.println(num1+ " En kucuk sayidir");



        }else if(num3>=num1 && num3>=num2){  //CTE==Compile Time Error   RTE==Run Time Error
            System.out.println(num3+ " en buyuk sayidir");

            if (num1<=num2){
                System.out.println(num1+ " en kucuk sayidir");
            }else System.out.println(num2+" En kucuk sayidir");

        }

    }

}