package ch04;

public class Mission10_02 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 4.0) + 3; // 3~6 랜덤값
        System.out.printf("star: %d\n", star);
        int totalCount = star * star;
        for(int i=1; i<=totalCount; i++) {
             System.out.print("*");
             if(i % star == 0) {
                 System.out.println();
             }
         }
        /*
        star: 3
        ***
        ***
        ***

        star :5
        *****
        *****
        *****
        *****
        *****
         */

    }
}
