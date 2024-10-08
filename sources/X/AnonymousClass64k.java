package X;

/* renamed from: X.64k  reason: invalid class name */
public final class AnonymousClass64k implements AnonymousClass64l {
    public final float A00;
    public final AnonymousClass64m A01;

    public final float B1m(float f, float f2, float f3) {
        return 0.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x016b A[EDGE_INSN: B:87:0x016b->B:50:0x016b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long AzQ(float r31, float r32, float r33) {
        /*
            r30 = this;
            r6 = r30
            X.64m r3 = r6.A01
            double r0 = r3.A03
            double r0 = r0 * r0
            float r2 = (float) r0
            float r1 = r3.A04
            float r4 = r31 - r32
            float r0 = r6.A00
            float r4 = r4 / r0
            float r5 = r33 / r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0020
            r2 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
        L_0x001b:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            return r2
        L_0x0020:
            double r8 = (double) r2
            double r1 = (double) r1
            double r6 = (double) r5
            double r12 = (double) r4
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = r3 * r1
            double r10 = java.lang.Math.sqrt(r8)
            double r3 = r3 * r10
            double r14 = r3 * r3
            r10 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r10 = r10 * r8
            double r14 = r14 - r10
            double r8 = -r3
            X.64r r4 = X.C3026364q.A00(r14)
            double r10 = r4.A01
            double r10 = r10 + r8
            r4.A01 = r10
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r10 = r10 * r16
            r4.A01 = r10
            double r10 = r4.A00
            double r10 = r10 * r16
            r4.A00 = r10
            X.64r r0 = X.C3026364q.A00(r14)
            double r10 = r0.A01
            r14 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r10 = r10 * r14
            double r10 = r10 + r8
            double r10 = r10 * r16
            r28 = 0
            int r0 = (r12 > r28 ? 1 : (r12 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            int r0 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            r2 = 0
            goto L_0x001b
        L_0x0063:
            int r0 = (r12 > r28 ? 1 : (r12 == r28 ? 0 : -1))
            if (r0 >= 0) goto L_0x0068
            double r6 = -r6
        L_0x0068:
            double r20 = java.lang.Math.abs(r12)
            r26 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x014f
            double r4 = r4.A01
            double r2 = r4 * r20
            double r2 = r2 - r6
            double r14 = r4 - r10
            double r2 = r2 / r14
            double r20 = r20 - r2
            double r0 = r24 / r20
            double r0 = java.lang.Math.abs(r0)
            double r8 = java.lang.Math.log(r0)
            double r8 = r8 / r4
            double r0 = r24 / r2
            double r0 = java.lang.Math.abs(r0)
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r10
            boolean r6 = java.lang.Double.isInfinite(r8)
            if (r6 != 0) goto L_0x014c
            boolean r6 = java.lang.Double.isNaN(r8)
            if (r6 != 0) goto L_0x014c
            boolean r6 = java.lang.Double.isInfinite(r0)
            if (r6 != 0) goto L_0x00ae
            boolean r6 = java.lang.Double.isNaN(r0)
            if (r6 != 0) goto L_0x00ae
            double r8 = java.lang.Math.max(r8, r0)
        L_0x00ae:
            double r22 = r20 * r4
            double r0 = -r2
            double r0 = r0 * r10
            double r6 = r22 / r0
            double r12 = java.lang.Math.log(r6)
            double r0 = r10 - r4
            double r12 = r12 / r0
            boolean r0 = java.lang.Double.isNaN(r12)
            if (r0 != 0) goto L_0x00e9
            int r0 = (r12 > r28 ? 1 : (r12 == r28 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e9
            int r0 = (r12 > r28 ? 1 : (r12 == r28 ? 0 : -1))
            if (r0 <= 0) goto L_0x013f
            double r0 = r4 * r12
            double r6 = java.lang.Math.exp(r0)
            double r0 = r20 * r6
            double r6 = r10 * r12
            double r12 = java.lang.Math.exp(r6)
            double r6 = r2 * r12
            double r0 = r0 + r6
            double r6 = -r0
            int r0 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            if (r0 >= 0) goto L_0x013f
            int r0 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e9
            int r0 = (r20 > r28 ? 1 : (r20 == r28 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e9
            r8 = 0
        L_0x00e9:
            r26 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x00eb:
            double r0 = r4 * r8
            double r6 = java.lang.Math.exp(r0)
            double r6 = r6 * r22
            double r18 = r2 * r10
            double r0 = r10 * r8
            double r0 = java.lang.Math.exp(r0)
            double r0 = r0 * r18
            double r6 = r6 + r0
            double r12 = java.lang.Math.abs(r6)
            r6 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x016b
            r1 = 0
        L_0x010c:
            int r1 = r1 + 1
            double r6 = r4 * r8
            double r16 = java.lang.Math.exp(r6)
            double r14 = r16 * r20
            double r6 = r10 * r8
            double r12 = java.lang.Math.exp(r6)
            double r6 = r12 * r2
            double r14 = r14 + r6
            double r14 = r14 + r26
            double r16 = r16 * r22
            double r12 = r12 * r18
            double r16 = r16 + r12
            double r14 = r14 / r16
            double r6 = r8 - r14
            double r8 = r8 - r6
            double r12 = java.lang.Math.abs(r8)
            r8 = r6
            r6 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x016b
            r0 = 100
            if (r1 >= r0) goto L_0x016b
            goto L_0x010c
        L_0x013f:
            double r0 = r2 * r10
            double r0 = r0 * r10
            double r6 = -r0
            double r0 = r22 * r4
            double r6 = r6 / r0
            double r8 = java.lang.Math.log(r6)
            double r8 = r8 / r14
            goto L_0x00eb
        L_0x014c:
            r8 = r0
            goto L_0x00ae
        L_0x014f:
            int r0 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r0 >= 0) goto L_0x0174
            double r2 = r4.A01
            double r0 = r2 * r20
            double r6 = r6 - r0
            double r0 = r4.A00
            double r6 = r6 / r0
            double r20 = r20 * r20
            double r6 = r6 * r6
            double r20 = r20 + r6
            double r0 = java.lang.Math.sqrt(r20)
            double r24 = r24 / r0
            double r8 = java.lang.Math.log(r24)
            double r8 = r8 / r2
        L_0x016b:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 * r0
            long r2 = (long) r8
            goto L_0x001b
        L_0x0174:
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4.A01
            double r16 = r4 * r20
            double r6 = r6 - r16
            double r0 = r24 / r20
            double r0 = java.lang.Math.abs(r0)
            double r2 = java.lang.Math.log(r0)
            double r2 = r2 / r4
            double r0 = r24 / r6
            double r0 = java.lang.Math.abs(r0)
            double r11 = java.lang.Math.log(r0)
            r8 = r11
            r10 = 0
        L_0x0193:
            double r8 = r8 / r4
            double r0 = java.lang.Math.abs(r8)
            double r0 = java.lang.Math.log(r0)
            double r8 = r11 - r0
            int r10 = r10 + 1
            r0 = 6
            if (r10 < r0) goto L_0x0193
            double r8 = r8 / r4
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 != 0) goto L_0x0226
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L_0x0226
            boolean r0 = java.lang.Double.isInfinite(r8)
            if (r0 != 0) goto L_0x01c0
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 != 0) goto L_0x01c0
            double r2 = java.lang.Math.max(r2, r8)
        L_0x01c0:
            double r0 = r16 + r6
            double r8 = -r0
            double r0 = r4 * r6
            double r8 = r8 / r0
            double r0 = r4 * r8
            double r12 = java.lang.Math.exp(r0)
            double r10 = r12 * r20
            double r0 = r6 * r8
            double r0 = r0 * r12
            double r10 = r10 + r0
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 != 0) goto L_0x01ef
            int r0 = (r8 > r28 ? 1 : (r8 == r28 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ef
            int r0 = (r8 > r28 ? 1 : (r8 == r28 ? 0 : -1))
            if (r0 <= 0) goto L_0x021e
            double r8 = -r10
            int r0 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r0 >= 0) goto L_0x021e
            int r0 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ef
            int r0 = (r20 > r28 ? 1 : (r20 == r28 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ef
            r2 = 0
        L_0x01ef:
            r18 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x01f1:
            r1 = 0
        L_0x01f2:
            int r1 = r1 + 1
            double r8 = r6 * r2
            double r14 = r20 + r8
            double r12 = r4 * r2
            double r10 = java.lang.Math.exp(r12)
            double r14 = r14 * r10
            double r14 = r14 + r18
            double r8 = r24 + r12
            double r8 = r8 * r6
            double r8 = r8 + r16
            double r8 = r8 * r10
            double r14 = r14 / r8
            double r8 = r2 - r14
            double r2 = r2 - r8
            double r12 = java.lang.Math.abs(r2)
            r2 = r8
            r10 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x016b
            r0 = 100
            if (r1 >= r0) goto L_0x016b
            goto L_0x01f2
        L_0x021e:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r4
            double r2 = -r0
            double r0 = r20 / r6
            double r2 = r2 - r0
            goto L_0x01f1
        L_0x0226:
            r2 = r8
            goto L_0x01c0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass64k.AzQ(float, float, float):long");
    }

    public final /* bridge */ /* synthetic */ C3026164i FMw(C287805an r3) {
        return new AnonymousClass64n(new C21078XDr(this));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.64m, java.lang.Object] */
    public AnonymousClass64k(float f, float f2, float f3) {
        this.A00 = f3;
        ? obj = new Object();
        obj.A05 = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        obj.A03 = sqrt;
        obj.A04 = 1.0f;
        if (f >= 0.0f) {
            obj.A04 = f;
            obj.A06 = false;
            if (((float) (sqrt * sqrt)) > 0.0f) {
                obj.A03 = Math.sqrt((double) f2);
                obj.A06 = false;
                this.A01 = obj;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final float CDR(float f, float f2, float f3, long j) {
        AnonymousClass64m r0 = this.A01;
        r0.A05 = f2;
        return Float.intBitsToFloat((int) (r0.A00(f, f3, j / 1000000) >> 32));
    }

    public final float CDc(float f, float f2, float f3, long j) {
        AnonymousClass64m r0 = this.A01;
        r0.A05 = f2;
        return Float.intBitsToFloat((int) (r0.A00(f, f3, j / 1000000) & 4294967295L));
    }

    public AnonymousClass64k() {
        this(1.0f, 1500.0f, 0.01f);
    }
}
