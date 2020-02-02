public abstract class Operand {
    int value;
    OperandType type;

    Operand add(Operand other) {
        return OperandFactory.create(value + other.value, type);
    }

    Operand sub(Operand other) {
        return OperandFactory.create(value - other.value, type);
    }

    Operand mul(Operand other) {
        return OperandFactory.create(value * other.value, type);
    }

    Operand div(Operand other) {
        return OperandFactory.create(value / other.value, type);
    }
}
