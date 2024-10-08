package X;

import java.util.Map;

/* renamed from: X.46C  reason: invalid class name */
public abstract class AnonymousClass46C {
    public C2605145y A00;

    public byte A06() {
        AnonymousClass46B r1 = (AnonymousClass46B) this;
        C2605245z r0 = C2605145y.A02;
        C2605145y r2 = r1.A00;
        byte[] bArr = r1.A04;
        r2.A00(bArr, 1);
        return bArr[0];
    }

    public double A07() {
        AnonymousClass46B r0 = (AnonymousClass46B) this;
        C2605145y r1 = r0.A00;
        byte[] bArr = r0.A04;
        r1.A00(bArr, 8);
        return Double.longBitsToDouble(((((long) bArr[0]) & 255) << 56) | ((((long) bArr[1]) & 255) << 48) | ((((long) bArr[2]) & 255) << 40) | ((((long) bArr[3]) & 255) << 32) | ((((long) bArr[4]) & 255) << 24) | ((((long) bArr[5]) & 255) << 16) | ((((long) bArr[6]) & 255) << 8) | (255 & ((long) bArr[7])));
    }

    public float A08() {
        AnonymousClass46B r0 = (AnonymousClass46B) this;
        C2605145y r3 = r0.A00;
        byte[] bArr = r0.A04;
        r3.A00(bArr, 4);
        return Float.intBitsToFloat((bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8));
    }

    public int A09() {
        int A01 = AnonymousClass46B.A01((AnonymousClass46B) this);
        return (-(A01 & 1)) ^ (A01 >>> 1);
    }

    public AnonymousClass46E A0B() {
        short s;
        Boolean bool;
        AnonymousClass46B r6 = (AnonymousClass46B) this;
        byte A06 = r6.A06();
        if (A06 == 0) {
            return AnonymousClass46B.A07;
        }
        short s2 = (short) ((A06 & 240) >> 4);
        if (s2 == 0) {
            s = r6.A0H();
        } else {
            s = (short) (r6.A03 + s2);
        }
        byte b = A06 & 15;
        byte b2 = (byte) b;
        AnonymousClass46E r5 = new AnonymousClass46E("", AnonymousClass46B.A00(b2), s);
        if (b == 1 || b == 2) {
            if (b2 == 1) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            r6.A02 = bool;
        }
        r6.A03 = r5.A03;
        return r5;
    }

    public C21961Xmq A0C() {
        AnonymousClass46B r4 = (AnonymousClass46B) this;
        byte A06 = r4.A06();
        int i = (A06 >> 4) & 15;
        if (i == 15) {
            i = AnonymousClass46B.A01(r4);
        }
        AnonymousClass46B.A03(r4, i);
        byte A002 = AnonymousClass46B.A00(A06);
        r4.A0b(A002);
        C2605245z r0 = C2605145y.A02;
        return new C21961Xmq(i, A002);
    }

    public C21967Xmy A0D() {
        byte A06;
        AnonymousClass46B r4 = (AnonymousClass46B) this;
        int A01 = AnonymousClass46B.A01(r4);
        AnonymousClass46B.A03(r4, A01);
        if (A01 == 0) {
            A06 = 0;
        } else {
            A06 = r4.A06();
        }
        byte A002 = AnonymousClass46B.A00((byte) (A06 >> 4));
        byte A003 = AnonymousClass46B.A00((byte) (A06 & 15));
        if (A01 > 0) {
            r4.A0b(A002);
            r4.A0b(A003);
            C2605245z r0 = C2605145y.A02;
        }
        return new C21967Xmy(A002, A003, A01);
    }

    public AnonymousClass46D A0F(Map map) {
        AnonymousClass46B r2 = (AnonymousClass46B) this;
        r2.A00.A00(r2.A03);
        r2.A03 = 0;
        return AnonymousClass46B.A08;
    }

    public String A0G() {
        AnonymousClass46B r2 = (AnonymousClass46B) this;
        int A01 = AnonymousClass46B.A01(r2);
        AnonymousClass46B.A04(r2, A01);
        if (A01 == 0) {
            return "";
        }
        C2605245z r0 = C2605145y.A02;
        if (-1 >= A01) {
            return new String((byte[]) null, 0, A01, AnonymousClass46I.A00);
        }
        byte[] bArr = new byte[A01];
        r2.A00.A00(bArr, A01);
        return new String(bArr, AnonymousClass46I.A00);
    }

    public short A0H() {
        int A01 = AnonymousClass46B.A01((AnonymousClass46B) this);
        return (short) ((-(A01 & 1)) ^ (A01 >>> 1));
    }

    public void A0I() {
        AnonymousClass46B r4 = (AnonymousClass46B) this;
        AnonymousClass46F r3 = r4.A00;
        short[] sArr = r3.A01;
        int i = r3.A00;
        r3.A00 = i - 1;
        r4.A03 = sArr[i];
    }

    public void A0J() {
        AnonymousClass46B.A02((AnonymousClass46B) this, (byte) 0);
    }

    public void A0K() {
        AnonymousClass46B r4 = (AnonymousClass46B) this;
        AnonymousClass46F r3 = r4.A00;
        short[] sArr = r3.A01;
        int i = r3.A00;
        r3.A00 = i - 1;
        r4.A03 = sArr[i];
    }

    public void A0L(byte b) {
        AnonymousClass46B.A02((AnonymousClass46B) this, b);
    }

    public void A0M(double d) {
        AnonymousClass46B r8 = (AnonymousClass46B) this;
        long doubleToLongBits = Double.doubleToLongBits(d);
        byte[] bArr = r8.A04;
        bArr[0] = (byte) ((int) ((doubleToLongBits >> 56) & 255));
        bArr[1] = (byte) ((int) ((doubleToLongBits >> 48) & 255));
        bArr[2] = (byte) ((int) ((doubleToLongBits >> 40) & 255));
        bArr[3] = (byte) ((int) ((doubleToLongBits >> 32) & 255));
        bArr[4] = (byte) ((int) ((doubleToLongBits >> 24) & 255));
        bArr[5] = (byte) ((int) ((doubleToLongBits >> 16) & 255));
        bArr[6] = (byte) ((int) ((doubleToLongBits >> 8) & 255));
        bArr[7] = (byte) ((int) (doubleToLongBits & 255));
        r8.A00.A01(bArr, 8);
    }

    public void A0N(float f) {
        AnonymousClass46B r3 = (AnonymousClass46B) this;
        int floatToIntBits = Float.floatToIntBits(f);
        byte[] bArr = r3.A04;
        bArr[0] = (byte) ((floatToIntBits >> 24) & 255);
        bArr[1] = (byte) ((floatToIntBits >> 16) & 255);
        bArr[2] = (byte) ((floatToIntBits >> 8) & 255);
        bArr[3] = (byte) (floatToIntBits & 255);
        r3.A00.A01(bArr, 4);
    }

    public void A0O(int i) {
        AnonymousClass46B.A05((AnonymousClass46B) this, (i >> 31) ^ (i << 1));
    }

    public void A0P(long j) {
        AnonymousClass46B r6 = (AnonymousClass46B) this;
        long j2 = (j >> 63) ^ (j << 1);
        int i = 0;
        while (true) {
            int i2 = ((-128 & j2) > 0 ? 1 : ((-128 & j2) == 0 ? 0 : -1));
            byte[] bArr = r6.A04;
            int i3 = i + 1;
            if (i2 == 0) {
                bArr[i] = (byte) ((int) j2);
                r6.A00.A01(bArr, i3);
                return;
            }
            bArr[i] = (byte) ((int) ((127 & j2) | 128));
            j2 >>>= 7;
            i = i3;
        }
    }

    public void A0Q(AnonymousClass46E r6) {
        int i;
        AnonymousClass46B r4 = (AnonymousClass46B) this;
        byte b = r6.A00;
        if (b == 2) {
            r4.A01 = r6;
            return;
        }
        byte b2 = AnonymousClass46B.A09[b];
        short s = r6.A03;
        short s2 = r4.A03;
        if (s <= s2 || (i = s - s2) > 15) {
            AnonymousClass46B.A02(r4, b2);
            r4.A0W(s);
        } else {
            AnonymousClass46B.A02(r4, (byte) (b2 | (i << 4)));
        }
        r4.A03 = s;
    }

    public void A0R(C21961Xmq xmq) {
        AnonymousClass46B r3 = (AnonymousClass46B) this;
        byte b = xmq.A00;
        int i = xmq.A01;
        if (i <= 14) {
            AnonymousClass46B.A02(r3, (byte) (AnonymousClass46B.A09[b] | (i << 4)));
            return;
        }
        AnonymousClass46B.A02(r3, (byte) (AnonymousClass46B.A09[b] | 240));
        AnonymousClass46B.A05(r3, i);
    }

    public void A0S(C21967Xmy xmy) {
        byte b;
        AnonymousClass46B r3 = (AnonymousClass46B) this;
        int i = xmy.A02;
        if (i == 0) {
            b = 0;
        } else {
            AnonymousClass46B.A05(r3, i);
            byte b2 = xmy.A00;
            byte[] bArr = AnonymousClass46B.A09;
            b = bArr[xmy.A01] | (bArr[b2] << 4);
        }
        AnonymousClass46B.A02(r3, (byte) b);
    }

    public void A0T(C21962Xmr xmr) {
        AnonymousClass46B r3 = (AnonymousClass46B) this;
        byte b = xmr.A00;
        int i = xmr.A01;
        if (i <= 14) {
            AnonymousClass46B.A02(r3, (byte) (AnonymousClass46B.A09[b] | (i << 4)));
            return;
        }
        AnonymousClass46B.A02(r3, (byte) (AnonymousClass46B.A09[b] | 240));
        AnonymousClass46B.A05(r3, i);
    }

    public void A0U(AnonymousClass46D r4) {
        AnonymousClass46B r2 = (AnonymousClass46B) this;
        r2.A00.A00(r2.A03);
        r2.A03 = 0;
    }

    public void A0V(String str) {
        AnonymousClass46B r3 = (AnonymousClass46B) this;
        byte[] bytes = str.getBytes(AnonymousClass46I.A00);
        int length = bytes.length;
        AnonymousClass46B.A05(r3, length);
        r3.A00.A01(bytes, length);
    }

    public void A0W(short s) {
        AnonymousClass46B.A05((AnonymousClass46B) this, (s >> 31) ^ (s << 1));
    }

    public void A0X(boolean z) {
        int i;
        AnonymousClass46B r4 = (AnonymousClass46B) this;
        AnonymousClass46E r0 = r4.A01;
        byte b = 1;
        if (r0 != null) {
            if (!z) {
                b = 2;
            }
            short s = r0.A03;
            short s2 = r4.A03;
            if (s <= s2 || (i = s - s2) > 15) {
                AnonymousClass46B.A02(r4, b);
                r4.A0W(s);
            } else {
                AnonymousClass46B.A02(r4, (byte) (b | (i << 4)));
            }
            r4.A03 = s;
            r4.A01 = null;
            return;
        }
        if (!z) {
            b = 2;
        }
        AnonymousClass46B.A02(r4, b);
    }

    public void A0Y(byte[] bArr) {
        AnonymousClass46B r0 = (AnonymousClass46B) this;
        int length = bArr.length;
        AnonymousClass46B.A05(r0, length);
        r0.A00.A01(bArr, length);
    }

    public boolean A0Z() {
        AnonymousClass46B r2 = (AnonymousClass46B) this;
        Boolean bool = r2.A02;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            r2.A02 = null;
            return booleanValue;
        } else if (r2.A06() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public byte[] A0a() {
        AnonymousClass46B r3 = (AnonymousClass46B) this;
        int A01 = AnonymousClass46B.A01(r3);
        AnonymousClass46B.A04(r3, A01);
        if (A01 == 0) {
            return new byte[0];
        }
        C2605245z r0 = C2605145y.A02;
        byte[] bArr = new byte[A01];
        r3.A00.A00(bArr, A01);
        return bArr;
    }

    public long A0A() {
        C2605245z r0 = C2605145y.A02;
        int i = 0;
        long j = 0;
        while (true) {
            byte A06 = A06();
            j |= ((long) (A06 & Byte.MAX_VALUE)) << i;
            if ((A06 & 128) != 128) {
                return (-(j & 1)) ^ (j >>> 1);
            }
            i += 7;
        }
    }

    public C21962Xmr A0E() {
        C21961Xmq A0C = A0C();
        return new C21962Xmr(A0C.A01, A0C.A00);
    }
}
