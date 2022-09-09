package demo.step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
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
                result = logical(list, command, result);
                logicPrint(list, command, result);

                command = clear(list);
            }
        }
    }

    private static String clear(List<Integer> list) {
        String command;
        list.clear();
        command = "";
        return command;
    }

    private static void logicPrint(List<Integer> list, String command, Integer result){
        System.out.println(list.get(0) +" "+ command +" "+ list.get(1) + " = ".concat(String.valueOf(result)));
    }

    private static Integer logical(List<Integer> list, String command, Integer result) {
        switch (command){
            case "+" :
                result = add(list.get(0), list.get(1));
                break;
            case "-":
                result = minus(list.get(0), list.get(1));
                break;
            case "/":
                result = divide(list.get(0), list.get(1));
                break;
            case "*":
                result = multiply(list.get(0), list.get(1));
                break;
            default:
                System.out.println("지원하지 않는 연산 기호 입니다.");
                break;}

        return result;
    }

    public static int add(int a, int b) {
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
