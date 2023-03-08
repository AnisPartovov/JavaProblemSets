
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int oddOrEven = sc.nextInt();
        if (oddOrEven % 2 == 1){
            System.out.println("This number is odd");
        } else if (oddOrEven == 0) {
            System.out.println("0 is not odd nor even");

        }else {
            System.out.println("This number is even");
        }
    }
}
