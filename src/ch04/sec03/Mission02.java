package ch04.sec03;

public class Mission02 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0); // 0~100 랜덤값 나올 수 있도록
        int dec = score/10;
        switch (dec) {
            case 10,9 :
                System.out.println("A학점");
                break;
            case 8 :
                System.out.println("B학점");
                break;
            case 7 :
                System.out.println("C학점");
                break;
            default:
                System.out.println("D학점");
                break;
        }

        //switch 이용해서 단 !! 겁나 나이스하게~
        System.out.println(score);
    }
}
