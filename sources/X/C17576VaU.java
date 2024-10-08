package X;

import android.text.StaticLayout;

/* renamed from: X.VaU  reason: case insensitive filesystem */
public final class C17576VaU {
    public final float A00;
    public final StaticLayout A01;
    public final StaticLayout A02;
    public final C306576Mr A03;
    public final AnonymousClass91R[] A04;
    public final boolean A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r4 == X.C306576Mr.INVERTED_OUTLINED) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17576VaU(android.text.Layout.Alignment r25, android.text.Spannable r26, android.text.TextPaint r27, X.0rN r28, float r29, int r30, int r31) {
        /*
            r24 = this;
            r0 = 1
            r3 = r26
            X.0qQ.A0B(r3, r0)
            r5 = r24
            r5.<init>()
            r0 = r29
            r5.A00 = r0
            r2 = r30
            r1 = r31
            X.6Mr r4 = X.C358948bj.A00(r3, r2, r1)
            r5.A03 = r4
            X.6Mr r7 = X.C306576Mr.OUTLINED
            if (r4 == r7) goto L_0x0022
            X.6Mr r0 = X.C306576Mr.INVERTED_OUTLINED
            r8 = 0
            if (r4 != r0) goto L_0x0023
        L_0x0022:
            r8 = 1
        L_0x0023:
            r5.A05 = r8
            r4 = 0
            if (r8 == 0) goto L_0x00b4
            java.lang.Class<X.91R> r0 = X.AnonymousClass91R.class
            java.lang.Object[] r0 = r3.getSpans(r2, r1, r0)
            X.91R[] r0 = (X.AnonymousClass91R[]) r0
        L_0x0030:
            r5.A04 = r0
            java.lang.CharSequence r10 = r3.subSequence(r2, r1)
            r6 = r28
            int r12 = r6.A00
            float r14 = r6.A02
            float r15 = r6.A01
            r16 = 0
            android.text.StaticLayout r9 = new android.text.StaticLayout
            r13 = r25
            r11 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.A01 = r9
            if (r8 == 0) goto L_0x0093
            java.lang.CharSequence r17 = r3.subSequence(r2, r1)
            android.text.TextPaint r8 = new android.text.TextPaint
            r8.<init>()
            X.91R[] r9 = r5.A04
            if (r9 == 0) goto L_0x007e
            r8.set(r11)
            float r4 = r11.getTextSize()
            r0 = r9[r16]
            X.8bh r0 = r0.A09
            float r0 = r0.A02
            float r4 = r4 * r0
            r8.setStrokeWidth(r4)
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            r8.setStrokeJoin(r0)
            X.6Mr r4 = r5.A03
            r0 = r9[r16]
            if (r4 != r7) goto L_0x00b1
            int r0 = r0.A02
        L_0x0078:
            r8.setColor(r0)
            X.JTO.A1N(r8)
        L_0x007e:
            int r0 = r6.A00
            android.text.StaticLayout r4 = new android.text.StaticLayout
            r20 = r13
            r21 = r14
            r22 = r15
            r23 = r16
            r18 = r8
            r19 = r0
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
        L_0x0093:
            r5.A02 = r4
            java.lang.Class<X.8bZ> r0 = X.C358848bZ.class
            java.lang.Object[] r4 = r3.getSpans(r2, r1, r0)
            int r3 = r4.length
            r2 = 0
        L_0x009d:
            if (r2 >= r3) goto L_0x00b7
            r1 = r4[r2]
            X.8bZ r1 = (X.C358848bZ) r1
            boolean r0 = r5.A05
            r0 = r0 ^ 1
            r1.A04 = r0
            int r0 = r1.A05
            r11.setColor(r0)
            int r2 = r2 + 1
            goto L_0x009d
        L_0x00b1:
            int r0 = r0.A01
            goto L_0x0078
        L_0x00b4:
            r0 = r4
            goto L_0x0030
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17576VaU.<init>(android.text.Layout$Alignment, android.text.Spannable, android.text.TextPaint, X.0rN, float, int, int):void");
    }
}
