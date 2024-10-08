package X;

import java.io.OutputStream;

/* renamed from: X.Pyg  reason: case insensitive filesystem */
public final class C7193Pyg extends C7189Pyc {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;
    public final OutputStream A04;

    public static void A05(C7193Pyg pyg) {
        pyg.A04.write(pyg.A03, 0, pyg.A00);
        pyg.A00 = 0;
    }

    public static void A06(C7193Pyg pyg, int i) {
        if (pyg.A02 - pyg.A00 < i) {
            A05(pyg);
        }
    }

    public final void A0G(int i) {
        byte[] bArr = this.A03;
        int A032 = Pxk.A03(bArr, this.A00, i);
        this.A00 = A032 + 1;
        Pxe.A1H(i >> 24, bArr, A032);
        this.A01 += 4;
    }

    public final void A0H(int i) {
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        long j;
        if (C7189Pyc.A02) {
            long j2 = (long) this.A00;
            while (true) {
                int i4 = i & -128;
                bArr2 = this.A03;
                int i5 = this.A00;
                this.A00 = i5 + 1;
                j = (long) i5;
                if (i4 == 0) {
                    break;
                }
                C284115La.A0B(bArr2, (byte) ((i & 127) | 128), j);
                i >>>= 7;
            }
            C284115La.A0B(bArr2, (byte) i, j);
            i3 = this.A01 + ((int) (((long) this.A00) - j2));
        } else {
            while (true) {
                int i6 = i & -128;
                bArr = this.A03;
                i2 = this.A00;
                this.A00 = i2 + 1;
                if (i6 == 0) {
                    break;
                }
                bArr[i2] = (byte) ((i & 127) | 128);
                this.A01++;
                i >>>= 7;
            }
            bArr[i2] = (byte) i;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public final void A0I(long j) {
        byte[] bArr = this.A03;
        int A042 = Pxk.A04(bArr, Pxk.A05(bArr, this.A00, j), j);
        this.A00 = A042 + 1;
        Pxi.A0t(j, bArr, 56, A042);
        this.A01 += 8;
    }

    public final void A0J(long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        long j2;
        int i4;
        if (C7189Pyc.A02) {
            long j3 = (long) this.A00;
            while (true) {
                int i5 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                bArr2 = this.A03;
                int i6 = this.A00;
                this.A00 = i6 + 1;
                j2 = (long) i6;
                i4 = (int) j;
                if (i5 == 0) {
                    break;
                }
                C284115La.A0B(bArr2, (byte) ((i4 & 127) | 128), j2);
                j >>>= 7;
            }
            C284115La.A0B(bArr2, (byte) i4, j2);
            i3 = this.A01 + ((int) (((long) this.A00) - j3));
        } else {
            while (true) {
                int i7 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                bArr = this.A03;
                i = this.A00;
                this.A00 = i + 1;
                i2 = (int) j;
                if (i7 == 0) {
                    break;
                }
                bArr[i] = (byte) ((i2 & 127) | 128);
                this.A01++;
                j >>>= 7;
            }
            bArr[i] = (byte) i2;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public final void A0K(byte[] bArr, int i, int i2) {
        int i3 = this.A02;
        int i4 = this.A00;
        int i5 = i3 - i4;
        byte[] bArr2 = this.A03;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.A00 += i2;
        } else {
            System.arraycopy(bArr, i, bArr2, i4, i5);
            int i6 = i + i5;
            i2 -= i5;
            this.A00 = i3;
            this.A01 += i5;
            A05(this);
            if (i2 <= i3) {
                System.arraycopy(bArr, i6, bArr2, 0, i2);
                this.A00 = i2;
            } else {
                this.A04.write(bArr, i6, i2);
            }
        }
        this.A01 += i2;
    }

    public C7193Pyg(OutputStream outputStream, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.A03 = new byte[max];
            this.A02 = max;
            this.A04 = outputStream;
            return;
        }
        throw AnonymousClass7TE.A0w("bufferSize must be >= 0");
    }
}
