import java.util.ArrayList;
import java.util.Scanner;

public class ViDu4Va5 {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> arrayList = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        int n;
        double sum = 0;
        System.out.println("Nhap do dai cua list: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            double x;
            System.out.println("Nhap cac phan tu thu " + i + " cua list: ");
            x = scanner.nextDouble();
            sum += x;
            arrayList.add(x);
        }
        System.out.println("----");
        System.out.println(arrayList);
        System.out.println("Tong cac phan tu cua list: " + sum);
        System.out.println("----");
        ArrayList newArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (newArrayList.contains(arrayList.get(i)) == false) {
                newArrayList.add(arrayList.get(i));
            }
        }
        System.out.println(newArrayList);
    }
}
