package practiceAdvanced.practice10;

public class Q05_VarArgs_IlkiHaricTopla {

     /*
        Parametrelerinin ilki hariç  karakter sayılarını toplayan ve
        bu toplamı birinci parametrenin karakter sayısıyla çarpan bir method yazınız.
        (indeks ve if statement kullanmayınız)
   */
     public static void main(String[] args) {
        topla("Ali","Kemal","Senem","Mustafa","Aygen");
     }
     public static void topla(String x,String...y){

         int toplam=0;

         for (String w : y){
             toplam+=w.length();
         }
        int result = toplam*x.length();
         System.out.println("result = " + result);
     }

}
