package ch04;

public class EvenOdd {
    public static void main(String[] args) {
        //홀, 짝 + 랜덤숫자
        int num = 16;
        // mod % 연산자 사용

        System.out.printf("%d / %d = %d\n", num, 5, num/5);
        System.out.printf("%d %% %d = %d\n", num, 5, num%5);
        if(num%2 == 0) {
            System.out.printf("%d는 짝수입니다.\n",num);
        }else {
            System.out.printf("%d는 홀수입니다.\n",num);
        }
        System.out.println("---끝---");
    }
}
