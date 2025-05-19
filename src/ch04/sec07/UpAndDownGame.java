package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random()*100.0) + 1; // 1~ 100

        while(true){
            System.out.print("1-100사이 숫자를 입력해주세요 >");
            int input = scanner.nextInt();
            if(input > answer) {
                System.out.println("down!");
            } else if( input < answer) {
                System.out.println("up!");
            } else {
                System.out.println("정답!");
                break; // break 를 감싸고 있는 가장 가까운 반복문을 빠져나온다.
            }
        }
        System.out.println("answer: " + answer);
        System.out.println("-- 끝 -- ");


        /*
      1- 100사이 숫자를 입력해주세요 > 50
      down!
      1- 100사이 숫자를 입력해주세요 > 25
      up!
      맞출때까지 반복한다.

      정답!!
      */


    }
}
