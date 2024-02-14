import implementations.*;

import java.util.Objects;
import java.util.Scanner;

public class ConsoleCalculator {

    static CalculatorInvoker calculatorInvoker = new CalculatorInvoker();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Please enter first number : ");
            int num1 = in.nextInt();
            System.out.println("Please enter second number : ");
            int num2 = in.nextInt();
            System.out.println("Please enter operand( '+' / '-' / '*' / '/', 'exit') : ");
            String operand = in.next();
            performCalculation(num1,num2,operand);
            System.out.println("Do you want to continue(yes/no) ?");
            String command = in.next();
            if(command.equalsIgnoreCase("no")) break;
        }
    }

    private static void performCalculation(int num1, int num2, String operand) {
        switch (operand){
            case "+":
                calculatorInvoker.setCommand(new AddCommand());
                break;
            case "-":
                calculatorInvoker.setCommand(new SubtractCommand());
                break;
            case "*":
                calculatorInvoker.setCommand(new MultiplyCommand());
                break;
            case "/":
                calculatorInvoker.setCommand(new DivideCommand());
                break;
            default:
                calculatorInvoker.setCommand(new InvalidCommand());
        }
        calculatorInvoker.calculate(num1,num2);
    }
}
