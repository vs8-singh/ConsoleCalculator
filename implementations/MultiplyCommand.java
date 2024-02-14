package implementations;

import interfaces.Command;

public class MultiplyCommand implements Command {
    @Override
    public void execute(int num1, int num2) {
        System.out.println("Answer : "+(num1*num2));
    }
}
