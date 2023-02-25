package transport;

import jdk.nashorn.internal.objects.annotations.Setter;

//@Setter

public class Public {
    // 클래스 이름 주의 ! publicTransport
    int currentPassenger;
    int num; // number
    int fuel;
    int speed;
    int maxPassenger;
    int remainPassenger;
    String state;

    public Public() {
        this.fuel = 100;
        this.speed = 0;
        this.currentPassenger = 0;
        this.num = hashCode();
    }


    // 연료 변경 및 확인
    public void setFuel(int fuel){
//        this.fuel += fuel;
    };

    // 속도 변경
    public void setSpeed(int speed){};

    // 상태 변경
    public void setState(String state){
        this.state = state;
    };

    // 잔여 탑승객 수
    public int setRemainPassenger() {
        this.remainPassenger = maxPassenger - currentPassenger;
        return remainPassenger;
    }

    // 승객 탑승
    public void board(int passenger){
        if(passenger > maxPassenger){
            System.out.println("최대 승객 수 초과");
        }
    };
}
