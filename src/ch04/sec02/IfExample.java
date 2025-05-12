package ch04.sec02;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if( score >= 90 ) { //if 의 조건식에는 boolean type 만 가능
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
        if( score < 90 ) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
