public class newClass {

    public static void printLine() {
        System.out.println("_________________________________");
    }

    public static int sumMath(int a, int b) {
        int c;
        c = Math.abs(a + b);
        System.out.println(c);

        return c;
    }

    public static void main(String[] args) {
        printLine();

        sumMath(-5, -2);

        printLine();

    }
}
