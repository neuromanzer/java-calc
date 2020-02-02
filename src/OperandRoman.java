public class OperandRoman extends Operand {
    public OperandRoman() {
        this.type = OperandType.ROMAN;
    }

    public OperandRoman(int value) {
        this();
        this.value = value;
    }

    public OperandRoman(String string) {
        this();
    }
}
