import java.util.Scanner;

/**
 * �ǽ����� 1��
 */
public class dollar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��ȭ�� �Է��ϼ���(���� ��)>>");
        int Won = sc.nextInt();
        float Dollar = Won / 1100;
        System.out.println(Won + "���� $" + Dollar + "�Դϴ�.");
        sc.close();
    }
}