package services;

import pojos.Input;

import java.util.Scanner;

public class Calculator {

    CalculatorInvoker calculatorInvoker = new CalculatorInvoker();
    Scanner in = new Scanner(System.in);

    public void run() {
        do {
            Input input = getInput();
            performCalculation(input);
        } while (doContinue());
    }

    private boolean doContinue() {
        System.out.println("Do you want to continue(yes/no) ?");
        String command = in.next();
        return !command.equalsIgnoreCase("no");
    }

    private Input getInput() {
        Input input = new Input();
        System.out.println("Please enter first number : ");
        int num1 = in.nextInt();
        System.out.println("Please enter second number : ");
        int num2 = in.nextInt();
        System.out.println("Please enter operand( '+' / '-' / '*' / '/', 'exit') : ");
        String operand = in.next();
        input.setNums(new int[]{num1, num2});
        input.setOperand(operand);
        return input;
    }

    private void performCalculation(Input input) {
        int[] numbers = input.getNums();
        int num1 = numbers[0];
        int num2 = numbers[1];
        String operand = input.getOperand();
        switch (operand) {
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
        calculatorInvoker.calculate(num1, num2);
    }

}
