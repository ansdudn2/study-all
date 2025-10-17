package nested;

public class ShadowingMian {

    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShadowingMian.value = " + ShadowingMian.this.value);
        }

    }

    public static void main(String[] args) {
        ShadowingMian mian = new ShadowingMian();
        Inner inner = mian.new Inner();
        inner.go();
    }
}
