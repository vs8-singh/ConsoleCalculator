import interfaces.Command;

public class CalculatorInvoker {
    Command command;

    void setCommand(Command command){
        this.command = command;
    }

    void calculate(int num1, int num2){
        command.execute(num1,num2);
    }
}
