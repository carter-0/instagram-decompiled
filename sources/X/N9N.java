package X;

public final class N9N extends AnonymousClass0T0 implements C74269Prx {
    public final Boolean A00;
    public final Long A01;
    public final Long A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public N9N() {
        this((Boolean) null, (Long) null, (Long) null, (String) null, false, false, false, true, true, false, true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9N) {
                N9N n9n = (N9N) obj;
                if (!(this.A04 == n9n.A04 && this.A06 == n9n.A06 && this.A05 == n9n.A05 && this.A07 == n9n.A07 && 0qQ.A0K(this.A01, n9n.A01) && 0qQ.A0K(this.A02, n9n.A02) && 0qQ.A0K(this.A03, n9n.A03) && this.A0A == n9n.A0A && 0qQ.A0K(this.A00, n9n.A00) && this.A09 == n9n.A09 && this.A08 == n9n.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, C51965G9l.A05(this.A04)));
        boolean z = this.A0A;
        return DbS.A06(this.A08, AnonymousClass7TF.A09(this.A09, (AnonymousClass7TF.A09(z, (((((AnonymousClass7TF.A09(this.A07, A092) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31));
    }

    public N9N(Boolean bool, Long l, Long l2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A04 = z;
        this.A06 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A01 = l;
        this.A02 = l2;
        this.A03 = str;
        this.A0A = z5;
        this.A00 = bool;
        this.A09 = z6;
        this.A08 = z7;
    }
}
