package X;

/* renamed from: X.Gle  reason: case insensitive filesystem */
public final class C53292Gle extends AnonymousClass0T0 {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final AnonymousClass62P A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C53292Gle(Integer num, String str, AnonymousClass62P r4, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r4, 3);
        this.A02 = str;
        this.A01 = num;
        this.A03 = r4;
        this.A06 = z;
        this.A04 = z2;
        this.A00 = i;
        this.A05 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53292Gle) {
                C53292Gle gle = (C53292Gle) obj;
                if (!(0qQ.A0K(this.A02, gle.A02) && 0qQ.A0K(this.A01, gle.A01) && 0qQ.A0K(this.A03, gle.A03) && this.A06 == gle.A06 && this.A04 == gle.A04 && this.A00 == gle.A00 && this.A05 == gle.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A03, (AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0C(this.A01)) * 31));
        return DbS.A06(this.A05, (AnonymousClass7TF.A09(this.A04, A09) + this.A00) * 31);
    }
}
