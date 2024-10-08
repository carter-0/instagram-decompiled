package X;

/* renamed from: X.N2o  reason: case insensitive filesystem */
public final class C68148N2o extends AnonymousClass0T0 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68148N2o) {
                C68148N2o n2o = (C68148N2o) obj;
                if (!(this.A02 == n2o.A02 && this.A01 == n2o.A01 && this.A04 == n2o.A04 && this.A03 == n2o.A03 && this.A00 == n2o.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A01, C51965G9l.A05(this.A02)))) + this.A00;
    }

    public C68148N2o(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.A02 = z;
        this.A01 = z2;
        this.A04 = z3;
        this.A03 = z4;
        this.A00 = i;
    }
}
