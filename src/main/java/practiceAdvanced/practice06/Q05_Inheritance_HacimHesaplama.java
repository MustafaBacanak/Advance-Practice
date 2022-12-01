package practiceAdvanced.practice06;

public class Q05_Inheritance_HacimHesaplama {

    public static void main(String[] args) {

        KarePrizma karePrizma=new KarePrizma();
        double khacim =karePrizma.hacimHesapla(5,8);
        System.out.println("hacim = " + khacim);

        Silindir silindir=new Silindir();
        double shacim = silindir.hacimHesapla(5,8);
        System.out.println("shacim = " + shacim);

        Koni koni=new Koni();
        double kohacim=koni.hacimHesapla(5,8);
        System.out.println("kohacim = " + kohacim);
    }
}
