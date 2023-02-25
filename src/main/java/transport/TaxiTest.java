package transport;

public class TaxiTest {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi(1);

        System.out.println("taxi1.fuel = " + taxi1.fuel);
        System.out.println("taxi1.state = " + taxi1.state);

        taxi1.board(2, "서울역", 2);
        System.out.println("taxi1.currentPassenger = " + taxi1.currentPassenger);
        System.out.println("taxi1.setRemainPassenger() = " + taxi1.setRemainPassenger());
        System.out.println("taxi1.basicFee = " + taxi1.basicFee);
        System.out.println("taxi1.destination = " + taxi1.destination);
        System.out.println("taxi1.destDist = " + taxi1.destDist + "km");
        System.out.println("taxi1.income = " + taxi1.income);
        System.out.println("taxi1.state = " + taxi1.state);
        System.out.println();
        
        taxi1.setFuel(-80);
        taxi1.pay();

        System.out.println("taxi1.fuel = " + taxi1.fuel);
        System.out.println("taxi1.totalIncome = " + taxi1.totalIncome);
        System.out.println();

        taxi1.board(5);
        System.out.println();

        taxi1.board(3, "구로디지털단지역", 12);
        System.out.println("taxi1.currentPassenger = " + taxi1.currentPassenger);
        System.out.println("taxi1.setRemainPassenger() = " + taxi1.setRemainPassenger());
        System.out.println("taxi1.basicFee = " + taxi1.basicFee);
        System.out.println("taxi1.destination = " + taxi1.destination);
        System.out.println("taxi1.destDist = " + taxi1.destDist + "km");
        System.out.println("taxi1.income = " + taxi1.income);
        System.out.println();
        
        taxi1.setFuel(-20);
        taxi1.pay();

        System.out.println("taxi1.fuel = " + taxi1.fuel);
        System.out.println("taxi1.state = " + taxi1.state);
        System.out.println("taxi1.totalIncome = " + taxi1.totalIncome);

    }
}
