package X;

import com.facebook.proxygen.SamplePolicy;

/* renamed from: X.Sou  reason: case insensitive filesystem */
public final class C12202Sou implements SamplePolicy {
    public static int A02 = 10000;
    public boolean A00;
    public boolean A01;

    public final boolean isSampled() {
        if (this.A01 || this.A00 || AnonymousClass20W.A02()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (java.lang.Math.random() >= (1.0d / ((double) r11))) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12202Sou(int r11) {
        /*
            r10 = this;
            r10.<init>()
            A02 = r11
            r7 = 1
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r11 == 0) goto L_0x0016
            double r5 = java.lang.Math.random()
            double r3 = (double) r11
            double r1 = r8 / r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r1 = 1
            if (r0 < 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r10.A01 = r1
            double r2 = java.lang.Math.random()
            r0 = 4662219572839972864(0x40b3880000000000, double:5000.0)
            double r8 = r8 / r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            r7 = 0
        L_0x0028:
            r10.A00 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12202Sou.<init>(int):void");
    }
}
