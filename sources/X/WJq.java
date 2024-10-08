package X;

public final class WJq implements AnonymousClass2Ta {
    public final AnonymousClass2Ta A00;
    public final boolean A01;
    public final float[] A02;

    public final AnonymousClass2Ta AnD(int i) {
        return this.A00.AnD(i);
    }

    public final int AnO() {
        return this.A00.AnO();
    }

    public final Object BLp() {
        return this.A00.BLp();
    }

    public final int Ba8() {
        return this.A00.Ba8();
    }

    public final int Ba9() {
        return this.A00.Ba9();
    }

    public final int BaB() {
        return this.A00.BaB();
    }

    public final int BaC() {
        return this.A00.BaC();
    }

    public final 2Th Blo() {
        return this.A00.Blo();
    }

    public final int CGw(int i) {
        return this.A00.CGw(i);
    }

    public final int CHT(int i) {
        return this.A00.CHT(i);
    }

    public final int getHeight() {
        int height = this.A00.getHeight();
        float[] fArr = this.A02;
        float f = fArr[0];
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        int round = height + Math.round(f);
        float f2 = fArr[3];
        if (Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        return round + Math.round(f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getWidth() {
        /*
            r5 = this;
            X.2Ta r0 = r5.A00
            int r4 = r0.getWidth()
            float[] r3 = r5.A02
            boolean r2 = r5.A01
            if (r2 != 0) goto L_0x0036
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x0036
        L_0x0015:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            if (r2 == 0) goto L_0x002b
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x002b
        L_0x0025:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            return r4
        L_0x002b:
            r0 = 2
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x0025
            r1 = 0
            goto L_0x0025
        L_0x0036:
            r0 = 1
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x0015
            r1 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WJq.getWidth():int");
    }

    public WJq(AnonymousClass2Ta r1, float[] fArr, boolean z) {
        this.A00 = r1;
        this.A02 = fArr;
        this.A01 = z;
    }
}
