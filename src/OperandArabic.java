public class OperandArabic extends Operand {
    public OperandArabic() {
        this.type = OperandType.ARABIC;
    }

    public OperandArabic(int value) {
        this();
        this.value = value;
    }

    public OperandArabic(String string) {
        this();
        this.value = Integer.parseInt(string);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
