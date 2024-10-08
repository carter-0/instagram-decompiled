package X;

public final class N90 extends AnonymousClass0T0 implements C74269Prx {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N90) {
                N90 n90 = (N90) obj;
                if (!(this.A00 == n90.A00 && this.A01 == n90.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, C51965G9l.A05(this.A00));
    }

    public N90(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
