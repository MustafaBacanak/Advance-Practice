package practiceAdvanced.practice07;

      /*
         Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
         Input:
         String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
         Output:
         String output ="JavaIsNOTDifficult";
     */

public class Q01_ArrayToStringNegative {
    public static void main(String[] args) {

        String[] arr = {"J", "a", "v", "a", "I", "s", "D", "i", "f", "f", "i", "c", "u", "l", "t"};

        String c=" ";
        for (String w : arr) {
            c+=w;
        }
        System.out.println(c);
       c = c.replace("Is","isNot");

        System.out.println(c);

        
    }

}
