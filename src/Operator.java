public enum Operator {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/"),
    UNKNOWN("");

    private final String operator;

    Operator(String string) {
        this.operator = string;
    }

    static Operator get(String string) {
        for(Operator o : Operator.values()) {
            if(o.operator.equals(string)) {
                return o;
            }
        }
        return Operator.UNKNOWN;
    }
}
