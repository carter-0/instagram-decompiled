package X;

/* renamed from: X.7iw  reason: invalid class name and case insensitive filesystem */
public final class C339027iw extends AnonymousClass0T0 implements C358998bo {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C339027iw) {
                C339027iw r5 = (C339027iw) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C339027iw(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
