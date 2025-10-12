package lang.immutable.address;

public class MemberV2 {

    private System name;

    private ImmutableAddress address;

    public MemberV2(System name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public System getName() {
        return name;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV2{" +
                "name=" + name +
                ", address=" + address +
                '}';
    }
}
