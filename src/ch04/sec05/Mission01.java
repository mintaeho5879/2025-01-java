package ch04.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean run = true;
        System.out.println("합계를 구할 숫자를 입력하세요. (종료: 0)");
        while (run) {
            System.out.print(">>");
            int value = scanner.nextInt();
            sum += value;
           System.out.printf("현재 합계: %,d\n",sum);
           if (value == 0) {
              run = false;
               System.out.println("--끝--");
               scanner.close();
           }

       }

        /*
        합계를 구할 숫자를 입력하세요. (종료 :0)
        >> 100
        >> 200
        >> 300
        >> 400
        >> 0
        합계 : 1000
         */
    }
}
