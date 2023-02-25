//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는
// 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
// 제한사항: 1 ≤ numbers의 길이 ≤ 9
            //0 ≤ numbers의 모든 원소 ≤ 9
            //numbers의 모든 원소는 서로 다릅니다.

//class Solution {
//    public int solution(int[] numbers) {
//        int answer = 45;
//        for (int number : numbers){
//            answer -= number;
//        }
//        return answer;
//    }
//}

//class Solution {
//    public int solution(int[] absolutes, boolean[] signs) {
//        int sum = 0;
//        for(int i=0; i<absolutes.length; i++){
//            if(signs[i]){
//                sum += absolutes[i];
//            } else{
//                sum -= absolutes[i];
//            }
//        }
//        return sum;
//    }
//}


//class Solution {
//    public int solution(int[] numbers) {
//        int answer = -1;
//        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
//
//        for(int i=0; i<10; i++){
//            list.removeAll(Arrays.asList(Integer.valueOf(i)));
//        }
//        return answer;
//    }
//}

//class Solution4 {
//    public String solution(int num) {
//        String answer = "";
//        return num % 2 == 0 ? "Even":"Odd";
//    }
//}

//class Solution {
//    public int[][] solution(int[][] arr1, int[][] arr2) {
//        int[][] answer = {};
//        int rows = arr1.length;
//        int cols = arr1[0].length;
//        if (arr1.length > 0 && arr1[0].length > 0){
//            for(int i=0; i<rows; i++){
//                for(int j=0; j<cols; j++){
//                    answer[i][j] += arr1[i][j] + arr2[i][j];
//                }
//            }
//        }
//
//        return answer;
//    }
//}

//class Solution {
//    public long[] solution(int x, int n) {
//        long[] ans = new long[n];
//        int tmp = x;
//        for(int i=0; i< n; i++){
//            ans[i] = x;
//            x += tmp;
//        }
//        return ans;
//    }
//}

//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        for(int i=0; i<s.length();i++){
//            char ch = s.charAt(i);
//            if(i%2==0){
//                ch = Character.toUpperCase(ch);
//                answer += ch;
//            } else{
//                answer += ch;
//            }
//        }
//        return answer;
//    }
//}

//class Solution {
//    public long solution(long n) {
//        long answer = 0;
//        String tmp = Long.toString(n);
//        int[] arr = new int[tmp.length()];
//        for (int i = 1; i < tmp.length(); i++){
//            arr[i] = tmp.charAt(i);
//        }
//        Arrays.sort(arr, Collections.reverseOrder());
//        String ans ="";
//        for (int i: arr){
//            ans += i;
//        }
//        answer = Long.valueOf(ans);
//        return answer;
//    }
//}

//class Solution {
//    public String solution(String s) {
//        StringBuilder ans = new StringBuilder();
//        String[] words = s.split(" ", -1);
//
//        for (String word : words) {
//            for (int i = 0; i < word.length(); i++) {
//                char ch = word.charAt(i);
//
//                if (i % 2 == 0) {
//                    ans.append(Character.toUpperCase(ch));
//                } else {
//                    ans.append(Character.toLowerCase(ch));
//                }
//            }
//            ans.append(" ");
//        }
//
//        // 마지막 공백 제거
//        if (ans.length() > 0) {
//            ans.deleteCharAt(ans.length() - 1);
//        }
//
//        return ans.toString();
//    }
//}

//class Solution {
//    public String solution(int n) {
//        String ans = "";
//        for(int i=1; i<=n; i++){
//            ans += i % 2 == 0 ? "박" : "수";
//        }
//        return ans;
//    }
//}
//public class Main {
//    public int solution(int num) {
//        num = 1000 - num;
//        int cnt = 0;
//        while(num > 0){
//            if (num >= 500){
//                num -= 500;
//                cnt += 1;
//            } else if (num >= 100) {
//                num -= 100;
//                cnt += 1;
//            } else if (num >= 50) {
//                num -= 50;
//                cnt += 1;
//            } else if (num >= 10) {
//                num -= 10;
//                cnt += 1;
//            }
//        }
//        return cnt;
//    }
//
//    public static void main(String[] args) {
//        Main method = new Main();
//        int num1 = 160;
//        System.out.println(method.solution(num1));
//    }
//}

//public class Main {
//    public int solution(String s) {
//        int answer = 0;
//        int cnt = 0;
//        for(int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//            if(c == 'O'){
//                cnt += 1;
//            } else {
//                cnt = 0;
//            }
//            answer += cnt;
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main method = new Main();
//        String s = "OXOOOXXXOXOOXOOOOOXO";
//        System.out.println(method.solution(s));
//    }
//}