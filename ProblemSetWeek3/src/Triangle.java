import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an angle for side a:");
        int a = sc.nextInt();
        System.out.println("Enter an angle for side b:");
        int b = sc.nextInt();
        System.out.println("Enter an angle for side c:");
        int c = sc.nextInt();
        int res = a + b + c;
        if (res == 180 && a != 0 && b != 0 && c != 0) {
            System.out.println("It is a valid triangle.");
        }else {
            System.out.println("It is not a valid triangle.");
        }
    }
}
