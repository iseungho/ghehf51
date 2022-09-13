import java.util.Scanner;

/**
 * 실습문제 1번
 */
public class dollar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원화를 입력하세요(단위 원)>>");
        int Won = sc.nextInt();
        float Dollar = Won / 1100;
        System.out.println(Won + "원은 $" + Dollar + "입니다.");
        sc.close();
    }
}