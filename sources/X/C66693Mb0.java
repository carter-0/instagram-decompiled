package X;

/* renamed from: X.Mb0  reason: case insensitive filesystem */
public final class C66693Mb0 extends AnonymousClass0T0 {
    public final int A00;
    public final C69601Noj A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66693Mb0) {
                C66693Mb0 mb0 = (C66693Mb0) obj;
                if (!(0qQ.A0K(this.A01, mb0.A01) && this.A00 == mb0.A00 && this.A05 == mb0.A05 && this.A03 == mb0.A03 && this.A02 == mb0.A02 && this.A04 == mb0.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A04, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A05, (AnonymousClass7TE.A0K(this.A01) + this.A00) * 31))));
    }

    public C66693Mb0(C69601Noj noj, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = noj;
        this.A00 = i;
        this.A05 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A04 = z4;
    }
}
