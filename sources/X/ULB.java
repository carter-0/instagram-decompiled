package X;

public final class ULB extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ULB) {
                ULB ulb = (ULB) obj;
                if (!(this.A03 == ulb.A03 && this.A02 == ulb.A02 && Float.compare(this.A01, ulb.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A03 * 31) + this.A02) * 31) + Float.floatToIntBits(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r5 <= 0.0f) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ULB(int r3, int r4, float r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.A03 = r3
            r2.A02 = r4
            r2.A01 = r5
            if (r3 <= 0) goto L_0x0013
            if (r4 <= 0) goto L_0x0013
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2.A04 = r0
            if (r0 != 0) goto L_0x001d
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x001a:
            r2.A00 = r1
            return
        L_0x001d:
            float r1 = (float) r3
            float r1 = r1 * r5
            float r0 = (float) r4
            float r1 = r1 / r0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ULB.<init>(int, int, float):void");
    }

    public ULB() {
        this(0, 0, 0.0f);
    }
}
