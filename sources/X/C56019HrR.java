package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.HrR  reason: case insensitive filesystem */
public final class C56019HrR {
    public final AnonymousClass62Y A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56019HrR) {
                AnonymousClass62Y r3 = this.A00;
                C286025Tq r1 = r3.A03;
                AnonymousClass62Y r2 = ((C56019HrR) obj).A00;
                if (0qQ.A0K(r1, r2.A03) && r3.A04.A0E(r2.A04) && 0qQ.A0K(r3.A08, r2.A08) && 0qQ.A0K(r3.A06, r2.A06) && r3.A07 == r2.A07 && r3.A05 == r2.A05) {
                    long j = r3.A02;
                    int A01 = Constraints.A01(j);
                    long j2 = r2.A02;
                    if (!(A01 == Constraints.A01(j2) && Constraints.A00(j) == Constraints.A00(j2))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        AnonymousClass62Y r2 = this.A00;
        int A0K = AnonymousClass7TE.A0K(r2.A03);
        AnonymousClass5Z4 r6 = r2.A04;
        AnonymousClass5ZB r3 = r6.A02;
        long j = r3.A01;
        long j2 = AnonymousClass5Z5.A01;
        int A02 = (C51967G9n.A02(j) + C51971G9r.A0E(r3.A08)) * 31;
        C291715hl r0 = r3.A06;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = 0;
        }
        int i5 = (A02 + i) * 31;
        C291725hm r02 = r3.A07;
        if (r02 != null) {
            i2 = r02.A00;
        } else {
            i2 = 0;
        }
        int A0E = (((i5 + i2) * 31) + C51971G9r.A0E(r3.A05)) * 31;
        String str = r3.A0E;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int A01 = AnonymousClass7TF.A01(r3.A02, (A0E + i3) * 31);
        C291735hn r03 = r3.A0A;
        if (r03 != null) {
            i4 = Float.floatToIntBits(r03.A00);
        } else {
            i4 = 0;
        }
        long j3 = r3.A00;
        long j4 = AnonymousClass5RW.A01;
        int A012 = AnonymousClass7TF.A01(j3, (((((A01 + i4) * 31) + C51971G9r.A0E(r3.A0D)) * 31) + C51971G9r.A0E(r3.A09)) * 31) * 31;
        int A07 = AnonymousClass7TF.A07(r2.A05, AnonymousClass7TF.A07(r2.A07, AnonymousClass7TF.A07(r2.A06, (((((AnonymousClass7TF.A07(r2.A08, (A0K + AnonymousClass7TF.A07(r6.A00, A012) + C51971G9r.A0E(r6.A01)) * 31) + Integer.MAX_VALUE) * 31) + 1231) * 31) + 1) * 31)));
        long j5 = r2.A02;
        return ((A07 + Constraints.A01(j5)) * 31) + Constraints.A00(j5);
    }

    public C56019HrR(AnonymousClass62Y r1) {
        this.A00 = r1;
    }
}
