class Q1{
    public static void main(String[] args) {
        // 2-4. 다음 중 변수를 잘못 초기화 한 것은?
        // 마지막꺼 빼고 다 이상한거 아님?
//        byte b = 256;
//        char c = '';
//        char answer = 'no';
//        float f = 3.14;
        double d = 1.4e3f;
    }
}

class Q2{
    public static void main(String[] args) {
        //2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
        System.out.println("1" + "2"); // 12
        System.out.println(true+""); // true
        System.out.println('A' + 'B'); // 131
        System.out.println("A" + "B"); // AB
        System.out.println('1' + 2); // 51
        System.out.println('1' + '2'); // 99
        System.out.println('J' +"ava"); // Java
//        System.out.println(true + null); // Err
        System.out.println("" + true + null); // truenull
    }
}

//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
class Q3{
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;

        int temp = x; // 1
        int temp2 = z; // 3
        x = y; // x = 2
        y = temp2; // y = 3
        z = temp; // z = 1

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
//예상 결과 : x=2, y=3, z=1

