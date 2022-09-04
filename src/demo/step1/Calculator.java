package demo.step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true){
            list.add(Integer.parseInt(scanner.nextLine()));
            if(list.size() == 2){
                System.out.println(list.get(0) + " + " + list.get(1) + " = " + (add(list.get(0), list.get(1))));
                break;
            }
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
