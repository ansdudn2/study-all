package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("parent.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("parent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("parent.privateMethod");
    }
}
