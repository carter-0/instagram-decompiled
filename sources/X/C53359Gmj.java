package X;

/* renamed from: X.Gmj  reason: case insensitive filesystem */
public final class C53359Gmj extends AnonymousClass0T0 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C53359Gmj(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = i;
        if (i != 0) {
            this.A05 = z;
            this.A03 = z2;
            this.A02 = z3;
            this.A01 = z4;
            this.A06 = z5;
            this.A04 = z6;
            return;
        }
        this.A02 = z;
        this.A01 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A06 = z5;
        this.A03 = z6;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53359Gmj)) {
                return false;
            }
            C53359Gmj gmj = (C53359Gmj) obj;
            if (gmj.A00 != 1 || this.A05 != gmj.A05 || this.A03 != gmj.A03 || this.A02 != gmj.A02 || this.A01 != gmj.A01 || this.A06 != gmj.A06) {
                return false;
            }
            z = this.A04;
            z2 = gmj.A04;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53359Gmj)) {
                return false;
            }
            C53359Gmj gmj2 = (C53359Gmj) obj;
            if (gmj2.A00 != 0 || this.A02 != gmj2.A02 || this.A01 != gmj2.A01 || this.A04 != gmj2.A04 || this.A05 != gmj2.A05 || this.A06 != gmj2.A06) {
                return false;
            }
            z = this.A03;
            z2 = gmj2.A03;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        boolean z;
        if (this.A00 != 0) {
            A09 = AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A03, C51965G9l.A05(this.A05)))));
            z = this.A04;
        } else {
            A09 = AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A01, C51965G9l.A05(this.A02)))));
            z = this.A03;
        }
        return DbS.A06(z, A09);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53359Gmj() {
        this(1, true, false, false, false, false, false);
        this.A00 = 1;
    }
}
