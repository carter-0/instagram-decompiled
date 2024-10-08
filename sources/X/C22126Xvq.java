package X;

import androidx.media3.common.util.Util;

/* renamed from: X.Xvq  reason: case insensitive filesystem */
public final class C22126Xvq implements YAO {
    public static final int[] A0C = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] A0D = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final int A04;
    public final C21443Xav A05;
    public final int A06;
    public final SJM A07;
    public final C11389SRd A08;
    public final YBZ A09;
    public final C13900TjN A0A;
    public final byte[] A0B;

    public final void EHr(long j) {
        this.A00 = 0;
        this.A03 = j;
        this.A01 = 0;
        this.A02 = 0;
    }

    private void A00(int i) {
        long j = this.A03;
        long j2 = this.A02;
        C21443Xav xav = this.A05;
        long A052 = j + Util.A05(j2, (long) xav.A03);
        int i2 = i * 2 * xav.A04;
        this.A0A.EJm((S4h) null, 1, i2, this.A01 - i2, A052);
        this.A02 += (long) i;
        this.A01 -= i2;
    }

    public final void CMR(int i, long j) {
        this.A09.EKw(new C22112Xvc(this.A05, this.A04, (long) i, j));
        this.A0A.AWO(this.A07);
    }

    public final boolean EJj(C13910TlA tlA, long j) {
        int i;
        int i2 = this.A06;
        int i3 = this.A01;
        C21443Xav xav = this.A05;
        int i4 = xav.A04;
        int i5 = i4 * 2;
        int i6 = this.A04;
        int i7 = xav.A01;
        int i8 = ((((i2 - (i3 / i5)) + i6) - 1) / i6) * i7;
        long j2 = j;
        boolean z = false;
        if (j != 0) {
            while (true) {
                int i9 = this.A00;
                if (i9 < i8) {
                    int read = tlA.read(this.A0B, i9, (int) Math.min((long) (i8 - i9), j2));
                    if (read == -1) {
                        break;
                    }
                    this.A00 += read;
                } else {
                    break;
                }
            }
        }
        z = true;
        int i10 = this.A00 / i7;
        if (i10 > 0) {
            byte[] bArr = this.A0B;
            C11389SRd sRd = this.A08;
            int i11 = 0;
            do {
                for (int i12 = 0; i12 < i4; i12++) {
                    byte[] bArr2 = sRd.A02;
                    int i13 = (i11 * i7) + (i12 * 4);
                    int i14 = (i4 * 4) + i13;
                    int i15 = (i7 / i4) - 4;
                    int i16 = (short) (((bArr[i13 + 1] & 255) << 8) | (bArr[i13] & 255));
                    int min = Math.min(bArr[i13 + 2] & 255, 88);
                    int[] iArr = A0D;
                    int i17 = iArr[min];
                    int i18 = ((i11 * i6 * i4) + i12) * 2;
                    bArr2[i18] = (byte) (i16 & 255);
                    bArr2[i18 + 1] = (byte) (i16 >> 8);
                    for (int i19 = 0; i19 < i15 * 2; i19++) {
                        byte b = bArr[((i19 / 8) * i4 * 4) + i14 + ((i19 / 2) % 4)] & 255;
                        int i20 = b >> 4;
                        if (i19 % 2 == 0) {
                            i20 = b & 15;
                        }
                        int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                        if ((i20 & 8) != 0) {
                            i21 = -i21;
                        }
                        i16 = Pxf.A01(i16 + i21, 32767, -32768);
                        i18 += i5;
                        bArr2[i18] = (byte) (i16 & 255);
                        bArr2[i18 + 1] = (byte) (i16 >> 8);
                        min = Pxf.A01(min + A0C[i20], 88, 0);
                        i17 = iArr[min];
                    }
                }
                i11++;
            } while (i11 < i10);
            sRd.A0O(0);
            sRd.A0N(i6 * i10 * 2 * i4);
            this.A00 -= i10 * i7;
            int i22 = sRd.A00;
            this.A0A.EJf(sRd, i22);
            int i23 = this.A01 + i22;
            this.A01 = i23;
            if (i23 / i5 >= i2) {
                A00(i2);
            }
        }
        if (z && (i = this.A01 / i5) > 0) {
            A00(i);
        }
        return z;
    }

    public C22126Xvq(YBZ ybz, C13900TjN tjN, C21443Xav xav) {
        this.A09 = ybz;
        this.A0A = tjN;
        this.A05 = xav;
        int i = xav.A03;
        int max = Math.max(1, i / 10);
        this.A06 = max;
        C11389SRd sRd = new C11389SRd(xav.A05);
        sRd.A03();
        int A032 = sRd.A03();
        this.A04 = A032;
        int i2 = xav.A04;
        int i3 = xav.A01;
        int i4 = (((i3 - (i2 * 4)) * 8) / (xav.A00 * i2)) + 1;
        if (A032 == i4) {
            int i5 = ((max + A032) - 1) / A032;
            this.A0B = new byte[(i3 * i5)];
            this.A08 = Pxe.A0P(i5 * A032 * 2 * i2);
            int i6 = ((i * i3) * 8) / A032;
            SOW sow = new SOW();
            sow.A01("audio/raw");
            sow.A03 = i6;
            sow.A0D = i6;
            sow.A0A = max * 2 * i2;
            sow.A04 = i2;
            sow.A0G = i;
            sow.A0C = 2;
            this.A07 = new SJM(sow);
            return;
        }
        throw new XQX(002.A02(i4, A032, "Expected frames per block: ", "; got: "), (Throwable) null, 1, true);
    }
}
