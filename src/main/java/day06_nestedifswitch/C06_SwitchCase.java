package day06_nestedifswitch;

import java.util.Scanner;

public class C06_SwitchCase {

    public static void main(String[] args) {


        //Ex: Girilen pozitif 3 basamakli bir sayiyi yazi ile yazdirin
        //Ex : 568
        //Ex : Besyuzatmıssekiz
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi ver bakam aslan parçası ");

        int sayi = input.nextInt();
        Math.abs(sayi);

        int birler =(sayi%10);
        int onlar = (sayi/10)%10;
        int yüzler =(sayi/100);



        if(sayi>99 && sayi<1000) {

            switch (yüzler){

                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("Yüz");
                    break;
                case 2:
                    System.out.print("İkiyüz");
                    break;
                case 3:
                    System.out.print("Ucyüz");
                    break;
                case 4:
                    System.out.print("Dortyüz");
                    break;
                case 5:
                    System.out.print("Besyüz");
                    break;
                case 6:
                    System.out.print("Altiyüz");
                    break;
                case 7:
                    System.out.print("Yediyüz");
                    break;
                case 8:
                    System.out.print("Sekizyüz");
                    break;
                case 9:
                    System.out.print("Dokuzyüz");
                    break;
            }
            switch (onlar) {

                case 0:
                    System.out.print(0);
                    break;
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kırk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("atmis");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;
            }
            switch (birler) {

                case 0:
                    System.out.print("sifir");
                    break;
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;

                default:
            }

            }else System.out.println("3 Basamaklı 3 3 neyini anlamıyon");




    }
}
