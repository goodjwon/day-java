package demo.step1;

public class Main2 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please input a file name");
            return;
        }

        System.out.println("Hello "+ args[0]);
    }
}