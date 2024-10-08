package X;

public final class N3A extends AnonymousClass0T0 {
    public final C61042Jvg A00;
    public final C61062Jw0 A01;
    public final QP5 A02;
    public final CharSequence A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final N62 A08;

    public N3A(C61042Jvg jvg, C61062Jw0 jw0, QP5 qp5, N62 n62, CharSequence charSequence, Integer num, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(charSequence, 2);
        this.A04 = num;
        this.A03 = charSequence;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A02 = qp5;
        this.A01 = jw0;
        this.A08 = n62;
        this.A00 = jvg;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3A) {
                N3A n3a = (N3A) obj;
                if (this.A04 != n3a.A04 || !0qQ.A0K(this.A03, n3a.A03) || this.A05 != n3a.A05 || this.A06 != n3a.A06 || this.A07 != n3a.A07 || !0qQ.A0K(this.A02, n3a.A02) || !0qQ.A0K(this.A01, n3a.A01) || !0qQ.A0K(this.A08, n3a.A08) || !0qQ.A0K(this.A00, n3a.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A04;
        int A09 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A03, C51971G9r.A0D(num, C70274O0e.A00(num)) * 31))));
        return AnonymousClass7TE.A0N(this.A00, (((AnonymousClass7TF.A07(this.A02, A09) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A08)) * 31);
    }
}
