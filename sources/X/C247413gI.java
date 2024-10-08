package X;

/* renamed from: X.3gI  reason: invalid class name and case insensitive filesystem */
public final class C247413gI extends AnonymousClass0T0 implements C247433gK {
    public final C247003fc A00;
    public final 1Xj A01;
    public final boolean A02 = true;

    public C247413gI(C247003fc r3, 1Xj r4) {
        0qQ.A0B(r3, 2);
        this.A01 = r4;
        this.A00 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C247413gI) {
                C247413gI r5 = (C247413gI) obj;
                if (!(0qQ.A0K(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31 * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return hashCode + i;
    }
}
