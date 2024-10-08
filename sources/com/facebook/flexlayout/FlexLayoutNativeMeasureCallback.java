package com.facebook.flexlayout;

public abstract class FlexLayoutNativeMeasureCallback {
    public final float baselineNative(int i, float f, float f2) {
        throw new RuntimeException("Baseline function isn't defined!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b6, code lost:
        if (java.lang.Float.isNaN(r9) == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (java.lang.Float.isNaN(r9) == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r9.A04 == 13320) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.flexlayout.layoutoutput.MeasureOutput measureNative(int r18, float r19, float r20, float r21, float r22, float r23, float r24) {
        /*
            r17 = this;
            r7 = r19
            r4 = r22
            r5 = r21
            r6 = r20
            r3 = r17
            X.6TL r3 = (X.AnonymousClass6TL) r3
            X.6TF[] r0 = r3.A01
            r0 = r0[r18]
            X.6TH r2 = r0.A00
            X.2TS r1 = r2.A01
            boolean r0 = r1 instanceof X.C276544tV
            if (r0 == 0) goto L_0x0139
            r9 = r1
            X.4tV r9 = (X.C276544tV) r9
            int r8 = r9.A04
            r0 = 13320(0x3408, float:1.8665E-41)
            if (r8 != r0) goto L_0x0139
        L_0x0021:
            r16 = 1
            r15 = 0
            r0 = 0
            if (r9 == 0) goto L_0x0028
            r0 = 1
        L_0x0028:
            X.4tV r9 = X.AnonymousClass6T2.A02(r1)
            r8 = 0
            if (r0 != 0) goto L_0x0079
            if (r9 == 0) goto L_0x0079
            r0 = 61
            float r14 = X.AnonymousClass6T2.A01(r9, r0)
            r0 = 57
            float r13 = X.AnonymousClass6T2.A01(r9, r0)
            r0 = 58
            float r12 = X.AnonymousClass6T2.A01(r9, r0)
            r0 = 55
            float r11 = X.AnonymousClass6T2.A01(r9, r0)
            r0 = 59
            float r10 = X.AnonymousClass6T2.A01(r9, r0)
            r0 = 56
            float r9 = X.AnonymousClass6T2.A01(r9, r0)
            boolean r0 = java.lang.Float.isNaN(r14)
            if (r0 == 0) goto L_0x0124
            boolean r0 = java.lang.Float.isNaN(r13)
            if (r0 == 0) goto L_0x0124
            boolean r0 = java.lang.Float.isNaN(r12)
            if (r0 == 0) goto L_0x0124
            boolean r0 = java.lang.Float.isNaN(r11)
            if (r0 == 0) goto L_0x0124
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 == 0) goto L_0x0124
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 == 0) goto L_0x0124
        L_0x0079:
            r11 = 2143289344(0x7fc00000, float:NaN)
            if (r8 != 0) goto L_0x00ab
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 == 0) goto L_0x0085
            r6 = r23
        L_0x0085:
            X.3c0 r8 = r2.A00
            int r2 = X.AnonymousClass6TH.A00(r7, r6)
            int r0 = X.AnonymousClass6TH.A00(r5, r4)
            X.2Ta r4 = r1.AEy(r8, r2, r0)
            int r0 = r4.getWidth()
            float r1 = (float) r0
            int r0 = r4.getHeight()
        L_0x009c:
            float r0 = (float) r0
            com.facebook.flexlayout.layoutoutput.MeasureOutput r2 = new com.facebook.flexlayout.layoutoutput.MeasureOutput
            r2.<init>(r1, r0, r11, r4)
            com.facebook.flexlayout.layoutoutput.LayoutOutput r0 = r3.A00
            java.lang.Object[] r1 = r0.measureResults
            java.lang.Object r0 = r2.measureResult
            r1[r18] = r0
            return r2
        L_0x00ab:
            boolean r10 = r2.A02
            if (r10 != 0) goto L_0x011a
            r0 = 5
            r9 = r8[r0]
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 != 0) goto L_0x011a
        L_0x00b8:
            int r12 = java.lang.Math.round(r9)
            if (r10 == 0) goto L_0x010f
            r0 = 5
            r9 = r8[r0]
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 != 0) goto L_0x010f
        L_0x00c7:
            int r0 = java.lang.Math.round(r9)
            int r12 = r12 + r0
            r9 = r8[r15]
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 == 0) goto L_0x00d5
            r9 = 0
        L_0x00d5:
            int r13 = java.lang.Math.round(r9)
            r0 = 3
            r9 = r8[r0]
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 == 0) goto L_0x00e3
            r9 = 0
        L_0x00e3:
            int r0 = java.lang.Math.round(r9)
            int r13 = r13 + r0
            X.3c0 r9 = r2.A00
            float r0 = (float) r12
            float r7 = r19 - r0
            float r6 = r20 - r0
            int r2 = X.AnonymousClass6TH.A00(r7, r6)
            float r0 = (float) r13
            float r5 = r21 - r0
            float r4 = r22 - r0
            int r0 = X.AnonymousClass6TH.A00(r5, r4)
            X.2Ta r0 = r1.AEy(r9, r2, r0)
            X.WJq r4 = new X.WJq
            r4.<init>(r0, r8, r10)
            int r0 = r4.getWidth()
            float r1 = (float) r0
            int r0 = r4.getHeight()
            goto L_0x009c
        L_0x010f:
            r0 = 2
            r9 = r8[r0]
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 == 0) goto L_0x00c7
            r9 = 0
            goto L_0x00c7
        L_0x011a:
            r9 = r8[r16]
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 == 0) goto L_0x00b8
            r9 = 0
            goto L_0x00b8
        L_0x0124:
            r0 = 6
            float[] r8 = new float[r0]
            r8[r15] = r14
            r8[r16] = r13
            r0 = 2
            r8[r0] = r12
            r0 = 3
            r8[r0] = r11
            r0 = 4
            r8[r0] = r10
            r0 = 5
            r8[r0] = r9
            goto L_0x0079
        L_0x0139:
            r9 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flexlayout.FlexLayoutNativeMeasureCallback.measureNative(int, float, float, float, float, float, float):com.facebook.flexlayout.layoutoutput.MeasureOutput");
    }
}
