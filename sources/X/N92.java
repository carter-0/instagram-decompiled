package X;

public final class N92 extends AnonymousClass0T0 implements C74269Prx {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N92) {
                N92 n92 = (N92) obj;
                if (!(this.A00 == n92.A00 && this.A03 == n92.A03 && this.A01 == n92.A01 && this.A02 == n92.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A09(this.A03, C51965G9l.A05(this.A00))));
    }

    public N92(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }
}
