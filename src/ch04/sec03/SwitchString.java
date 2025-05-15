package ch04.sec03;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력 해주세요. (W/M) > ");
        String gender = scanner.next();
        System.out.println("gender: " + gender);
    switch(gender) {
        case "w","W","여자","여":
            System.out.println("여자입니다.");
            break;
        case "m","M","남자","남":
            System.out.println("남자입니다.");
            break;
        default:
            System.out.println("성별을 입력해주세요.");
            break;
    }
    scanner.close();
    }
}
