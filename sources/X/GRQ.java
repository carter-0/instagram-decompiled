package X;

import java.util.Arrays;

public final class GRQ implements JSe {
    public final GRN A00;

    /* renamed from: A00 */
    public final GRS FMx(C287805an r19) {
        GRN grn = this.A00;
        0yC r7 = grn.A01;
        int i = r7.A01;
        01K r4 = new 01K(i + 2);
        0yC r3 = new 0yC(i);
        int[] iArr = r7.A02;
        Object[] objArr = r7.A04;
        long[] jArr = r7.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - (((i2 - length) ^ -1) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = iArr[i5];
                            GRP grp = (GRP) objArr[i5];
                            r4.A02(i6);
                            r3.A08(i6, new GRR((C287725af) ((C287795am) r19).A01.invoke(grp.A01), grp.A00));
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        if (!r7.A04(0)) {
            int i7 = r4.A00;
            if (0 <= i7) {
                r4.A03(i7 + 1);
                int[] iArr2 = r4.A01;
                int i8 = r4.A00;
                if (0 != i8) {
                    0Yw.A0T(iArr2, iArr2, 1, 0, i8);
                }
                iArr2[0] = 0;
                r4.A00++;
            } else {
                throw C51969G9p.A0p("Index ", " must be in 0..", 0, i7);
            }
        }
        int i9 = grn.A00;
        if (!r7.A04(i9)) {
            r4.A02(i9);
        }
        Arrays.sort(r4.A01, 0, r4.A00);
        return new GRS(r4, r3, C52518GVv.A02, grn.A00);
    }

    public GRQ(GRN grn) {
        this.A00 = grn;
    }
}
