package X;

/* renamed from: X.N3m  reason: case insensitive filesystem */
public final class C68171N3m extends AnonymousClass0T0 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C68171N3m(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = z;
            this.A05 = z2;
            this.A03 = z3;
            this.A04 = z4;
            this.A01 = z5;
            return;
        }
        this.A03 = z;
        this.A01 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A02 = z5;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C68171N3m)) {
                return false;
            }
            C68171N3m n3m = (C68171N3m) obj;
            if (n3m.A00 != 1 || this.A02 != n3m.A02 || this.A05 != n3m.A05 || this.A03 != n3m.A03 || this.A04 != n3m.A04) {
                return false;
            }
            z = this.A01;
            z2 = n3m.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C68171N3m)) {
                return false;
            }
            C68171N3m n3m2 = (C68171N3m) obj;
            if (n3m2.A00 != 0 || this.A03 != n3m2.A03 || this.A01 != n3m2.A01 || this.A04 != n3m2.A04 || this.A05 != n3m2.A05) {
                return false;
            }
            z = this.A02;
            z2 = n3m2.A02;
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
            A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A05, C51965G9l.A05(this.A02))));
            z = this.A01;
        } else {
            A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A01, C51965G9l.A05(this.A03))));
            z = this.A02;
        }
        return DbS.A06(z, A09);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C68171N3m(int i, boolean z, boolean z2, boolean z3) {
        this(0, false, false, C51966G9m.A1Q(i & 4, z), C51966G9m.A1Q(i & 8, z2), C51966G9m.A1Q(i & 16, z3));
        this.A00 = 0;
    }
}
