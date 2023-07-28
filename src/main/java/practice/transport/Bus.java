package practice.transport;

public class Bus extends Public{
    private final int fare = 1000;
    private int income;

    public Bus() {
        super();
        this.maxPassenger = 30;
        this.income = 0;
        this.state = "운행";
    }

    public int getCurrentPassenger() {
        return currentPassenger;
    }

    public int getFare() {
        return fare;
    }

    public int getIncome() {
        return income;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel += fuel;
        if(this.fuel <= 10){
            this.state = "차고지행";
            System.out.println("주유가 필요합니다.");
        }
    }

    @Override
    public void setSpeed(int speed) {
        if(fuel > 10){
            this.speed += speed;
        } else{
            System.out.println("주유량을 확인해 주세요.");
        }
    }

    @Override
    public void board(int passenger) {
        if(currentPassenger + passenger <= maxPassenger && state.equals("운행")){
            currentPassenger += passenger;
            income += (fare * passenger);
        } else if(currentPassenger + passenger >= maxPassenger){
            System.out.println("최대 승객수를 초과하여 탑승이 불가합니다.");
        } else {
            System.out.println("운행 중이 아닌 버스입니다.");
        }
    }

}