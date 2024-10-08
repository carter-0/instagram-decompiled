package X;

import java.util.Set;

/* renamed from: X.Gm8  reason: case insensitive filesystem */
public final class C53322Gm8 extends AnonymousClass0T0 {
    public final int A00;
    public final C55441Hhl A01;
    public final 02m A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Set A06;
    public final Set A07;
    public final Set A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C53322Gm8(C55441Hhl hhl, 02m r3, Integer num, Integer num2, Integer num3, Set set, Set set2, Set set3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C51973G9u.A0r(3, set, set2, set3);
        this.A09 = z;
        this.A02 = r3;
        this.A06 = set;
        this.A08 = set2;
        this.A07 = set3;
        this.A0C = z2;
        this.A00 = i;
        this.A0B = z3;
        this.A0A = z4;
        this.A01 = hhl;
        this.A04 = num;
        this.A03 = num2;
        this.A05 = num3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53322Gm8) {
                C53322Gm8 gm8 = (C53322Gm8) obj;
                if (this.A09 != gm8.A09 || !0qQ.A0K(this.A02, gm8.A02) || !0qQ.A0K(this.A06, gm8.A06) || !0qQ.A0K(this.A08, gm8.A08) || !0qQ.A0K(this.A07, gm8.A07) || this.A0C != gm8.A0C || this.A00 != gm8.A00 || this.A0B != gm8.A0B || this.A0A != gm8.A0A || !0qQ.A0K(this.A01, gm8.A01) || !0qQ.A0K(this.A04, gm8.A04) || !0qQ.A0K(this.A03, gm8.A03) || !0qQ.A0K(this.A05, gm8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A06, (C51965G9l.A05(this.A09) + AnonymousClass7TG.A0C(this.A02)) * 31)));
        return ((((((AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A0B, (AnonymousClass7TF.A09(this.A0C, A072) + this.A00) * 31)) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }
}
