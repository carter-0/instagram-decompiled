package X;

public final class N9V extends AnonymousClass0T0 implements C74270Pry {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9V) {
                N9V n9v = (N9V) obj;
                if (!(0qQ.A0K(this.A00, n9v.A00) && 0qQ.A0K(this.A01, n9v.A01) && this.A06 == n9v.A06 && this.A05 == n9v.A05 && this.A03 == n9v.A03 && this.A04 == n9v.A04 && this.A02 == n9v.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, ((AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01)) * 31)))));
    }

    public N9V(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = str;
        this.A01 = str2;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = z3;
        this.A04 = z4;
        this.A02 = z5;
    }
}
