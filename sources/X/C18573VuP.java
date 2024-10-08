package X;

/* renamed from: X.VuP  reason: case insensitive filesystem */
public final class C18573VuP {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;

    public static void A00(C18573VuP vuP) {
        vuP.A05 = 0.0f;
        vuP.A06 = 0.0f;
        vuP.A02 = 0.0f;
        vuP.A03 = 1.0f;
        vuP.A04 = 1.0f;
        vuP.A00 = 0.0f;
        vuP.A01 = 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r6.A04 != 1.0f) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.graphics.Canvas r7) {
        /*
            r6 = this;
            float r0 = r6.A03
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x000f
            float r0 = r6.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r5 = 0
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r5 = 1
        L_0x0010:
            float r0 = r6.A02
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r3 = r0 ^ 1
            float r0 = r6.A00
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            float r0 = r6.A01
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            if (r3 != 0) goto L_0x002b
            if (r5 == 0) goto L_0x0063
        L_0x002b:
            r2 = 1
        L_0x002c:
            float r1 = r6.A05
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x005d
            float r0 = r6.A06
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x005d
        L_0x0038:
            if (r2 == 0) goto L_0x0041
            float r1 = r6.A00
            float r0 = r6.A01
            r7.translate(r1, r0)
        L_0x0041:
            if (r3 == 0) goto L_0x0048
            float r0 = r6.A02
            r7.rotate(r0)
        L_0x0048:
            if (r5 == 0) goto L_0x0051
            float r1 = r6.A03
            float r0 = r6.A04
            r7.scale(r1, r0)
        L_0x0051:
            if (r2 == 0) goto L_0x005c
            float r0 = r6.A00
            float r1 = -r0
            float r0 = r6.A01
            float r0 = -r0
            r7.translate(r1, r0)
        L_0x005c:
            return
        L_0x005d:
            float r0 = r6.A06
            r7.translate(r1, r0)
            goto L_0x0038
        L_0x0063:
            r2 = 0
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18573VuP.A01(android.graphics.Canvas):void");
    }

    public C18573VuP() {
        A00(this);
    }
}
