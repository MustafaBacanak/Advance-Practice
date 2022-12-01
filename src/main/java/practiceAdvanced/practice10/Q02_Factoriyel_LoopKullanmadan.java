package practiceAdvanced.practice10;

public class Q02_Factoriyel_LoopKullanmadan {

    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)

    public static void main(String[] args) throws Exception {

        System.out.println(factoriyelHesapla(5));
    }

    public static int factoriyelHesapla(int sayi) throws Exception {
        if (sayi > 0) {
            if (sayi == 1) {
                return 1;
            } else {
                return sayi * factoriyelHesapla(sayi - 1);
            }
        }else {
            throw new Exception("Sayi sifirdan buyuk olmali");
        }
    }
}
