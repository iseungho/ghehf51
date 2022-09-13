import java.util.Scanner;

/**
 * 실습문제 2번
 */
public class equrs_ten_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2자리수 정수 입력(10~99)>>");
        int Integer = sc.nextInt();
        if (Integer / 10 == Integer % 10) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
        sc.close();
    }
}