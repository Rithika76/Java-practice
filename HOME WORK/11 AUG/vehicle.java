import java.util.*;
interface Insurable {
    double getInsCost(int d);
}
abstract class Veh {
    String vNum;
    String brd;
    double rate;
    Veh(String vNum, String brd, double rate) {
        this.vNum = vNum;
        this.brd = brd;
        this.rate = rate;
    }
    abstract double rentCost(int d);
    void disp() {
        System.out.println("Vehicle Number : " + vNum);
        System.out.println("Brand          : " + brd);
        System.out.println("Base Rate      : " + rate);
    }
}
class Car extends Veh implements Insurable {
    Car(String vNum, String brd, double rate) {
        super(vNum, brd, rate);
    }
    @Override
    double rentCost(int d) {
        return rate * d;
    }
    @Override
    public double getInsCost(int d) {
        return 200 * d;
    }
}
class Bike extends Veh {
    Bike(String vNum, String brd, double rate) {
        super(vNum, brd, rate);
    }
    @Override
    double rentCost(int d) {
        return rate * d;
    }
}
class Truck extends Veh implements Insurable {
    Truck(String vNum, String brd, double rate) {
        super(vNum, brd, rate);
    }
    @Override
    double rentCost(int d) {
        return (rate + 500) * d;
    }
    @Override
    public double getInsCost(int d) {
        return 300 * d;
    }
}
class Agency {
    ArrayList<Veh> list = new ArrayList<>();
    void add(Veh v) {
        list.add(v);
    }
    void bill(String vNum, int d) {
        Veh sel = null;
        for (Veh v : list) {
            if (v.vNum.equals(vNum)) {
                sel = v;
                break;
            }
        }
        if (sel == null) {
            System.out.println("Vehicle " + vNum + " not found.");
            return;
        }
        double rCost = sel.rentCost(d);
        double iCost = 0;
        if (sel instanceof Insurable) {
            iCost = ((Insurable) sel).getInsCost(d);
        }
        double tot = rCost + iCost;
        System.out.println("VEHICLE RENTAL BILL");
        sel.disp();
        System.out.println("Rental Days    : " + d);
        System.out.println("Rental Cost    : " + rCost);
        System.out.println("Insurance Cost : " + iCost);
        System.out.println("Total Bill     : " + tot);
    }
}
public class vehicle_p {
    public static void main(String[] args) {
        Agency ag = new Agency();
        Car c = new Car("CAR101", "Toyota", 2000);
        Bike b = new Bike("BIKE101", "Honda", 800);
        Truck t = new Truck("TRUCK101", "Tata", 3000);
        ag.add(c);
        ag.add(b);
        ag.add(t);
        ag.bill("CAR101", 3);
        ag.bill("BIKE101", 3);
        ag.bill("TRUCK101", 3);
    }
}
