package demo.step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Calculators {
    public static void main(String[] args) {
        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String inputText = "";

        while (true){
            inputText = scanner.nextLine();
            if(isNumeric(inputText)){
                list.add(Integer.parseInt(inputText));
            }

            if(inputText.equals("+")){
                printResult(sum(list));
            } else if(inputText.equals("-")){
                printResult(minuses(list));
            } else if(inputText.equals("*")){
                printResult(multiplies(list));
            } else if(inputText.equals("/")){
                printResult(divides(list));
            } else if(inputText.equals("exit")){
                break;
            } else {
                System.out.println("Please input a number");
            }
        }
    }

    public static int sum(List<Integer> numbers){
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    public static int multiplies(List<Integer> numbers){
        return numbers.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static int divides(List<Integer> numbrers){
        return numbrers.stream()
                .reduce(1, (a, b) -> a / b);
    }

    public static int minuses(List<Integer> numbers){
        return numbers.stream()
                .reduce(0, (a, b) -> a - b);
    }

    private static void printResult(Integer result){
        System.out.println("합계는 : "+result);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
