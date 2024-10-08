package X;

/* renamed from: X.7of  reason: invalid class name and case insensitive filesystem */
public final class C342477of extends AnonymousClass0T0 implements C342447oc {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public C342477of(String str, int i, boolean z) {
        0qQ.A0B(str, 3);
        this.A00 = i;
        this.A02 = z;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C342477of) {
                C342477of r5 = (C342477of) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && 0qQ.A0K(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        int i2 = 1237;
        if (this.A02) {
            i2 = 1231;
        }
        return ((i + i2) * 31) + this.A01.hashCode();
    }
}
