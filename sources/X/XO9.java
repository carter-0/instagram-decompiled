package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;

public final class XO9 extends AnonymousClass46C {
    public static final AnonymousClass46D A03 = new Object();
    public final long A00 = -1;
    public final long A01 = -1;
    public final byte[] A02 = new byte[8];

    public final void A0I() {
    }

    public final void A0J() {
        A0L((byte) 0);
    }

    public final void A0K() {
    }

    public final void A0U(AnonymousClass46D r1) {
    }

    public final void A0Y(byte[] bArr) {
        int length = bArr.length;
        A0O(length);
        this.A00.A01(bArr, length);
    }

    public XO9(C2605145y r4) {
        this.A00 = r4;
    }

    private void A00(int i) {
        if (i >= 0) {
            long j = this.A01;
            if (j > 0 && ((long) i) > j) {
                throw new RuntimeException(String.format(AnonymousClass000.A00(2178), new Object[]{Integer.valueOf(i), Long.valueOf(j)}));
            }
            return;
        }
        throw new RuntimeException(002.A0O(AnonymousClass000.A00(458), i));
    }

    public final byte A06() {
        C2605245z r0 = C2605145y.A02;
        byte[] bArr = this.A02;
        this.A00.A00(bArr, 1);
        return bArr[0];
    }

    public final int A09() {
        byte[] bArr = this.A02;
        C2605245z r0 = C2605145y.A02;
        this.A00.A00(bArr, 4);
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public final long A0A() {
        byte[] bArr = this.A02;
        C2605245z r0 = C2605145y.A02;
        this.A00.A00(bArr, 8);
        return ((long) (bArr[7] & 255)) | (((long) (bArr[0] & 255)) << 56) | (((long) (bArr[1] & 255)) << 48) | (((long) (bArr[2] & 255)) << 40) | (((long) (bArr[3] & 255)) << 32) | (((long) (bArr[4] & 255)) << 24) | (((long) (bArr[5] & 255)) << 16) | (((long) (bArr[6] & 255)) << 8);
    }

    public final short A0H() {
        byte[] bArr = this.A02;
        C2605245z r0 = C2605145y.A02;
        this.A00.A00(bArr, 2);
        return (short) ((bArr[1] & 255) | ((bArr[0] & 255) << 8));
    }

    public final void A0L(byte b) {
        byte[] bArr = this.A02;
        bArr[0] = b;
        this.A00.A01(bArr, 1);
    }

    public final void A0O(int i) {
        byte[] bArr = this.A02;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.A00.A01(bArr, 4);
    }

    public final void A0P(long j) {
        byte[] bArr = this.A02;
        bArr[0] = (byte) ((int) ((j >> 56) & 255));
        bArr[1] = (byte) ((int) ((j >> 48) & 255));
        bArr[2] = (byte) ((int) ((j >> 40) & 255));
        bArr[3] = (byte) ((int) ((j >> 32) & 255));
        bArr[4] = (byte) ((int) ((j >> 24) & 255));
        bArr[5] = (byte) ((int) ((j >> 16) & 255));
        bArr[6] = (byte) ((int) ((j >> 8) & 255));
        bArr[7] = (byte) ((int) (j & 255));
        this.A00.A01(bArr, 8);
    }

    public final void A0Q(AnonymousClass46E r2) {
        A0L(r2.A00);
        A0W(r2.A03);
    }

    public final void A0R(C21961Xmq xmq) {
        A0L(xmq.A00);
        A0O(xmq.A01);
    }

    public final void A0S(C21967Xmy xmy) {
        A0L(xmy.A00);
        A0L(xmy.A01);
        A0O(xmy.A02);
    }

    public final void A0T(C21962Xmr xmr) {
        A0L(xmr.A00);
        A0O(xmr.A01);
    }

    public final void A0V(String str) {
        byte[] bytes = str.getBytes(AnonymousClass46I.A00);
        int length = bytes.length;
        A0O(length);
        this.A00.A01(bytes, length);
    }

    public final void A0W(short s) {
        byte[] bArr = this.A02;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.A00.A01(bArr, 2);
    }

    public final void A0b(byte b) {
        byte b2 = b & 15;
        if (b2 != 2 && b2 != 3 && b2 != 4 && b2 != 6 && b2 != 8 && b2 != 19) {
            switch (b2) {
                case 10:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 13:
                case 14:
                case 15:
                    return;
                default:
                    throw new RuntimeException(002.A0O(AnonymousClass000.A00(2519), (byte) b2));
            }
        }
    }

    public final double A07() {
        return Double.longBitsToDouble(A0A());
    }

    public final float A08() {
        return Float.intBitsToFloat(A09());
    }

    public final AnonymousClass46E A0B() {
        short A0H;
        byte A06 = A06();
        if (A06 == 0) {
            A0H = 0;
        } else {
            A0H = A0H();
        }
        return new AnonymousClass46E("", A06, A0H);
    }

    public final C21961Xmq A0C() {
        byte A06 = A06();
        int A09 = A09();
        A00(A09);
        A0b(A06);
        C2605245z r0 = C2605145y.A02;
        return new C21961Xmq(A09, A06);
    }

    public final C21967Xmy A0D() {
        byte A06 = A06();
        byte A062 = A06();
        int A09 = A09();
        A00(A09);
        A0b(A06);
        A0b(A062);
        C2605245z r0 = C2605145y.A02;
        return new C21967Xmy(A06, A062, A09);
    }

    public final C21962Xmr A0E() {
        byte A06 = A06();
        int A09 = A09();
        A00(A09);
        A0b(A06);
        C2605245z r0 = C2605145y.A02;
        return new C21962Xmr(A09, A06);
    }

    public final String A0G() {
        int A09 = A09();
        if (A09 >= 0) {
            long j = this.A00;
            if (j <= 0 || ((long) A09) <= j) {
                C2605245z r0 = C2605145y.A02;
                byte[] bArr = new byte[A09];
                this.A00.A00(bArr, A09);
                return new String(bArr, AnonymousClass46I.A00);
            }
            throw new RuntimeException(String.format(AnonymousClass000.A00(2501), new Object[]{Integer.valueOf(A09), Long.valueOf(j)}));
        }
        throw new RuntimeException(002.A0O(AnonymousClass000.A00(458), A09));
    }

    public final void A0M(double d) {
        A0P(Double.doubleToLongBits(d));
    }

    public final void A0N(float f) {
        A0O(Float.floatToIntBits(f));
    }

    public final boolean A0Z() {
        if (A06() != 1) {
            return false;
        }
        return true;
    }

    public final byte[] A0a() {
        int A09 = A09();
        C2605245z r0 = C2605145y.A02;
        byte[] bArr = new byte[A09];
        this.A00.A00(bArr, A09);
        return bArr;
    }

    public final AnonymousClass46D A0F(Map map) {
        return A03;
    }

    public final void A0X(boolean z) {
        A0L(z ? (byte) 1 : 0);
    }
}
