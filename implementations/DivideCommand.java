package implementations;

import interfaces.Command;

public class DivideCommand implements Command {
    @Override
    public void execute(int num1, int num2) {
        try {
            System.out.println("Answer : "+(num1/num2));
        }catch (ArithmeticException e){
            System.out.println("Cannot divide with 0 , please try again");
        }
    }
}
