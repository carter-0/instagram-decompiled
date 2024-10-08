package X;

/* renamed from: X.3Jg  reason: invalid class name and case insensitive filesystem */
public final class C240023Jg extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240023Jg) {
                C240023Jg r5 = (C240023Jg) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00 * 31) + this.A01) * 31;
    }

    public C240023Jg(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
