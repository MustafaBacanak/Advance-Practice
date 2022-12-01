package practiceAdvanced.practice04;

public class Q06_Statik_Butce_Runner {
    //Basit bir ev butcesi kodu yaziniz.

    public static void main(String[] args) {

        Butce baba=new Butce();

        System.out.println("Maas oncesi butce : "+Butce.butce);//00
        baba.maasAl(5000);
        System.out.println("Maas sonrasi butce : "+Butce.butce);//5000


        baba.harclikAl(500);//4500 butce
        baba.harclikHarca(250);
        baba.butcedenHarca(1000);

        System.out.println("Butce : "+Butce.butce);
        System.out.println("Baba Harclik :"+baba.harclik);

        Butce anne =new Butce();
        anne.maasAl(2000);
        anne.maasAl(3000);
        anne.harclikAl(500);
        anne.harclikHarca(300);


        Butce kiz=new Butce();
        kiz.harclikAl(500);
        kiz.harclikHarca(400);


        System.out.println("Son Butce : "+Butce.butce);
        System.out.println("Anne Harclik :"+anne.harclik);

    }

}
