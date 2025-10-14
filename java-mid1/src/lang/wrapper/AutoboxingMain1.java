package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);
        Integer boxedValue2 = value; // 오토 박싱

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();
        int unboxedValue2 = boxedValue2; // 오토 언박싱

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
        System.out.println("boxedValue2 = " + boxedValue2);
        System.out.println("unboxedValue2 = " + unboxedValue2);
    }
}
