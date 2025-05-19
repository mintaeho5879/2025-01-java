package ch04.sec08;

import java.sql.SQLOutput;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //이 라인은 수정불가
            if( i % 2 == 1 ){
                continue;
            }
        System.out.print(i + " ");
        }
        //출력결과
        //2 4 6 8 10
    }
}

