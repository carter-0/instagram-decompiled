package X;

import java.util.List;

/* renamed from: X.Gm1  reason: case insensitive filesystem */
public final class C53315Gm1 extends AnonymousClass0T0 {
    public final C59721JVf A00;
    public final N49 A01;
    public final C2606046i A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final 1ro A08;
    public final List A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53315Gm1) {
                C53315Gm1 gm1 = (C53315Gm1) obj;
                if (this.A06 != gm1.A06 || this.A05 != gm1.A05 || !0qQ.A0K(this.A03, gm1.A03) || !0qQ.A0K(this.A02, gm1.A02) || this.A07 != gm1.A07 || this.A04 != gm1.A04 || !0qQ.A0K(this.A08, gm1.A08) || !0qQ.A0K(this.A09, gm1.A09) || !0qQ.A0K(this.A00, gm1.A00) || !0qQ.A0K(this.A01, gm1.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53315Gm1(C59721JVf jVf, N49 n49, 1ro r4, C2606046i r5, String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(list, 8);
        this.A06 = z;
        this.A05 = z2;
        this.A03 = str;
        this.A02 = r5;
        this.A07 = z3;
        this.A04 = z4;
        this.A08 = r4;
        this.A09 = list;
        this.A00 = jVf;
        this.A01 = n49;
    }

    public final int hashCode() {
        int A052 = C51965G9l.A05(this.A06);
        int A092 = AnonymousClass7TF.A09(this.A07, (((AnonymousClass7TF.A09(this.A05, A052) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31);
        return ((AnonymousClass7TF.A07(this.A09, (AnonymousClass7TF.A09(this.A04, A092) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }
}
