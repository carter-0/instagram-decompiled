package X;

import com.google.android.exoplayer2.util.Util;

public final class SwF implements C284495Ms {
    public float A00 = 1.0f;
    public float A01 = 1.03f;
    public long A02 = -9223372036854775807L;
    public long A03 = -9223372036854775807L;
    public long A04 = -9223372036854775807L;
    public long A05 = -9223372036854775807L;
    public long A06 = -9223372036854775807L;
    public float A07 = 0.97f;
    public long A08 = -9223372036854775807L;
    public long A09 = -9223372036854775807L;
    public long A0A = -9223372036854775807L;
    public long A0B = -9223372036854775807L;

    private void A00() {
        long j = this.A09;
        if (j != -9223372036854775807L) {
            long j2 = this.A0B;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.A0A;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.A04;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.A03 != j) {
            this.A03 = j;
            this.A02 = j;
            this.A06 = -9223372036854775807L;
            this.A05 = -9223372036854775807L;
            this.A08 = -9223372036854775807L;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float AZo(long r14, long r16) {
        /*
            r13 = this;
            long r1 = r13.A09
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x000e
            return r8
        L_0x000e:
            long r0 = r14 - r16
            long r4 = r13.A06
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0030
            r13.A06 = r0
            r4 = r0
            r2 = 0
        L_0x001b:
            r13.A05 = r2
            long r0 = r13.A08
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x004f
            long r9 = X.Pxe.A0C(r0)
            r6 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x004f
            float r0 = r13.A00
            return r0
        L_0x0030:
            r10 = 1065336439(0x3f7fbe77, float:0.999)
            float r3 = (float) r4
            float r3 = r3 * r10
            float r9 = r8 - r10
            float r2 = (float) r0
            float r2 = r2 * r9
            float r3 = r3 + r2
            long r2 = (long) r3
            long r4 = java.lang.Math.max(r0, r2)
            r13.A06 = r4
            long r0 = r0 - r4
            long r1 = java.lang.Math.abs(r0)
            long r6 = r13.A05
            float r3 = (float) r6
            float r3 = r3 * r10
            float r0 = (float) r1
            float r9 = r9 * r0
            float r3 = r3 + r9
            long r2 = (long) r3
            goto L_0x001b
        L_0x004f:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r13.A08 = r0
            r0 = 3
            long r2 = r2 * r0
            long r4 = r4 + r2
            long r2 = r13.A02
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x008c
            float r0 = r13.A00
            float r0 = r0 - r8
            r7 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 * r7
            long r0 = (long) r0
            float r6 = r13.A01
            float r6 = r6 - r8
            float r6 = r6 * r7
            long r6 = (long) r6
            long r0 = r0 + r6
            r7 = 3
            long[] r6 = new long[r7]
            r9 = 0
            r6[r9] = r4
            r9 = 1
            long r4 = r13.A03
            r6[r9] = r4
            r4 = 2
            long r2 = r2 - r0
            r6[r4] = r2
            r0 = 0
            r5 = 1
            r3 = r6[r0]
        L_0x0080:
            r1 = r6[r5]
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r3 = r1
        L_0x0087:
            int r5 = r5 + 1
            if (r5 >= r7) goto L_0x00af
            goto L_0x0080
        L_0x008c:
            r1 = 0
            float r0 = r13.A00
            float r0 = r0 - r8
            float r1 = java.lang.Math.max(r1, r0)
            r0 = 869711765(0x33d6bf95, float:1.0E-7)
            float r1 = r1 / r0
            long r6 = (long) r1
            long r0 = r14 - r6
            long r0 = java.lang.Math.min(r0, r4)
            long r1 = java.lang.Math.max(r2, r0)
            r13.A02 = r1
            long r3 = r13.A04
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00b2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
        L_0x00af:
            r13.A02 = r3
            r1 = r3
        L_0x00b2:
            long r14 = r14 - r1
            long r3 = java.lang.Math.abs(r14)
            r1 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c2
            r13.A00 = r8
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L_0x00c2:
            r2 = 869711765(0x33d6bf95, float:1.0E-7)
            float r0 = (float) r14
            float r2 = r2 * r0
            float r2 = r2 + r8
            float r1 = r13.A07
            float r0 = r13.A01
            float r0 = X.Pxi.A01(r2, r0, r1)
            r13.A00 = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SwF.AZo(long, long):float");
    }

    public final long C4N() {
        return this.A02;
    }

    public final void CsE() {
        long j = this.A02;
        if (j != -9223372036854775807L) {
            long j2 = j + 500000;
            this.A02 = j2;
            long j3 = this.A04;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.A02 = j3;
            }
            this.A08 = -9223372036854775807L;
        }
    }

    public final void EcP(AnonymousClass4RO r5) {
        this.A09 = Util.A07(r5.A04);
        this.A0A = Util.A07(r5.A03);
        this.A04 = Util.A07(r5.A02);
        float f = r5.A01;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.A07 = f;
        float f2 = r5.A00;
        float f3 = 1.03f;
        if (f2 != -3.4028235E38f) {
            f3 = f2;
        }
        this.A01 = f3;
        if (f == 1.0f && f3 == 1.0f) {
            this.A09 = -9223372036854775807L;
        }
        A00();
    }

    public final void Enw(long j) {
        this.A0B = j;
        A00();
    }
}
