package X;

public final class N94 extends AnonymousClass0T0 implements C74269Prx {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N94) {
                N94 n94 = (N94) obj;
                if (!(0qQ.A0K(this.A00, n94.A00) && this.A01 == n94.A01 && this.A04 == n94.A04 && this.A02 == n94.A02 && this.A03 == n94.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A01, AnonymousClass7TG.A0E(this.A00) * 31 * 31))));
    }

    public N94(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = str;
        this.A01 = z;
        this.A04 = z2;
        this.A02 = z3;
        this.A03 = z4;
    }
}
