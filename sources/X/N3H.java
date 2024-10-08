package X;

public final class N3H extends AnonymousClass0T0 {
    public final C266444Yx A00;
    public final C69301Nj2 A01;
    public final C69302Nj3 A02;
    public final C69294Niu A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3H) {
                N3H n3h = (N3H) obj;
                if (!(this.A02 == n3h.A02 && this.A03 == n3h.A03 && this.A09 == n3h.A09 && this.A01 == n3h.A01 && this.A0C == n3h.A0C && this.A04 == n3h.A04 && this.A05 == n3h.A05 && this.A08 == n3h.A08 && this.A07 == n3h.A07 && this.A06 == n3h.A06 && 0qQ.A0K(this.A00, n3h.A00) && this.A0A == n3h.A0A && this.A0B == n3h.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A02)))))))));
        return DbS.A06(this.A0B, AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TF.A09(this.A06, A092) + AnonymousClass7TG.A0C(this.A00)) * 31));
    }

    public N3H(C266444Yx r1, C69301Nj2 nj2, C69302Nj3 nj3, C69294Niu niu, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        C51974G9v.A1L(nj3, niu, nj2);
        this.A02 = nj3;
        this.A03 = niu;
        this.A09 = z;
        this.A01 = nj2;
        this.A0C = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A08 = z5;
        this.A07 = z6;
        this.A06 = z7;
        this.A00 = r1;
        this.A0A = z8;
        this.A0B = z9;
    }
}
