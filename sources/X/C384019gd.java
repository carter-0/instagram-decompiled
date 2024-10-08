package X;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.9gd  reason: invalid class name and case insensitive filesystem */
public final class C384019gd extends C391799th {
    public static final Logger A04 = Logger.getLogger(C384019gd.class.getName());
    public static final boolean A05 = AnonymousClass9CA.A03;
    public int A00;
    public A8T A01;
    public final int A02;
    public final byte[] A03;

    public C384019gd(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A03 = bArr;
            this.A00 = 0;
            this.A02 = i;
            return;
        }
        throw AnonymousClass7TE.A0w(String.format(Pxd.A00(355), new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)}));
    }

    public static int A00(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int A01(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static void A03(long j, byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (((int) (j >> i)) & 255);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.9rZ, java.io.IOException] */
    public static C390619rZ A02(C384019gd r3, Throwable th) {
        return new IOException(002.A0R(Pxd.A00(140), String.format(Pxd.A00(163), new Object[]{Integer.valueOf(r3.A00), Integer.valueOf(r3.A02), 1})), th);
    }

    public final void A04(byte b) {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            this.A00 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw A02(this, e);
        }
    }

    public final void A05(int i) {
        try {
            byte[] bArr = this.A03;
            int i2 = this.A00;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.A00 = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw A02(this, e);
        }
    }

    public final void A06(int i) {
        while ((i & -128) != 0) {
            try {
                byte[] bArr = this.A03;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw A02(this, e);
            }
        }
        byte[] bArr2 = this.A03;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public final void A07(int i, int i2) {
        A06(i << 3);
        if (i2 >= 0) {
            A06(i2);
        } else {
            A0A((long) i2);
        }
    }

    public final void A08(int i, String str) {
        int A002;
        A06((i << 3) | 2);
        int i2 = this.A00;
        try {
            int length = str.length();
            int A003 = A00(length * 3);
            int A004 = A00(length);
            if (A004 == A003) {
                int i3 = i2 + A004;
                this.A00 = i3;
                A002 = AnonymousClass9CG.A00.A00(str, this.A03, i3, this.A02 - i3);
                this.A00 = i2;
                A06((A002 - i2) - A004);
            } else {
                A06(AnonymousClass9CG.A00(str));
                byte[] bArr = this.A03;
                int i4 = this.A00;
                A002 = AnonymousClass9CG.A00.A00(str, bArr, i4, this.A02 - i4);
            }
            this.A00 = A002;
        } catch (AnonymousClass9GS e) {
            this.A00 = i2;
            A04.log(Level.WARNING, Pxd.A00(460), e);
            byte[] bytes = str.getBytes(AnonymousClass97S.A04);
            try {
                int length2 = bytes.length;
                A06(length2);
                A0C(bytes, 0, length2);
            } catch (IndexOutOfBoundsException e2) {
                throw new IOException(Pxd.A00(59), e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new IOException(Pxd.A00(59), e3);
        }
    }

    public final void A09(long j) {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            A03(j, bArr, 8, i2);
            int i4 = i3 + 1;
            A03(j, bArr, 16, i3);
            int i5 = i4 + 1;
            A03(j, bArr, 24, i4);
            int i6 = i5 + 1;
            A03(j, bArr, 32, i5);
            int i7 = i6 + 1;
            A03(j, bArr, 40, i6);
            int i8 = i7 + 1;
            A03(j, bArr, 48, i7);
            this.A00 = i8 + 1;
            A03(j, bArr, 56, i8);
        } catch (IndexOutOfBoundsException e) {
            throw A02(this, e);
        }
    }

    public final void A0A(long j) {
        if (!A05 || this.A02 - this.A00 < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.A03;
                    int i = this.A00;
                    this.A00 = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw A02(this, e);
                }
            }
            byte[] bArr2 = this.A03;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while (true) {
            int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
            byte[] bArr3 = this.A03;
            int i4 = this.A00;
            this.A00 = i4 + 1;
            long j2 = (long) i4;
            int i5 = (int) j;
            if (i3 == 0) {
                AnonymousClass9CA.A07(bArr3, (byte) i5, j2);
                return;
            } else {
                AnonymousClass9CA.A07(bArr3, (byte) ((i5 & 127) | 128), j2);
                j >>>= 7;
            }
        }
    }

    public final void A0B(AnonymousClass97R r4, int i) {
        A06((i << 3) | 2);
        A06(r4.A02());
        AnonymousClass97V r42 = (AnonymousClass97V) r4;
        A0C(r42.A00, r42.A05(), r42.A02());
    }

    public final void A0C(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.A03, this.A00, i2);
            this.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new IOException(002.A0R(Pxd.A00(140), String.format(Pxd.A00(163), new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A02), Integer.valueOf(i2)})), e);
        }
    }

    public C384019gd() {
    }
}
