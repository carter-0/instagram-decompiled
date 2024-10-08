package X;

public final class S25 {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public S25(Object obj, Object obj2, Object obj3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final IllegalArgumentException A00() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Multiple entries with same key: ");
        Object obj = this.A00;
        A1A.append(obj);
        A1A.append("=");
        A1A.append(this.A01);
        Pxf.A1K(obj, " and ", "=", A1A);
        return C66582MXn.A0j(this.A02, A1A);
    }
}
