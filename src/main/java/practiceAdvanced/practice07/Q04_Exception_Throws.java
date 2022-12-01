package practiceAdvanced.practice07;

public class Q04_Exception_Throws {

    public static void main(String[] args) throws Exception {
    randomSayi();

    }
    public static void randomSayi() throws Exception {
        int a = (int)(Math.random()*11);
        int b = (int)(Math.random()*11);
        System.out.println(a+b);
        if (a+b<12){
            throw new Exception("Toplam 12 den kucuk ise hata verir");
        }
    }
}

