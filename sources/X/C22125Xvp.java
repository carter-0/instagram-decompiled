package X;

import androidx.media3.common.util.Util;

/* renamed from: X.Xvp  reason: case insensitive filesystem */
public final class C22125Xvp implements YAO {
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final SJM A04;
    public final YBZ A05;
    public final C13900TjN A06;
    public final C21443Xav A07;

    public final void CMR(int i, long j) {
        this.A05.EKw(new C22112Xvc(this.A07, 1, (long) i, j));
        this.A06.AWO(this.A04);
    }

    public final void EHr(long j) {
        this.A02 = j;
        this.A00 = 0;
        this.A01 = 0;
    }

    public final boolean EJj(C13910TlA tlA, long j) {
        int i;
        int i2;
        long j2 = j;
        while (true) {
            if (j2 <= 0 || (i = this.A00) >= (i2 = this.A03)) {
                C21443Xav xav = this.A07;
                int i3 = xav.A01;
                int i4 = this.A00 / i3;
            } else {
                int EJe = this.A06.EJe(tlA, (int) Math.min((long) (i2 - i), j2), true);
                if (EJe == -1) {
                    j2 = 0;
                } else {
                    this.A00 += EJe;
                    j2 -= (long) EJe;
                }
            }
        }
        C21443Xav xav2 = this.A07;
        int i32 = xav2.A01;
        int i42 = this.A00 / i32;
        if (i42 > 0) {
            int i5 = i42 * i32;
            int i6 = this.A00 - i5;
            this.A06.EJm((S4h) null, 1, i5, i6, this.A02 + Util.A05(this.A01, (long) xav2.A03));
            this.A01 += (long) i42;
            this.A00 = i6;
        }
        if (j2 > 0) {
            return false;
        }
        return true;
    }

    public C22125Xvp(YBZ ybz, C13900TjN tjN, C21443Xav xav, String str, int i) {
        this.A05 = ybz;
        this.A06 = tjN;
        this.A07 = xav;
        int i2 = xav.A04;
        int i3 = (xav.A00 * i2) / 8;
        int i4 = xav.A01;
        if (i4 == i3) {
            int i5 = xav.A03;
            int i6 = i5 * i3;
            int i7 = i6 * 8;
            int max = Math.max(i3, i6 / 10);
            this.A03 = max;
            SOW sow = new SOW();
            sow.A01(str);
            sow.A03 = i7;
            sow.A0D = i7;
            sow.A0A = max;
            sow.A04 = i2;
            sow.A0G = i5;
            sow.A0C = i;
            this.A04 = new SJM(sow);
            return;
        }
        throw Pxf.A0L(002.A02(i3, i4, "Expected block size: ", "; got: "), (Throwable) null);
    }
}
