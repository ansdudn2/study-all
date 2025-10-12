package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutalbeObj obj = new MutalbeObj(10);
        obj.add(20);
        // 계산 이후 기존 값은 사라짐
        System.out.println("obj =" + obj.getValue());
    }
}
