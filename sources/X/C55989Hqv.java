package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Hqv  reason: case insensitive filesystem */
public final class C55989Hqv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final C56155Hti A05;

    public final C56503HzZ A00(01J r24, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        int i5 = i3 + i4;
        01J r4 = r24;
        if (r24 != null) {
            Integer num = this.A05.A04;
            if (i2 < this.A03) {
                int i6 = (int) (j & 4294967295L);
                long j2 = r4.A00;
                int i7 = (int) (j2 & 4294967295L);
                if (i6 - i7 >= 0) {
                    int i8 = i;
                    if (i == 0 || (i8 < this.A02 && ((int) (j >> 32)) - ((int) (j2 >> 32)) >= 0)) {
                        num.intValue();
                        return new C56503HzZ(false, false);
                    } else if (!z2) {
                        return new C56503HzZ(true, A00(new 01J(01J.A00(C51965G9l.A04(j2) - this.A01, i7)), 0, i2 + 1, i5, 0, 01J.A00(Constraints.A01(this.A04), (i6 - this.A00) - i4), z, true).A00);
                    }
                }
            }
        }
        return new C56503HzZ(true, true);
    }

    public C55989Hqv(C56155Hti hti, int i, int i2, int i3, int i4, long j) {
        this.A02 = i;
        this.A05 = hti;
        this.A04 = j;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }
}
