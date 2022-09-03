package demo.step1;

public class Calculator {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please input a number");
            return;
        }

        System.out.println(args[0] + " + " + args[1] + " = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
