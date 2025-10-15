package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("classs BASIC = " + Grade.BASIC.getClass());
        System.out.println("classs GOLD = " + Grade.GOLD.getClass());
        System.out.println("classs DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + Grade.BASIC);
        System.out.println("ref GOLD = " + Grade.GOLD);
        System.out.println("ref DIAMOND = " + Grade.DIAMOND);
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
