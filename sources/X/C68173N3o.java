package X;

/* renamed from: X.N3o  reason: case insensitive filesystem */
public final class C68173N3o extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68173N3o) {
                C68173N3o n3o = (C68173N3o) obj;
                if (!(this.A05 == n3o.A05 && this.A03 == n3o.A03 && this.A00 == n3o.A00 && this.A01 == n3o.A01 && 0qQ.A0K(this.A02, n3o.A02) && this.A04 == n3o.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = C51965G9l.A05(this.A05);
        return DbS.A06(this.A04, AnonymousClass7TF.A08(this.A02, (((AnonymousClass7TF.A09(this.A03, A052) + this.A00) * 31) + this.A01) * 31));
    }

    public C68173N3o(String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A05 = z;
        this.A03 = z2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A04 = z3;
    }

    public C68173N3o() {
        this("", 0, 0, true, false, false);
    }
}
