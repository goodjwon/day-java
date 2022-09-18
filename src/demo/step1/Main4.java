package demo.step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main4{
    public static void main(String[] args) {
        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String command = "";
        Integer result = 0;

        while (true){
            if(list.size() < 2){
                list.add(Integer.parseInt(scanner.nextLine()));
            } else {
                command = scanner.nextLine();
            }

            if(!command.equals("")){
                result = Calculator.logical(command, list);
                Calculator.logicPrint(list, command, result);
                command = clear(list);
            }
        }
    }

    static String clear(List<Integer> list) {
        String command;
        list.clear();
        command = "";
        return command;
    }
}

class Calculator {
    static void logicPrint(List<Integer> list, String command, Integer result){
        System.out.println(list.get(0) +" "+ command +" "+ list.get(1) + " = ".concat(String.valueOf(result)));
    }

    static Integer logical(String command, List<Integer> list) {
        return switch (command) {
            case "+" -> list.stream().reduce((r1, r2) -> add(r1, r2)).orElseThrow(()-> new RuntimeException("error"));
            case "-" -> list.stream().reduce((r1, r2) -> minus(r1, r2)).orElseThrow(()-> new RuntimeException("error"));
            case "*" -> list.stream().reduce((r1, r2) -> multiply(r1, r2)).orElseThrow(()-> new RuntimeException("error"));
            case "/" -> list.stream().reduce((r1, r2) -> divide(r1, r2)).orElseThrow(()-> new RuntimeException("error"));
            default -> throw new RuntimeException("error");
        };
    }

    public static Integer add(int a, int b) {
        return a + b;
    }

    public static int divide(int a, int b) {
        if(b == 0) {return 0;}
        return a / b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

}
