public class NumberDigits {
    public static void main(String[] args) {
       splitDigits();

    }

    public static void splitDigits(){
        int lineCounter = 1;
        while (lineCounter < 8) {
            int numberCounter = 1;
            while (numberCounter < lineCounter + 1) {
                System.out.print(lineCounter);
                numberCounter++;
            }
            System.out.println();
            lineCounter++;
        }
    }

}
