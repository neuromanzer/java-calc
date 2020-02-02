public class OperandFactory {

    public static Operand create(String string) {
        if(string.matches("\\d+")) {
            return new OperandArabic(string);
        } else {
            return new OperandRoman(string);
        }
    }

    public static Operand create(int value, OperandType type) {
        switch (type) {
            case ROMAN:
                return new OperandRoman(value);
            case ARABIC:
                return new OperandArabic(value);
            default:
                throw new IllegalStateException("Wrong type.");
        }
    }
}
