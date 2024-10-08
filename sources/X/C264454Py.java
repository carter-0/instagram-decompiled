package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: X.4Py  reason: invalid class name and case insensitive filesystem */
public final class C264454Py implements C264394Ps {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public long A02;
    public long A03;
    public C264444Px A04;
    public C264444Px A05;
    public C11417SSs A06;
    public boolean A07;
    public C264444Px A08;
    public C264444Px A09;
    public ByteBuffer A0A;
    public ByteBuffer A0B;
    public ShortBuffer A0C;
    public boolean A0D;

    public final C264444Px AIv(C264444Px r5) {
        if (r5.A02 == 2) {
            int i = r5.A03;
            this.A08 = r5;
            C264444Px r1 = new C264444Px(i, r5.A01, 2);
            this.A09 = r1;
            this.A07 = true;
            return r1;
        }
        throw new AnonymousClass4UJ(r5);
    }

    public final ByteBuffer BZT() {
        int i;
        C11417SSs sSs = this.A06;
        if (sSs != null && (i = sSs.A05 * sSs.A0G * 2) > 0) {
            if (this.A0A.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.A0A = order;
                this.A0C = order.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            ShortBuffer shortBuffer = this.A0C;
            int remaining = shortBuffer.remaining();
            int i2 = sSs.A0G;
            int min = Math.min(remaining / i2, sSs.A05);
            shortBuffer.put(sSs.A0B, 0, i2 * min);
            int i3 = sSs.A05 - min;
            sSs.A05 = i3;
            short[] sArr = sSs.A0B;
            System.arraycopy(sArr, min * i2, sArr, 0, i3 * i2);
            this.A03 += (long) i;
            this.A0A.limit(i);
            this.A0B = this.A0A;
        }
        ByteBuffer byteBuffer = this.A0B;
        this.A0B = C264394Ps.A00;
        return byteBuffer;
    }

    public final boolean CSi() {
        if (!this.A0D) {
            return false;
        }
        C11417SSs sSs = this.A06;
        if (sSs == null || sSs.A05 * sSs.A0G * 2 == 0) {
            return true;
        }
        return false;
    }

    public final void E5u() {
        C11417SSs sSs = this.A06;
        if (sSs != null) {
            int i = sSs.A00;
            float f = sSs.A0F;
            float f2 = sSs.A0D;
            int i2 = sSs.A05 + ((int) ((((((float) i) / (f / f2)) + ((float) sSs.A06)) / (sSs.A0E * f2)) + 0.5f));
            short[] sArr = sSs.A0A;
            int i3 = sSs.A0J * 2;
            short[] A042 = C11417SSs.A04(sSs, sArr, i, i3 + i);
            sSs.A0A = A042;
            int i4 = 0;
            while (true) {
                int i5 = sSs.A0G;
                if (i4 >= i3 * i5) {
                    break;
                }
                A042[(i5 * i) + i4] = 0;
                i4++;
            }
            sSs.A00 += i3;
            C11417SSs.A01(sSs);
            if (sSs.A05 > i2) {
                sSs.A05 = i2;
            }
            sSs.A00 = 0;
            sSs.A09 = 0;
            sSs.A06 = 0;
        }
        this.A0D = true;
    }

    public final boolean isActive() {
        int i = this.A09.A03;
        if (i == -1) {
            return false;
        }
        if (Math.abs(this.A01 - 1.0f) >= 1.0E-4f || Math.abs(this.A00 - 1.0f) >= 1.0E-4f || i != this.A08.A03) {
            return true;
        }
        return false;
    }

    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        C264444Px r0 = C264444Px.A04;
        this.A08 = r0;
        this.A09 = r0;
        this.A04 = r0;
        this.A05 = r0;
        ByteBuffer byteBuffer = C264394Ps.A00;
        this.A0A = byteBuffer;
        this.A0C = byteBuffer.asShortBuffer();
        this.A0B = byteBuffer;
        this.A07 = false;
        this.A06 = null;
        this.A02 = 0;
        this.A03 = 0;
        this.A0D = false;
    }

    public C264454Py() {
        C264444Px r0 = C264444Px.A04;
        this.A08 = r0;
        this.A09 = r0;
        this.A04 = r0;
        this.A05 = r0;
        ByteBuffer byteBuffer = C264394Ps.A00;
        this.A0A = byteBuffer;
        this.A0C = byteBuffer.asShortBuffer();
        this.A0B = byteBuffer;
    }

    public final void E5v(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C11417SSs sSs = this.A06;
            sSs.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A02 += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = sSs.A0G;
            int i2 = remaining2 / i;
            short[] A042 = C11417SSs.A04(sSs, sSs.A0A, sSs.A00, i2);
            sSs.A0A = A042;
            asShortBuffer.get(A042, sSs.A00 * i, ((i * i2) * 2) / 2);
            sSs.A00 += i2;
            C11417SSs.A01(sSs);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void flush() {
        if (isActive()) {
            C264444Px r2 = this.A08;
            this.A04 = r2;
            C264444Px r1 = this.A09;
            this.A05 = r1;
            if (this.A07) {
                this.A06 = new C11417SSs(this.A01, this.A00, r2.A03, r2.A01, r1.A03);
            } else {
                C11417SSs sSs = this.A06;
                if (sSs != null) {
                    sSs.A00 = 0;
                    sSs.A05 = 0;
                    sSs.A06 = 0;
                    sSs.A04 = 0;
                    sSs.A03 = 0;
                    sSs.A09 = 0;
                    sSs.A08 = 0;
                    sSs.A07 = 0;
                    sSs.A02 = 0;
                    sSs.A01 = 0;
                }
            }
        }
        this.A0B = C264394Ps.A00;
        this.A02 = 0;
        this.A03 = 0;
        this.A0D = false;
    }
}
