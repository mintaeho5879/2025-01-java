package ch04;

public class Mission13 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3; // 3~8 까지 랜덤값
        System.out.printf("star : %d\n", star);
        for (int i = 1; i <= star; i++) {
                for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
