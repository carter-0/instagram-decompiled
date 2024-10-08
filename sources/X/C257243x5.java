package X;

/* renamed from: X.3x5  reason: invalid class name and case insensitive filesystem */
public final class C257243x5 {
    public static final C257243x5 A02 = new C257243x5();
    public byte A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || !(obj instanceof C257243x5)) {
                return false;
            }
            C257243x5 r4 = (C257243x5) obj;
            if (!(this.A00 == r4.A00 && this.A01 == r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }

    public C257243x5(byte b, boolean z) {
        this.A00 = b;
        this.A01 = z;
    }

    public C257243x5() {
        this.A00 = 3;
        this.A01 = true;
    }
}
