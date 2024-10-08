package X;

import android.view.View;
import java.util.Arrays;

public final class GRU implements AnonymousClass5WO {
    public final 03N A00;
    public final View A01;
    public final int[] A02 = new int[2];

    public final Object DYV(AnonymousClass4D7 r6, long j, long j2) {
        03N r4 = this.A00;
        if (!r4.A04(C51971G9r.A01(j2) * -1.0f, C51972G9s.A00(j2) * -1.0f, true)) {
            j2 = 0;
        }
        if (r4.A01 != null) {
            r4.A01(0);
        }
        if (r4.A00 != null) {
            r4.A01(1);
        }
        return new GQ9(j2);
    }

    public final long DYX(long j, long j2, int i) {
        03N r9 = this.A00;
        long j3 = j2;
        float A012 = C289295dM.A01(j3);
        int i2 = 0;
        if (Math.abs(A012) >= 0.5f) {
            i2 = 1;
        }
        float A022 = C289295dM.A02(j3);
        if (Math.abs(A022) >= 0.5f) {
            i2 |= 2;
        }
        int i3 = 0;
        if (i == 1) {
            i3 = 1;
        }
        int i4 = i3 ^ 1;
        if (!r9.A05(i2, i4)) {
            return 0;
        }
        int[] iArr = this.A02;
        Arrays.fill(iArr, 0, 2, 0);
        03N.A00(r9, (int[]) null, iArr, GRV.A00(C289295dM.A01(j)), GRV.A00(C289295dM.A02(j)), GRV.A00(A012), GRV.A00(A022), i4);
        return GRV.A01(iArr, j3);
    }

    public final Object DYa(AnonymousClass4D7 r5, long j) {
        03N r3 = this.A00;
        if (!r3.A03(C51971G9r.A01(j) * -1.0f, C51972G9s.A00(j) * -1.0f)) {
            j = 0;
        }
        if (r3.A01 != null) {
            r3.A01(0);
        }
        if (r3.A00 != null) {
            r3.A01(1);
        }
        return new GQ9(j);
    }

    public final long DYf(long j, int i) {
        03N r5 = this.A00;
        float A012 = C289295dM.A01(j);
        int i2 = 0;
        if (Math.abs(A012) >= 0.5f) {
            i2 = 1;
        }
        float A022 = C289295dM.A02(j);
        if (Math.abs(A022) >= 0.5f) {
            i2 |= 2;
        }
        int i3 = 0;
        if (i == 1) {
            i3 = 1;
        }
        int i4 = i3 ^ 1;
        if (!r5.A05(i2, i4)) {
            return 0;
        }
        int[] iArr = this.A02;
        Arrays.fill(iArr, 0, 2, 0);
        r5.A07(iArr, (int[]) null, GRV.A00(A012), GRV.A00(A022), i4);
        return GRV.A01(iArr, j);
    }

    public GRU(View view) {
        this.A01 = view;
        03N r0 = new 03N(view);
        r0.A02(true);
        this.A00 = r0;
        view.setNestedScrollingEnabled(true);
    }
}
