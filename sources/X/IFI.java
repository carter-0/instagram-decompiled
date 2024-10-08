package X;

import java.util.List;

public final class IFI implements AnonymousClass6J4 {
    public final C305586Iq A00;
    public final C59664JSj A01;
    public final C55580Hk0 A02;
    public final boolean A03;
    public final /* synthetic */ C56013HrL A04;

    public IFI(C305586Iq r1, C59664JSj jSj, C56013HrL hrL, C55580Hk0 hk0, boolean z) {
        this.A04 = hrL;
        this.A03 = z;
        this.A01 = jSj;
        this.A00 = r1;
        this.A02 = hk0;
    }

    public final IFH A00(int i, long j) {
        int i2;
        long A002;
        C59664JSj jSj = this.A01;
        int i3 = i;
        Object BK0 = jSj.BK0(i3);
        Object Aqn = jSj.Aqn(i3);
        C55580Hk0 hk0 = this.A02;
        int[] iArr = hk0.A01;
        int length = iArr.length;
        int A042 = C51965G9l.A04(j);
        int i4 = length - 1;
        int i5 = A042;
        if (A042 > i4) {
            i5 = i4;
        }
        int A022 = C51968G9o.A02(j) - A042;
        int i6 = length - i5;
        if (A022 > i6) {
            A022 = i6;
        }
        if (A022 == 1) {
            i2 = iArr[i5];
        } else {
            int[] iArr2 = hk0.A00;
            int i7 = (i5 + A022) - 1;
            i2 = (iArr2[i7] + iArr[i7]) - iArr2[i5];
        }
        if (this.A03) {
            A002 = C288985co.A01(i2);
        } else {
            A002 = C288985co.A00(i2);
        }
        List Cnw = this.A00.Cnw(i3, A002);
        C56013HrL hrL = this.A04;
        return new IFH(hrL.A0C.A09, BK0, Aqn, Cnw, i3, hrL.A04, i5, A022, hrL.A01, hrL.A00, A002, hrL.A0G);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass6JL AbW(int i, int i2, int i3, long j) {
        C59664JSj jSj = this.A01;
        Object BK0 = jSj.BK0(i);
        Object Aqn = jSj.Aqn(i);
        long j2 = j;
        List Cnw = this.A00.Cnw(i, j2);
        C56013HrL hrL = this.A04;
        boolean z = hrL.A0G;
        int i4 = hrL.A04;
        int i5 = hrL.A01;
        int i6 = hrL.A00;
        return new IFH(hrL.A0C.A09, BK0, Aqn, Cnw, i, i4, i2, i3, i5, i6, j2, z);
    }
}
