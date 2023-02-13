import javax.swing.*;
import javax.xml.stream.StreamFilter;
import java.util.Date;

class Variable1_1 {
    boolean flag;
    char grade;
    byte val;
    short sval;
    int num;
    long price;
    float tax;
    double score;
}

class Variable1_2 {
    public static void main(String[] args) {
        boolean flag = false;
        char grade = 'A';
        byte val = 127;
        short sval = 128;
        int num = 32768;
        long price = 2_147_483_648L;
        float tax = 3.14f;
        double score = 3.14159265358979;

        System.out.println(flag);
        System.out.println(grade);
        System.out.println(val);
        System.out.println(sval);
        System.out.println(num);
        System.out.println(price);
        System.out.println(tax);
        System.out.println(score);
    }
}

class Variable1_3{
    public static void main(String[] args) {
        int year, age = 23;

        year = age + 2000;
        System.out.println(year);

        age = age + 1;
        System.out.println(age);
        System.out.println(year);
    }
}

class Variable1_4{
    static int classVal = 100; // 클래스 변수
    int instanceVal = 200; // 인스턴스 변수

    public static void main(String[] args) {
        int num; // 지역 변수
//        System.out.println(num); // Err
        num = 300;
        System.out.println(num); // 300

        // 인스턴스 변수
//        System.out.println(instanceVal); // Err
        Variable1_4 instance = new Variable1_4();
        System.out.println(instance.instanceVal); // 100

        // 클래스 변수
        System.out.println(classVal); // 같은 클래스 내부는 바로 접근 가능
        System.out.println(Variable1_4.classVal); // 클래스 변수 : 클래스명.클래스변수명 으로 접근
    }
}

class Variable2_1 {
    public static void main(String[] args) {
        int score = 100;
        System.out.println(score);
        score = 90;
        System.out.println(score);

        final int finalScore = 100;
        System.out.println(finalScore);
//            finalScore = 90; // Err
    }
}

class Variable2_2{
    public static void main(String[] args) {
        int score = 100;
        final int finalScore = 1000;

        // score : 변수
        // finalScore : 상수
        // 100, 1000 : 리터럴
    }
}

class Vraiable2_3 {
    public static void main(String[] args) {
//        boolean flag1 = 22; // Err
        boolean flag2 = false;

//        char grade1 = 'AA'; // Err
//        char grade2 = "A"; // Err
        char grade3 = 'A';
        char ch = '\n';

        String str = "C";
//        String name1 = 'choi'; // Err
//        String name2 = 'C'; // Err
        String name3 = "Choi";

//        byte val1 = 128; // Err
        byte val2 = 127;

        short sval = 128;

        // 리터럴 접두사 예제
        // int의 진수 표현
        int ob = 0b0101; // 2진수, 접두사 0b
        int i = 100; // 10진수
        int oct  = 0100; // 8진수, 접두사 0
        int hex = 0x100; // 16진수, 접두사 0x

        System.out.printf( "%d, %d , %d , %d", ob ,  i ,  oct , hex);

        long price = 2_147_483_648L; // _ 를 사용하여 숫자 표현 가능!
//        long l1 = 2_147_483_648; // Err , int 범위를 넘었으니 L 접미사 필수!
        long l2 = 100; // int의 범위를 넘지 않으면 L 생략 가능

//        float tax1 = 3.14;
        float tax2 = 3.14f;

        double score1 = 3.14159265358979; // d 생략 가능!
        double score2 = 3.14159265358979d;

        float f1 = 10f; // 10.0f
        double d1 = 10.; // 10.0
        double d2 = .10; // 0.10
        double d3 = 1e3; // 1000.0 , e3 = 10의 3제곱
        double d4 = -1e3; // -1000.0
    }
}

class Variable3_1{
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;

        // short 타입에서 최솟값 범위를 넘었을 때
        // sMin -1 = 32767
        System.out.println(sMin);
        System.out.println((short)(sMin -1));

        // short 타입에서 최댓값 범위를 넘었을 때
        // sMin + 1 = -32768
        System.out.println(sMax);
        System.out.println((short)(sMax + 1));

        // 부호없는 경우
        char cMin = 0;
        char cMax = 65535;

        // short 타입에서 최솟값 범위를 넘었을 때
        // cMain -1 = 65535
        System.out.println((int)(cMin));
//        System.out.println((short)(cMin));

        // 왜 위에서는 short쓰고 여기서는 int로 씀?
        System.out.println((int)(--cMin)); // 65535
        System.out.println((short)(--cMin)); // -2

        // short 타입에서 최댓값 범위를 넘었을 때
        // cMax + 1 = 0
        System.out.println((int)cMax);
        System.out.println((int)(++cMax));
    }
}

class Variable3_2{
    public static void main(String[] args) {
        int num = 5;
        char ch = '5';

        // 숫자 -> 문자
        System.out.println(num);
        System.out.println((char)(num+'0'));

        // 문자 -> 숫자
        System.out.println(ch);
        System.out.println(ch -'0');

        // '5'에서 숫자 5로 변환되었기 때문에 결과값 6
        System.out.println(ch-'0' + 1);

    }
}

class Variable3_3{
    public static void main(String[] args) {
        int num = 5;
        char ch = '5';

        // 숫자 -> 문자열
        System.out.println(num + "");
        // num 이 "5" 로 변환되었기 때문에 "5" + "5" 로  결과값은 "55"
        System.out.println(num + "" + "5");

        // 문자 -> 문자열
        System.out.println(ch + "");
        // ch 이 '5' 에서 "5" 로 변환되었기 때문에 "5" + "8" 로  결과값은 "58"
        System.out.println(ch + "" + "8");
    }
}

class Variable3_4{
    public static void main(String[] args) {
        String str1 = "100";
        String str2 = "3.14";
        String str3 = "8";

        // 문자열 -> 숫자
        System.out.println(Integer.parseInt(str1));
//        System.out.println(Integer.parseInt(str2)); // Err
        System.out.println(Double.parseDouble(str2));

        // 문자열 -> 문자
        System.out.println(str1.charAt(0) +  + str1.charAt(1) + str1.charAt(2)); //145
        System.out.println(str3.charAt(0));
    }
}

class Variable3_5 {
    public static void main(String[] args) {
        Date date;
        date = new Date();
        System.out.println(date);

    }
}

class Variable4_1 {
    public static void main(String[] args) {
        char ch1 = 'A'; // 문자
        // char ch2 = 'AB'; // Error 발생
        // char ch3 = ''; // Error 발생, 빈 문자 불가능

        String s1 = "ABC"; // 문자열
        String s2 = ""; // 빈 문자열 가능
        String s3 = "A"; // 문자 한 개도 문자열!

        // 아래 두 표현식 모두 사용 가능하지만 ss2 방식은 거의 사용하지 않음!
        String ss1 = "AB";
        String ss2 = new String("AB");

        System.out.println("ss1 = " + ss1);
        System.out.println("ss2 = " + ss2);
    }
}

class Variable4_2 {
    public static void main(String[] args) {
        String s1 = "A" + "B";
        System.out.println(s1); // AB

        String s2 = "" + 7;
        System.out.println(s2); // 7

        String s3 = "" + 7 + 7 ;
        System.out.println(s3); // 77

        String s4 = 7 + 7 + "";
        System.out.println(s4); // 14
    }
}

class Variable4_3 {
    public static void main(String[] args) {
        // 연산자 값 교환 해보기
        int x = 10, y = 20;
        x = y;
        y = x;
        System.out.printf("%d, %d", x, y);

        int a = 10, b = 20;
        int tmp;
        tmp = a;
        a = b;
        b = tmp;

        System.out.printf("%d %d %d", a, b, tmp);
    }
}