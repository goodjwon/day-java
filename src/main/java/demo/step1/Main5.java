package demo.step1;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) throws ScriptException {
//        ScriptEngine engine = new ScriptEngineManager().getEngineByName("graal.js");


        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("수식을 입력하세요: ");
            String s = scan.nextLine();

            if(s == "exit")
                break;

            Object result = engine.eval(s);
            System.out.println(result);
        }

        scan.close();


    }
}
