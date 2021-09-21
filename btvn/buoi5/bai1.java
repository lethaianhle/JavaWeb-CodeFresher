import java.util.Scanner;

public class bai1{
	public static void main(String[] args){
		int a;
		int b;	
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		a = sc.nextInt();
		System.out.print("Nhap b: ");
		b = sc.nextInt();
		System.out.print("Nhap c: ");
		c = sc.nextInt();
		int max = a;

		if(max < c){
			max = c;
		} else if(max < b){
			max = b;
		} else {
			max = a;
		}
		System.out.println("So lon nhat trong 3 so la: " + max);
	}	
}