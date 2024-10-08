package X;

/* renamed from: X.N2n  reason: case insensitive filesystem */
public final class C68147N2n extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C68147N2n(String str, String str2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68147N2n) {
                C68147N2n n2n = (C68147N2n) obj;
                if (!(0qQ.A0K(this.A00, n2n.A00) && 0qQ.A0K(this.A01, n2n.A01) && this.A03 == n2n.A03 && this.A04 == n2n.A04 && this.A02 == n2n.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00)))));
    }
}
