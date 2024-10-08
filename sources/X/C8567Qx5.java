package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.Qx5  reason: case insensitive filesystem */
public final class C8567Qx5 extends SA4 {
    public static final Logger A04 = Pxf.A11(C8567Qx5.class);
    public static final boolean A05 = SUg.A0P();
    public C12591Syq A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public C8567Qx5() {
    }

    public /* synthetic */ C8567Qx5(RPK rpk) {
    }

    public C8567Qx5(byte[] bArr, int i) {
        this((RPK) null);
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A03 = bArr;
            this.A01 = 0;
            this.A02 = i;
            return;
        }
        throw Pxf.A0X("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Pxh.A1a(length, 0, i));
    }

    public final int A07() {
        return this.A02 - this.A01;
    }

    public final void A0Q(byte[] bArr, int i) {
        try {
            System.arraycopy(bArr, 0, this.A03, this.A01, i);
            this.A01 += i;
        } catch (IndexOutOfBoundsException e) {
            throw new C8840RCf(String.format("Pos: %d, limit: %d, len: %d", Pxg.A1a(Integer.valueOf(this.A01), this.A02, i)), e);
        }
    }

    public static int A02(C13957TmK tmK, C13845TiL tiL) {
        int A0I = ((C12586Syl) tmK).A0I(tiL);
        return A00(A0I) + A0I;
    }

    public static C8567Qx5 A05(byte[] bArr, int i) {
        return new C8567Qx5(bArr, i);
    }

    public final void A09(byte b) {
        try {
            byte[] bArr = this.A03;
            int i = this.A01;
            this.A01 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C8840RCf(Pxh.A0i(this.A02, Integer.valueOf(this.A01)), e);
        }
    }

    public final void A0A(int i) {
        try {
            byte[] bArr = this.A03;
            int A032 = Pxk.A03(bArr, this.A01, i);
            this.A01 = A032 + 1;
            Pxe.A1H(i >> 24, bArr, A032);
        } catch (IndexOutOfBoundsException e) {
            throw new C8840RCf(Pxh.A0i(this.A02, Integer.valueOf(this.A01)), e);
        }
    }

    public final void A0B(int i) {
        if (i >= 0) {
            A0C(i);
        } else {
            A0M((long) i);
        }
    }

    public final void A0C(int i) {
        while ((i & -128) != 0) {
            try {
                byte[] bArr = this.A03;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                Pxe.A1H(i | 128, bArr, i2);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C8840RCf(Pxh.A0i(this.A02, Integer.valueOf(this.A01)), e);
            }
        }
        byte[] bArr2 = this.A03;
        int i3 = this.A01;
        this.A01 = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public final void A0D(int i, int i2) {
        A0C((i << 3) | 5);
        A0A(i2);
    }

    public final void A0E(int i, int i2) {
        A0C(i << 3);
        A0B(i2);
    }

    public final void A0F(int i, int i2) {
        A0C((i << 3) | i2);
    }

    public final void A0G(int i, int i2) {
        A0C(i << 3);
        A0C(i2);
    }

    public final void A0H(int i, long j) {
        A0C((i << 3) | 1);
        A0L(j);
    }

    public final void A0I(int i, long j) {
        A0C(i << 3);
        A0M(j);
    }

    public final void A0J(int i, String str) {
        A0C((i << 3) | 2);
        A0P(str);
    }

    public final void A0K(int i, boolean z) {
        A0C(i << 3);
        A09(z ? (byte) 1 : 0);
    }

    public final void A0L(long j) {
        try {
            byte[] bArr = this.A03;
            int i = this.A01;
            int i2 = i + 1;
            Pxe.A1H((int) j, bArr, i);
            int i3 = i2 + 1;
            Pxi.A0t(j, bArr, 8, i2);
            int i4 = i3 + 1;
            Pxi.A0t(j, bArr, 16, i3);
            Pxi.A0t(j, bArr, 24, i4);
            int A042 = Pxk.A04(bArr, i4 + 1, j);
            this.A01 = A042 + 1;
            Pxi.A0t(j, bArr, 56, A042);
        } catch (IndexOutOfBoundsException e) {
            throw new C8840RCf(Pxh.A0i(this.A02, Integer.valueOf(this.A01)), e);
        }
    }

    public final void A0N(TAQ taq, int i) {
        A0C((i << 3) | 2);
        A0C(taq.A05());
        taq.A0A(this);
    }

    public final void A0O(C8997RKq rKq, String str) {
        A04.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", rKq);
        byte[] bytes = str.getBytes(SS6.A03);
        try {
            int length = bytes.length;
            A0C(length);
            A0R(bytes, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C8840RCf(e);
        }
    }

    public final void A0P(String str) {
        int A012;
        int i = this.A01;
        try {
            int length = str.length();
            int A002 = A00(length * 3);
            int A003 = A00(length);
            if (A003 == A002) {
                int i2 = i + A003;
                this.A01 = i2;
                A012 = C11412SSk.A01(str, this.A03, i2, this.A02 - i2);
                this.A01 = i;
                A0C((A012 - i) - A003);
            } else {
                A0C(C11412SSk.A00(str));
                byte[] bArr = this.A03;
                int i3 = this.A01;
                A012 = C11412SSk.A01(str, bArr, i3, this.A02 - i3);
            }
            this.A01 = A012;
        } catch (C8997RKq e) {
            this.A01 = i;
            A0O(e, str);
        } catch (IndexOutOfBoundsException e2) {
            throw new C8840RCf(e2);
        }
    }

    public static int A00(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int A01(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    public static int A03(C13957TmK tmK, C13845TiL tiL, int i) {
        int A07 = SA4.A07(i);
        return A07 + A07 + ((C12586Syl) tmK).A0I(tiL);
    }

    public static int A04(String str) {
        int i;
        String str2;
        try {
            str2 = str;
            int A002 = C11412SSk.A00(str);
            str2 = A002;
            i = A002;
        } catch (C8997RKq unused) {
            i = str2.getBytes(SS6.A03).length;
        }
        return A00(i) + i;
    }

    public final void A08() {
        if (A07() != 0) {
            throw AnonymousClass7TE.A0z("Did not write as much data as expected.");
        }
    }

    public final void A0M(long j) {
        if (!A05 || this.A02 - this.A01 < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.A03;
                    int i = this.A01;
                    this.A01 = i + 1;
                    Pxe.A1H(((int) j) | 128, bArr, i);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C8840RCf(Pxh.A0i(this.A02, Integer.valueOf(this.A01)), e);
                }
            }
            byte[] bArr2 = this.A03;
            int i2 = this.A01;
            this.A01 = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while (true) {
            int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
            int i4 = (int) j;
            byte[] bArr3 = this.A03;
            int i5 = this.A01;
            this.A01 = i5 + 1;
            long j2 = (long) i5;
            if (i3 == 0) {
                SUg.A0O(bArr3, (byte) i4, j2);
                return;
            } else {
                SUg.A0O(bArr3, (byte) ((i4 | 128) & 255), j2);
                j >>>= 7;
            }
        }
    }

    public final void A0R(byte[] bArr, int i) {
        A0Q(bArr, i);
    }
}
