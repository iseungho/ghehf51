import java.util.Scanner;

/**
 * �ǽ����� 2��
 */
public class equrs_ten_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2�ڸ��� ���� �Է�(10~99)>>");
        int Integer = sc.nextInt();
        if (Integer / 10 == Integer % 10) {
            System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
        }
        sc.close();
    }
}