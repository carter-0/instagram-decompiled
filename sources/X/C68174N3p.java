package X;

import java.util.LinkedHashMap;

/* renamed from: X.N3p  reason: case insensitive filesystem */
public final class C68174N3p extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public final int A06 = 1;

    public C68174N3p(C70564OBm oBm, C62320sa r3, int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A05 = oBm;
        this.A04 = r3;
    }

    public final boolean equals(Object obj) {
        C68174N3p n3p;
        if (this.A06 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C68174N3p)) {
                return false;
            }
            n3p = (C68174N3p) obj;
            if (!(n3p.A06 == 1 && this.A01 == n3p.A01 && this.A03 == n3p.A03 && 0qQ.A0K(this.A05, n3p.A05) && this.A00 == n3p.A00 && this.A02 == n3p.A02)) {
                return false;
            }
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C68174N3p)) {
                return false;
            }
            n3p = (C68174N3p) obj;
            if (!(n3p.A06 == 0 && this.A02 == n3p.A02 && this.A00 == n3p.A00 && this.A03 == n3p.A03 && this.A01 == n3p.A01 && 0qQ.A0K(this.A05, n3p.A05))) {
                return false;
            }
        }
        if (!0qQ.A0K(this.A04, n3p.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0N;
        if (this.A06 != 0) {
            A0N = ((AnonymousClass7TF.A07(this.A05, ((this.A01 * 31) + this.A03) * 31) + this.A00) * 31) + this.A02;
        } else {
            A0N = AnonymousClass7TE.A0N(this.A05, ((((((this.A02 * 31) + this.A00) * 31) + this.A03) * 31) + this.A01) * 31);
        }
        return AnonymousClass7TE.A0N(this.A04, A0N * 31);
    }

    public C68174N3p() {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        this.A06 = 1;
        this.A01 = 0;
        this.A03 = 0;
        this.A05 = A1H;
        this.A00 = 0;
        this.A02 = 0;
        this.A04 = A1H2;
    }
}
