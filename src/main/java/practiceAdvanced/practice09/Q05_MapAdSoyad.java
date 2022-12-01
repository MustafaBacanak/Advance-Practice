package practiceAdvanced.practice09;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Q05_MapAdSoyad {
    /*
       İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
     */

    public static void main(String[] args) {

        String arr1[]={"John", "Mark", "Ali"};
        String arr2[]={"Doe", "Twain", "Can"};

        HashMap<String,String> adSoyad = new HashMap<>();

        for (int i = 0; i <arr1.length ; i++) {
            adSoyad.put(arr1[i],arr2[i]);
        }
        System.out.println("adSoyad = " + adSoyad);
    }
}
