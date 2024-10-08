package X;

/* renamed from: X.9cr  reason: invalid class name and case insensitive filesystem */
public final class C381959cr extends AnonymousClass0T0 implements MQQ {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381959cr) {
                C381959cr r5 = (C381959cr) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C381959cr(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
