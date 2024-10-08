package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: X.S5q  reason: case insensitive filesystem */
public final class C11019S5q {
    public static final ByteBuffer A02 = Pxg.A13(0);
    public C11421SSx A00;
    public ByteBuffer A01;

    public final ByteBuffer A00() {
        C11421SSx sSx = this.A00;
        int i = sSx.A06 * sSx.A0G * 2;
        if (i <= 0) {
            return A02;
        }
        if (this.A01.capacity() < i) {
            this.A01 = Pxg.A13(i);
        } else {
            this.A01.clear();
        }
        sSx.A05(this.A01.asShortBuffer());
        this.A01.limit(i);
        return this.A01;
    }

    public final void A01() {
        C11421SSx sSx = this.A00;
        int i = sSx.A01;
        float f = sSx.A0F;
        float f2 = sSx.A00;
        int i2 = sSx.A06 + ((int) ((((((float) i) / (f / f2)) + ((float) sSx.A07)) / (sSx.A0E * f2)) + 0.5f));
        short[] sArr = sSx.A0B;
        int i3 = sSx.A0J * 2;
        short[] A04 = C11421SSx.A04(sSx, sArr, i, i3 + i);
        sSx.A0B = A04;
        int i4 = 0;
        while (true) {
            int i5 = sSx.A0G;
            if (i4 >= i3 * i5) {
                break;
            }
            A04[(i5 * i) + i4] = 0;
            i4++;
        }
        sSx.A01 += i3;
        C11421SSx.A01(sSx);
        if (sSx.A06 > i2) {
            sSx.A06 = i2;
        }
        sSx.A01 = 0;
        sSx.A0A = 0;
        sSx.A07 = 0;
    }

    public final void A02(ByteBuffer byteBuffer) {
        C11421SSx sSx = this.A00;
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = asShortBuffer.remaining();
        int i = sSx.A0G;
        int i2 = remaining / i;
        short[] A04 = C11421SSx.A04(sSx, sSx.A0B, sSx.A01, i2);
        sSx.A0B = A04;
        asShortBuffer.get(A04, sSx.A01 * i, ((i * i2) * 2) / 2);
        sSx.A01 += i2;
        C11421SSx.A01(sSx);
    }
}
