package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    /* 일부 경로에서 return값 없음 -> 컴파일 에러 발생
    public static boolean odd(int i){
        if (i % 2 == 1) {
            return true;
        }
    }
     */
    // 모든 경로에서 return값 보장 -> 컴파일 에러 없음
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
