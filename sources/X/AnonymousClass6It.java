package X;

/* renamed from: X.6It  reason: invalid class name */
public final class AnonymousClass6It {
    public final int A00;
    public final int A01;
    public final Object A02;

    public AnonymousClass6It(int i, int i2, Object obj) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        if (i < 0) {
            throw new IllegalArgumentException(002.A0O("startIndex should be >= 0, but was ", i));
        }
    }
}
