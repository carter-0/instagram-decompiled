package X;

/* renamed from: X.XDs  reason: case insensitive filesystem */
public final class C21079XDs implements AnonymousClass64l {
    public final long A00;
    public final long A01;
    public final int A02;
    public final int A03;
    public final JNL A04;

    public final /* synthetic */ float B1m(float f, float f2, float f3) {
        return CDc(f, f2, f3, AzQ(f, f2, f3));
    }

    public final float CDc(float f, float f2, float f3, long j) {
        long A06 = C229632nm.A06(j - this.A00, 0, this.A01);
        if (A06 < 0) {
            return 0.0f;
        }
        float f4 = f3;
        if (A06 == 0) {
            return f3;
        }
        return (CDR(f, f2, f3, A06) - CDR(f, f2, f4, A06 - 1000000)) * 1000.0f;
    }

    public final long AzQ(float f, float f2, float f3) {
        return ((long) (this.A02 + this.A03)) * 1000000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1 > 1.0f) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float CDR(float r9, float r10, float r11, long r12) {
        /*
            r8 = this;
            long r0 = r8.A00
            long r2 = r12 - r0
            long r6 = r8.A01
            r4 = 0
            long r2 = X.C229632nm.A06(r2, r4, r6)
            int r0 = r8.A03
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x002d
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0014:
            X.JNL r2 = r8.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0028
            r1 = 0
        L_0x001c:
            r4 = r1
        L_0x001d:
            float r1 = r2.FHc(r4)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r9 = r9 * r0
            float r10 = r10 * r1
            float r9 = r9 + r10
            return r9
        L_0x0028:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            goto L_0x001d
        L_0x002d:
            float r1 = (float) r2
            float r0 = (float) r6
            float r1 = r1 / r0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21079XDs.CDR(float, float, float, long):float");
    }

    public final /* bridge */ /* synthetic */ C3026164i FMw(C287805an r3) {
        return new AnonymousClass64n(new C21078XDr(this));
    }

    public C21079XDs(JNL jnl, int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = jnl;
        this.A01 = ((long) i) * 1000000;
        this.A00 = ((long) i2) * 1000000;
    }

    public C21079XDs() {
        this(C52518GVv.A01, 300, 0);
    }
}
