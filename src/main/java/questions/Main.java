package questions;

import java.util.List;

public class Main {

    //    public class Showroom extends ArrayList<Car> {
    /*
    public Showroom(int initialCapacity) {
        super(initialCapacity);  // constructordan yaptık
        //(amacımız capasiteyi girebilmek için) /Showroom showroom=new Showroom(20);/ buraya)
    }

    public Showroom(){

    }

     */


//    }
//    record Car(int id,String name){}
//    //Showroom showroom=new Showroom(20);
//    List<Car> showroom=new Showroom();
//        showroom.add(new Car(1,"Car 1"));
//        showroom.add(new Car(2,"Car 2"));
//        showroom.add(new Car(3,"Car 3"));
//        showroom.add(new Car(4,"Car 4"));
//
//        showroom.add(1,new Car(5,"Car 5"));
//
//
//        for(var item:showroom){
//        System.out.println(item);
//    }
//        System.out.println();
//        System.out.println(showroom.get(1));
//}
//showroom.forEach(System.out::println);

    public static void main(String[] args) {


        List<Car> showroom = new Showroom();
        showroom.add(new Car(1, "Audi"));
        showroom.add(new Car(2, "BMW"));
        showroom.add(new Car(3, "Lada"));
        showroom.add(new Car(4, "Avensis"));

        showroom.add(1, new Car(5, "WosWos"));


        for (var item : showroom) {
            System.out.println(item);
        }
    }
}