package practiceAdvanced.practice09.Q04_MaasHesaplama_Interface;

public class MaasHesapla implements MaasArtir,Vergi {
    @Override
    public double yillikEkstra(int calismaYili) {
        System.out.println("Calisma Yili :"+calismaYili*100);
        return calismaYili*100;
    }

    @Override
    public double saatlikEkstra(int calismaSaati) {
        System.out.println("Calisma Saati :"+(calismaSaati-160)*10);
        if (calismaSaati-160>0){
            return (calismaSaati-160)*10;
        }else {
            return 0;
        }
    }

    @Override
    public double vergi(double brütMaas, int calismaYili) {
        System.out.println("Vergi :"+brütMaas*0.70);
        if(calismaYili>10){
            return brütMaas*0.30;
        }else {
            System.out.println("Vergi :"+brütMaas*0.20);
            return brütMaas*0.80;
        }
    }

    public double netMaas(double brütMaas,int calismaYili, int calismaSaati){
        return brütMaas+yillikEkstra(calismaYili)+saatlikEkstra(calismaSaati)-vergi(brütMaas,calismaYili);

    }
}
