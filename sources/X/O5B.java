package X;

public abstract class O5B {
    public static final OVA A00;
    public static final OVA A01;
    public static final OVA A02;

    static {
        OVA ova = new OVA("({[", ")}]");
        A02 = ova;
        OVA ova2 = new OVA("*~_", "*~_");
        A00 = ova2;
        A01 = new OVA(ova, ova2);
    }
}
