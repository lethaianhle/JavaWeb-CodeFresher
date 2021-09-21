import java.util.Scanner;

public class BTVNBuoi4 {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Nhap vao hai so =====");
        System.out.println("-> So thu nhat: ");
        a = sc.nextInt();
        System.out.println("-> So thu hai: ");
        b = sc.nextInt();

        System.out.println("--- MENU --- ");
        System.out.println("1: Tinh tong hai so.");
        System.out.println("2: Tinh hieu hai so.");
        System.out.println("3: Tinh tich hai so.");
        System.out.println("4: Tinh thuong hai so.");
        System.out.println("5: Exit --");
        choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Tong cua hai so la:" + (a + b));
                isEvenOdd((a + b));
                break;
            case 2:
                System.out.println("Hieu cua hai so la:" + (a - b));
                isEvenOdd((a - b));
                break;
            case 3:
                System.out.println("Tich cua hai so la:" + (a * b));
                isEvenOdd((a * b));
                break;
            case 4:
                System.out.println("Thuong cua hai so la:" + (a / b));
                isEvenOdd((a / b));
                break;
            default:
                break;
        }
    }

    public static void isEvenOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("Ket qua la so chan!");
        } else {
            System.out.println("Ket qua la so le!");
        }
    }

}
