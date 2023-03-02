package Person;

public class PersonRunner {
    public static void main(String[] args) {
        Person abc = new Person("Anis", "Partovov", "test@mail.com", 25);
        System.out.println(abc.getLastName());
        System.out.println(abc.toString());

    }
}
