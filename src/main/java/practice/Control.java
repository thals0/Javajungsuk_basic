package practice;

class Control1_1 {
    public static void main(String[] args) {
        char ch = 'b';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        }
    }
}

class Control1_2 {
    public static void main(String[] args) {
        char ch = 'Z';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else {
            System.out.println("해당 문자는 영문 소문자가 아닙니다.");
        }
    }
}

class Control1_3 {
    public static void main(String[] args) {
        char ch = 'p';

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("해당 문자는 영문 대문자입니다.");
        } else {
            System.out.println("해당 문자는 영문자가 아닙니다.");
        }

        int score = 70;

        if (score >= 90) {
            System.out.println("A등급입니다.");
        } else if (score >= 80) {
            System.out.println("B등급입니다.");
        } else if (score >= 70) {
            System.out.println("C등급입니다.");
        }
    }
}

class Control1_4 {
    public static void main(String[] args) {
        int score = 87;

        if (score >= 90) {
            if (score >= 95) {
                System.out.println("A++등급입니다.");
            } else {
                System.out.println("A등급입니다.");
            }
        } else if (score >= 80) {
            if (score >= 85) {
                System.out.println("B++등급입니다.");
            } else {
                System.out.println("B등급입니다.");
            }
        } else if (score >= 70) {
            if (score >= 75) {
                System.out.println("C++등급입니다.");
            } else {
                System.out.println("C등급입니다.");
            }
        } else {
            System.out.println("D등급입니다.");
        }
    }
}

class Control2_1 {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            case 0:
            case 13:
                System.out.println("이런식으로 case 문을 사용할 수 있습니다.");
                break;
            case 15:
            default:
                monthString = "Invalid month";
        }
        System.out.println(monthString);
    }
}

class Control3_1 {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("for문 돌아가는 중 : " + i);
        }
        System.out.println(i);
    }
}

class Control3_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

class Control3_3 {
    public static void main(String[] args) {
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.println(i);
            System.out.println(j);
        }
        System.out.println();
        for (int k = 1, t = 10; k <= 10 && t > 2; k++, t--) {
            System.out.println(k);
            System.out.println(t);
        }
    }
}

class Control3_4 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단 시작합니다.");
            for (int j = 1; j < 10; j++) {
                System.out.println("j는 현재 " + (j) + "입니다.");
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}

class Control3_5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int e : arr) {
            System.out.println(e + " ");
        }
    }
}

class Control4_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
//            1 ~ 10 사이의 난수 20개 출력해보기
            System.out.println(Math.random() * 10); // 0.0 * 10 <= x * 10 < 1.0 * 10
            System.out.println((int) (Math.random() * 10)); // 0 <= (int)(x * 10) < 10
            System.out.println((int) (Math.random() * 10 + 1)); // 1 <= (int)(x * 10) + 1 < 11

//            -5 ~ 5 사이의 난수 20개 출력해보기
            System.out.println(Math.random() * 11 - 5); // -5 ~ 5
        }
    }
}

// while 문
class Control5_1 {
    public static void main(String[] args) {
        int i = 10;
//        while (i-- != 0){
//            System.out.println(i);
//        }
        // 위 코드와 똑같이 동작
        while (i != 0) {
            i--;
            System.out.println(i);
        }
    }
}

class Control5_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum <= 100) {
            System.out.printf("%d %d", i, sum);
            System.out.println();
            sum += ++i;
        }
    }
}

// do-while 문
class Control5_3 {
    public static void main(String[] args) {
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j < 20);

        System.out.println(j);
    }
}

// break
class Control6_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (true) {
            // 여기서는 if문 괄호를 안써도 되네 ?
            if (sum > 100)
                break;
            ++i;
            sum += i;
        }
        System.out.println(i);
        System.out.println(sum);
    }
}

// continue
class Control6_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }
}

class Control6_3 {
    public static void main(String[] args) {
        allLoop:
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j)); // 구구단 4단만 출력
            }
        }
    }
}

class Control6_4 {
    public static void main(String[] args) {
        int i = 2;
        allLoop :
        while (true) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            i++;
        }
    }
}

class Control6_5 {
    public static void main(String[] args) {
        // 5단 빼고 출력
        allLoop : for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    continue allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
