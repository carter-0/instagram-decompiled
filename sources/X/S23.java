package X;

public final class S23 {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public S23(Object obj, Object obj2, Object obj3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final IllegalArgumentException A00() {
        Object obj = this.A02;
        Object obj2 = this.A01;
        Object obj3 = this.A00;
        return AnonymousClass7TE.A0w(002.A16("Multiple entries with same key: ", String.valueOf(obj3), "=", String.valueOf(obj2), " and ", String.valueOf(obj3), "=", String.valueOf(obj)));
    }
}
