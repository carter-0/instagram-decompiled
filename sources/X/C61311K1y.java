package X;

/* renamed from: X.K1y  reason: case insensitive filesystem */
public final class C61311K1y extends C63040KqV {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61311K1y) {
                C61311K1y k1y = (C61311K1y) obj;
                if (!(this.A02 == k1y.A02 && this.A01 == k1y.A01 && this.A03 == k1y.A03 && this.A00 == k1y.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A00, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A01, C51965G9l.A05(this.A02))));
    }

    public C61311K1y(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = z;
        this.A01 = z2;
        this.A03 = z3;
        this.A00 = z4;
    }
}
