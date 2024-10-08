package X;

import com.facebook.common.dextricks.Constants;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: X.Sew  reason: case insensitive filesystem */
public final class C11699Sew implements C13910TlA {
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03 = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
    public final byte[] A04 = new byte[4096];
    public final long A05;
    public final C13506TbX A06;

    public final boolean A03(int i, boolean z) {
        int i2 = i;
        A01(i);
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = i3 - i4;
        while (i5 < i) {
            i5 = A00(this.A03, i4, i2, i5, z);
            if (i5 == -1) {
                return false;
            }
            i4 = this.A01;
            this.A00 = i4 + i5;
        }
        this.A01 = i4 + i;
        return true;
    }

    public final void AAu(int i) {
        A03(i, false);
    }

    public final int E2C(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2;
        A01(i2);
        int i5 = this.A00;
        int i6 = this.A01;
        int i7 = i5 - i6;
        if (i7 == 0) {
            i3 = A00(this.A03, i6, i4, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.A00 += i3;
        } else {
            i3 = Math.min(i2, i7);
        }
        System.arraycopy(this.A03, this.A01, bArr, i, i3);
        this.A01 += i3;
        return i3;
    }

    public final void E2F(byte[] bArr, int i, int i2) {
        E2G(bArr, i, i2, false);
    }

    public final boolean E6T(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.A00;
        byte[] bArr2 = bArr;
        int i5 = i;
        int i6 = i2;
        if (i4 == 0) {
            i3 = 0;
        } else {
            i3 = Math.min(i4, i2);
            System.arraycopy(this.A03, 0, bArr, i, i3);
            A02(i3);
        }
        while (i3 < i2) {
            if (i3 == -1) {
                return false;
            }
            i3 = A00(bArr2, i5, i6, i3, z);
        }
        if (i3 == -1) {
            return false;
        }
        this.A02 += (long) i3;
        return true;
    }

    public final void EI7() {
        this.A01 = 0;
    }

    public final int Evh(int i) {
        int min = Math.min(this.A00, 1);
        A02(min);
        if (min == 0) {
            min = A00(this.A04, 0, Math.min(1, 4096), 0, true);
        }
        if (min != -1) {
            this.A02 += (long) min;
        }
        return min;
    }

    public final void Evk(int i) {
        int min = Math.min(this.A00, i);
        A02(min);
        while (min < i) {
            if (min != -1) {
                min = A00(this.A04, -min, Math.min(i, 4096 + min), min, false);
            } else {
                return;
            }
        }
        if (min != -1) {
            this.A02 += (long) min;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r1 == 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            r6 = r12
            int r0 = r12.A00
            r10 = 0
            r7 = r13
            r8 = r14
            r9 = r15
            if (r0 == 0) goto L_0x0017
            int r1 = java.lang.Math.min(r0, r15)
            byte[] r0 = r12.A03
            java.lang.System.arraycopy(r0, r10, r13, r14, r1)
            r12.A02(r1)
            if (r1 != 0) goto L_0x001c
        L_0x0017:
            r11 = 1
            int r1 = r6.A00(r7, r8, r9, r10, r11)
        L_0x001c:
            r0 = -1
            if (r1 == r0) goto L_0x0025
            long r4 = r12.A02
            long r2 = (long) r1
            long r4 = r4 + r2
            r12.A02 = r4
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11699Sew.read(byte[], int, int):int");
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        E6T(bArr, i, i2, false);
    }

    private void A01(int i) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        int length = bArr.length;
        if (i2 > length) {
            this.A03 = Arrays.copyOf(bArr, Pxf.A01(length * 2, i2 + Constants.LOAD_RESULT_WITH_VDEX_ODEX, Constants.LOAD_RESULT_PGO_ATTEMPTED + i2));
        }
    }

    private void A02(int i) {
        byte[] bArr;
        int i2 = this.A00 - i;
        this.A00 = i2;
        this.A01 = 0;
        byte[] bArr2 = this.A03;
        if (i2 < bArr2.length - Constants.LOAD_RESULT_WITH_VDEX_ODEX) {
            bArr = new byte[(Constants.LOAD_RESULT_PGO_ATTEMPTED + i2)];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.A03 = bArr;
    }

    public final long BbM() {
        return this.A02 + ((long) this.A01);
    }

    public final long Bdl() {
        return this.A02;
    }

    public final long getLength() {
        return this.A05;
    }

    static {
        C11312SMg.A00("media3.extractor");
    }

    public C11699Sew(C13506TbX tbX, long j, long j2) {
        this.A06 = tbX;
        this.A02 = j;
        this.A05 = j2;
    }

    private int A00(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.A06.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public final boolean E2G(byte[] bArr, int i, int i2, boolean z) {
        if (!A03(i2, z)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        return true;
    }
}
