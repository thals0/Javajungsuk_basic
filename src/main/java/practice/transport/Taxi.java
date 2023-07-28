package practice.transport;

public class Taxi extends Public{
    String destination;
    int destDist;
    int basicDist;
    int basicFee;
    int distFee;
    int income;
    int totalIncome;

    public Taxi(int TaxiNum) {
        super();
        this.num = TaxiNum;
        this.maxPassenger = 4;
        this.basicDist = 1;
        this.basicFee = 3000;
        this.distFee = 1000;
        this.state = "일반";
    }

    // 주유량
    @Override
    public void setFuel(int fuel) {
        super.setFuel(fuel);
        this.fuel += fuel;
        if(this.fuel <= 10){
            this.state = "운행불가";
            System.out.println("주유가 필요합니다.");
        }
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDestDist(int destDist) {
        this.destDist = destDist;
    }

    // 승객 탑승
    public void board(int passenger, String destination, int destDist) {
        if(passenger > maxPassenger){
            System.out.println("최대 승객수를 초과하여 탑승이 불가합니다.");
        } else {
            currentPassenger = passenger;
            setDestination(destination);
            setDestDist(destDist);
            setIncome();
            addFee(destDist);
            setState("운행");
        }
    }

    public void setIncome() {
        this.income = basicFee;
    }

    // 거리당 요금 추가
    public void addFee(int destDist){
        income += (distFee * (destDist-1));
    }

    // 요금 결제
    public void pay(){
        totalIncome += income;
        income = 0;
    }
}
