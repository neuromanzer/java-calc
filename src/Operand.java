public abstract class Operand {
    protected int value;
    protected OperandType type;

    Operand() {
        this.type = OperandType.UNKNOWN;
    }

    Operand(int value) {
        this();
        this.value = value;
    }

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
