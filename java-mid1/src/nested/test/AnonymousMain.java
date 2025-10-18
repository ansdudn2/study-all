package nested.test;

class AnonymousMain {
    public static void main(String[] args) {
        // 여기에서 Hello의 익명 클래스를 생성하고 hello를 호출해라.
        Hello hello = new Hello() {

            @Override
            public void hello() {
                System.out.println("hello.hello");
            }
        };
        hello.hello();
    }
}
