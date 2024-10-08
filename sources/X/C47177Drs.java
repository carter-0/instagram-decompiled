package X;

import java.util.List;

/* renamed from: X.Drs  reason: case insensitive filesystem */
public final class C47177Drs extends AnonymousClass0T0 {
    public final int A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47177Drs) {
                C47177Drs drs = (C47177Drs) obj;
                if (!(0qQ.A0K(this.A01, drs.A01) && this.A02 == drs.A02 && this.A09 == drs.A09 && this.A04 == drs.A04 && this.A08 == drs.A08 && this.A03 == drs.A03 && this.A0A == drs.A0A && this.A05 == drs.A05 && this.A0B == drs.A0B && this.A07 == drs.A07 && this.A06 == drs.A06 && this.A00 == drs.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A01))))))))))) + this.A00;
    }

    public C47177Drs(List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A01 = list;
        this.A02 = z;
        this.A09 = z2;
        this.A04 = z3;
        this.A08 = z4;
        this.A03 = z5;
        this.A0A = z6;
        this.A05 = z7;
        this.A0B = z8;
        this.A07 = z9;
        this.A06 = z10;
        this.A00 = i;
    }

    public C47177Drs() {
        this(0sn.A00, 0, false, false, true, false, false, false, false, false, false, false);
    }
}
