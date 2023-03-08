import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age_inp = age.nextInt();
        if (age_inp >= 18 && age_inp <= 150){
            System.out.println("Old enough!");
        } else if (age_inp < 18 && age_inp > 0) {
            System.out.println("Too young");
        }else{
            System.out.println("Incorrect age");
        }
    }
}
