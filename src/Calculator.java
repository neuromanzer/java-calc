import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input two integer numbers from '1' to '10' or from 'I' to 'X'(available operations: '+';, '-', '*', '/'): ");
        String string = reader.readLine();

        String[] expression = string.split("\\s+");
        if(expression.length == 3) {
            Operand x = OperandFactory.create(expression[0]);
            Operator sign = Operator.get(expression[1]);
            Operand y = OperandFactory.create(expression[2]);
            Operand result = calculate(x, sign, y);
            System.out.println("Result of the operation is: " + result);
        } else {
            System.out.println("Wrong expression.");
        }
    }

    static Operand calculate(Operand x, Operator sign, Operand y) {
        switch (sign) {
            case ADD:
                return x.add(y);
            case SUB:
                return x.sub(y);
            case MUL:
                return x.mul(y);
            case DIV:
                return x.div(y);
            case UNKNOWN:
            default:
                throw new IllegalStateException("Wrong operator!");
        }
    }
}
