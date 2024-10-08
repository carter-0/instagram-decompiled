package X;

public final class DdH extends AnonymousClass0T0 {
    public final int A00;
    public final AnonymousClass62P A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public DdH(AnonymousClass62P r2, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A03 = z;
        this.A00 = i;
        this.A02 = z2;
        this.A04 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DdH) {
                DdH ddH = (DdH) obj;
                if (!(0qQ.A0K(this.A01, ddH.A01) && this.A03 == ddH.A03 && this.A00 == ddH.A00 && this.A02 == ddH.A02 && this.A04 == ddH.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        return DbS.A06(this.A04, AnonymousClass7TF.A09(this.A02, (AnonymousClass7TF.A09(this.A03, A0K) + this.A00) * 31));
    }

    public DdH() {
        this(AnonymousClass62M.A01, Integer.MAX_VALUE, false, false, false);
    }
}
