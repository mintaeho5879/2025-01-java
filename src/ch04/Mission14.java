package ch04;

public class Mission14 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 4; // 4 ~ 9 랜덤값
        System.out.println(star);
        for (int i = 1; i<=star; i++){
            int underCnt = star - i;
            for (int j = 0; j < underCnt; j++) {
                System.out.print("_");
                }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
System.out.println();
        }
        System.out.println("==============");

        for(int i=star; i>0; i--) {
            int k=1;
            for(;k<i;k++) {
                System.out.print("_");
            }
            for(;k<=star;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==================");
        for(int i=star;i>0;i--) {
            for(int k=1; k<=star; k++) {
                System.out.print(k<i ? "_" : "*");
            }
            System.out.println();
        }
    }
    }




       /*      star = 4
                ___*
                __**
                _***
                ****

                star = 5
                ____*
                ___**
                __***
                _****
                *****
         */

