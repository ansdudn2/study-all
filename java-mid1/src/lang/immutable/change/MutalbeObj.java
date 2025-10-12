package lang.immutable.change;

public class MutalbeObj {

    private int value;

    public MutalbeObj(int value) {
        this.value = value;
    }

    public void add(int addvalue) {
        this.value = value + addvalue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
