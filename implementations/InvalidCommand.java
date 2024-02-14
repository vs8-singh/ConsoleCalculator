package implementations;

import interfaces.Command;

public class InvalidCommand implements Command {

    @Override
    public void execute(int num1, int num2) {
        System.out.println("Invalid operand passed , please try again");
    }
}
