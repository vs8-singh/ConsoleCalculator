package services;

import blueprints.Command;

public class SubtractCommand implements Command {
    @Override
    public void execute(int num1, int num2) {
        System.out.println("Answer : " + (num1 - num2));
    }
}