package demo.step1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("enter your name : ");
        Scanner yourName = new Scanner(System.in);
        while (true) {
            String name = yourName.nextLine();
            if (name.equals("exit")) {
                break;
            }
            System.out.println("Hello " + name);
        }
    }
}
