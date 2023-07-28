## this() - 생성자에서 다른 생성자 

같은 클래스의 멤버들 간에 서로 호출할 수 있는 것 처럼 생성자 간에도 서로 호출 가능

단, 다음의 두 조건을 만족시켜야 함

- 생성자의 이름으로 클래서이름 대신 this를 사용한다.
- 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.

```java
class Car {
    String color;
    String gearType;
    int door;

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    
    Car(){
        this("white", "auto", 4);
    }

    Car(String color){
        this(color, "auto", 4);
    }
}
```

같은 클래스 내의 생성자들은 일반적으로 서로 관계가 깊은 경우가 많아서 서로 호출하도록 하여 유기적으로 연결해주면 더 좋은 코드를 얻을 수 있음

그리고 수정이 필요한 경우에 보다 적은 코드만을 변경하면 되므로 유지보수가 쉬워짐

참고, this와 this()는 비슷하게 생겼을 뿐 완전히 다른 것(this는 참조변수이고, this()는 생성자)

- this : 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있음
- this() : 생성자. 같은 클래스의 다른 생성자를 호출할 때 사용