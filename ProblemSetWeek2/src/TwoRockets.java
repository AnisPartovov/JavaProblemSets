public class TwoRockets {

    public static void top(){
        System.out.println("   /\\          /\\"  );
        System.out.println("  /  \\        /  \\" );
        System.out.println(" /    \\      /    \\");
    }
    public static void boxes(){
        System.out.println("+------+   +-------+");
        System.out.println("|      |   |       |");
        System.out.println("|      |   |       |");
        System.out.println("+------+   +-------+");
    }
    public static void main(String[] args) {
        top();
        boxes();
        System.out.println("|  KG  |   |   KG  |");
        System.out.println("|Soonun|   | Soonun|");
        boxes();
        top();
    }
}
