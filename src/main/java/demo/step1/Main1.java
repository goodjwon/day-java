package demo.step1;

public class Main1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please input a name");
            return;
        }

        for(String a : args) {
            System.out.println("Hello " + a);
        }
    }
}
