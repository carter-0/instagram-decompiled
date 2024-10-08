package X;

/* renamed from: X.Vzz  reason: case insensitive filesystem */
public final class C18764Vzz {
    public static final int[] A04 = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, C249703kE.FLAG_MOVED};
    public int A00;
    public boolean A01;
    public final float A02;
    public final float[] A03;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        if (r0 == 3) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        if ((r3 & r2[8]) != 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A00(int r6) {
        /*
            r5 = this;
            r0 = 4
            if (r6 == r0) goto L_0x0034
            r0 = 5
            if (r6 == r0) goto L_0x0034
            switch(r6) {
                case 9: goto L_0x0034;
                case 10: goto L_0x0034;
                case 11: goto L_0x0034;
                default: goto L_0x0009;
            }
        L_0x0009:
            float r4 = r5.A02
        L_0x000b:
            int r3 = r5.A00
            if (r3 == 0) goto L_0x0037
            int[] r2 = A04
            r0 = r2[r6]
            r0 = r0 & r3
            if (r0 != 0) goto L_0x002f
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0037
            r0 = 1
            if (r6 == r0) goto L_0x0022
            r1 = 3
            r0 = r6
            r6 = 6
            if (r0 != r1) goto L_0x0023
        L_0x0022:
            r6 = 7
        L_0x0023:
            r0 = r2[r6]
            r0 = r0 & r3
            if (r0 != 0) goto L_0x002f
            r6 = 8
            r0 = r2[r6]
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0037
        L_0x002f:
            float[] r0 = r5.A03
            r0 = r0[r6]
            return r0
        L_0x0034:
            r4 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x000b
        L_0x0037:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18764Vzz.A00(int):float");
    }

    public final void A01(float f, int i) {
        float[] fArr = this.A03;
        boolean z = false;
        if (!C18099VlT.A00(fArr[i], f)) {
            fArr[i] = f;
            boolean A002 = C244163ak.A00(f);
            int i2 = this.A00;
            int[] iArr = A04;
            int i3 = iArr[i];
            int i4 = i3 | i2;
            if (A002) {
                i4 = (i3 ^ -1) & i2;
            }
            this.A00 = i4;
            if (!((iArr[8] & i4) == 0 && (iArr[7] & i4) == 0 && (iArr[6] & i4) == 0 && (i4 & iArr[9]) == 0)) {
                z = true;
            }
            this.A01 = z;
        }
    }

    public C18764Vzz(float f) {
        float[] A002 = C18102VlW.A00();
        this.A02 = f;
        this.A03 = A002;
    }

    public C18764Vzz() {
        float[] A002 = C18102VlW.A00();
        this.A02 = 0.0f;
        this.A03 = A002;
    }
}
