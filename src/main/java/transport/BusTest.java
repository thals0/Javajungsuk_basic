package transport;

public class BusTest {
    public static void main(String[] args) {
        Bus bus100 = new Bus();
        Bus bus200 = new Bus();

        if(bus100.num == bus200.num){
            System.out.println("같은 버스 입니다.");
        } else{
            System.out.println("다른 버스 입니다.");
        }
        System.out.println();

        bus100.board(2);
        System.out.println("탑승 승객 수 = " + bus100.getCurrentPassenger());
        System.out.println("잔여 승객 수 = " + bus100.setRemainPassenger());
        System.out.println("요금 확인 = " + bus100.getIncome());
        System.out.println();

        bus100.setFuel(-50);
        System.out.println("주유량 = " + bus100.fuel);
        System.out.println();

        bus100.setState("차고지행");
        bus100.setFuel(10);
        System.out.println("상태 = " + bus100.state);
        System.out.println("주유량 = " + bus100.fuel);
        System.out.println();

        bus100.setState("운행");
        bus100.board(45);

        bus100.board(5);
        System.out.println();
        System.out.println("탑승 승객 수 = " +  bus100.getCurrentPassenger());
        System.out.println("잔여 승객 수 = " + bus100.setRemainPassenger());
        System.out.println("요금 = " + bus100.getIncome());
        System.out.println();

        bus100.setFuel(-55);
        System.out.println("주유량 = " + bus100.fuel);
        System.out.println("상태 = " + bus100.state);
    }
}
