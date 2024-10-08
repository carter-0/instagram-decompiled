package X;

/* renamed from: X.5kI  reason: invalid class name and case insensitive filesystem */
public final class C293175kI {
    public final C294495mY A00;
    public final Exception A01;
    public final boolean A02;

    public C293175kI(C294495mY r3, Exception exc, boolean z) {
        this.A00 = r3;
        this.A02 = z;
        this.A01 = exc;
        if (!z && r3 == null) {
            throw new IllegalStateException("Must provide a query result if action failed");
        }
    }
}
