package X;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import java.io.OutputStream;

public final class R3C extends CodedOutputStream {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;
    public final OutputStream A04;

    public static void A03(R3C r3c) {
        r3c.A04.write(r3c.A03, 0, r3c.A00);
        r3c.A00 = 0;
    }

    public static void A04(R3C r3c, int i) {
        if (r3c.A02 - r3c.A00 < i) {
            A03(r3c);
        }
    }

    public final void A0K(int i) {
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        long j;
        if (CodedOutputStream.A02) {
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
                UnsafeUtil.A08(bArr2, (byte) ((i & 127) | 128), j);
                i >>>= 7;
            }
            UnsafeUtil.A08(bArr2, (byte) i, j);
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

    public final void A0L(long j) {
        byte[] bArr = this.A03;
        int A042 = Pxk.A04(bArr, Pxk.A05(bArr, this.A00, j), j);
        this.A00 = A042 + 1;
        Pxi.A0t(j, bArr, 56, A042);
        this.A01 += 8;
    }

    public final void A0M(long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        long j2;
        int i4;
        if (CodedOutputStream.A02) {
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
                UnsafeUtil.A08(bArr2, (byte) ((i4 & 127) | 128), j2);
                j >>>= 7;
            }
            UnsafeUtil.A08(bArr2, (byte) i4, j2);
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

    public final void A0N(byte[] bArr, int i, int i2) {
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
            A03(this);
            if (i2 <= i3) {
                System.arraycopy(bArr, i6, bArr2, 0, i2);
                this.A00 = i2;
            } else {
                this.A04.write(bArr, i6, i2);
            }
        }
        this.A01 += i2;
    }

    public R3C(OutputStream outputStream, int i) {
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
