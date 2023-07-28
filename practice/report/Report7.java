package practice.report;

class Exercise6_17 {
    /*shuffle 메서드를 작성하세요. */
    static int[] shuffle(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}

class Exercise6_18 {

    /*isNumber 메서드를 작성하세요.*/
    static boolean isNumber(String str){
        boolean ans = true;
        char[] ch = str.toCharArray();
        for(char c: ch){
            if (c < '0' || c > '9'){
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
}
//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false

// 6-19. Tv클래스를 주어진 로직대로 완성하세요. 완성한 후에 실행해서 주어진 실행결과와 일치하는지 확인하세요.
class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    void turnOnOff() {
        // (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
        isPowerOn = !isPowerOn;
    }
    void volumeUp() {
        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
        if(volume<MAX_VOLUME){
            volume++;
        }
    }
    void volumeDown() {
        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
        if(volume>MIN_VOLUME){
            volume--;
        }
    }
    void channelUp() {
        // (4) channel의 값을 1 증가시킨다.
        // 만일 channel이 MAX_CHANNEL이면 , channel의 값을 MIN_CHANNEL로 바꾼다.
        if(channel == MAX_CHANNEL){
            channel = MIN_CHANNEL;
        } else{
            channel++;
        }
    }
    void channelDown() {
        // (5) channel의 값을 1 감소시킨다 .
        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
        if(channel == MIN_CHANNEL){
            channel = MAX_CHANNEL;
        } else {
            channel--;
        }

    }
}

class Exercise6_19 {
    public static void main(String args[]) {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
        t.channelDown();
        t.volumeDown();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
    }
}

//예상 결과 : CH: 100, VOL: 0 / CH: 99, VOL: 0 / CH: 100, VOL: 100

//class Exercise6_20 {
//    /* (1) max 메서드를 작성하시오 . */
//    static int max(int[] arr){
//        int num;
//        try {
//            if (arr.length != 0){
//                num = arr[0];
//                for(int n: arr){
//                    if(num < n){
//                        num = n;
//                    }
//                }
//            } else{
//                num = -999999;
//            }
//        } catch (NullPointerException e){
//            num = -999999;
//        }
//        return num;
//    }
//    public static void main(String[] args) {
//        int[] data = {3,2,9,4,7};
//        System.out.println(java.util.Arrays.toString(data));
//        System.out.println("최대값 :"+max(data));
//        System.out.println("최대값 :"+max(null));
//        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
//    }
//}

class Exercise6_20 {
    public static int max(int[] arr){
        if (arr == null || arr.length == 0){
            return -999999;
        }
        int max = arr[0]; // 초기화
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    /* (1) max 메서드를 작성하시오 . */
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
    }
}

//예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999

class Exercise6_21 {
    /* (1) abs 메서드를 작성하시오. */
    static int abs(int val){
        return Math.abs(val);
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10