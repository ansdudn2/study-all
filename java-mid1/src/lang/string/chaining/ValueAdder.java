package lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addvalue) {
        this.value += addvalue;
        return this;
    }

    public int getValue() {
        return value;
    }
}
