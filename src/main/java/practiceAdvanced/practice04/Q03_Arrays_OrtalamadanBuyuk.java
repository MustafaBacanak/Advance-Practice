package practiceAdvanced.practice04;

import java.util.Collections;

public class Q03_Arrays_OrtalamadanBuyuk {

    //Elemetlerin ortalamasından büyük elementleri yazdıran bir kod yazınız.

    public static void main(String[] args) {

        int arr[]={1,99,85,34,16,23,5};

        int sum =0;
        for (int w:arr){
            sum=sum+w;

        }
        double ortalamaSayi = sum/arr.length;
        System.out.println("Ortalama = " + ortalamaSayi);
        for (int w : arr) {
            if (w > ortalamaSayi) {
                System.out.print(w +" ");
            }
        }

    }
}
