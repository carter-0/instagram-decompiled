package X;

/* renamed from: X.VyV  reason: case insensitive filesystem */
public final class C18704VyV {
    public static final C18704VyV A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x015a, code lost:
        if (r20.getLineEnd(r20.getLineCount() - 1) != r10.length()) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x017c, code lost:
        if (r14 <= 0.0f) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017f, code lost:
        if (r3 != false) goto L_0x0181;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0245  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C17414VUt A00(android.graphics.RectF r38, android.text.Spannable r39, android.text.TextPaint r40, X.C244943c0 r41, X.AnonymousClass6TT r42, X.AnonymousClass6OW r43, X.C18704VyV r44, int r45, int r46, int r47, int r48, int r49) {
        /*
            r19 = r47
            r18 = r48
            int r0 = r48 - r47
            r31 = r49
            int r0 = r0 / r49
            int r0 = r0 / 2
            int r0 = r0 * r49
            int r8 = r47 + r0
            r9 = r43
            int r0 = r9.A06
            r21 = r0
            float r12 = (float) r8
            r23 = r41
            r0 = r23
            android.content.Context r0 = r0.A04
            r17 = r0
            android.util.DisplayMetrics r1 = X.AnonymousClass7TF.A0E(r17)
            r0 = r21
            float r0 = android.util.TypedValue.applyDimension(r0, r12, r1)
            int r2 = (int) r0
            r11 = 1
            android.text.style.AbsoluteSizeSpan r7 = new android.text.style.AbsoluteSizeSpan
            r7.<init>(r8, r11)
            r10 = r39
            int r0 = r10.length()
            r6 = 0
            r10.setSpan(r7, r6, r0, r6)
            X.6OV r1 = r9.A0A
            java.lang.Float r0 = r1.A03
            if (r0 == 0) goto L_0x0238
            float r5 = r0.floatValue()
        L_0x0044:
            r27 = r45
            r36 = r27
            java.lang.Integer r4 = r9.A0C
            if (r4 == 0) goto L_0x0062
            int r0 = android.view.View.MeasureSpec.getSize(r27)
            float r3 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r5
            float r3 = r3 - r0
            int r0 = (int) r3
            int r3 = android.view.View.MeasureSpec.getSize(r0)
            int r0 = X.AnonymousClass3XX.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r36 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
        L_0x0062:
            r28 = r46
            if (r4 != 0) goto L_0x0208
            r37 = r28
        L_0x0068:
            X.90O r0 = r9.A09
            r24 = r42
            r32 = r23
            r33 = r24
            r34 = r0
            r35 = r10
            X.6Tc r0 = X.C308176Ta.A02(r32, r33, r34, r35, r36, r37)
            java.lang.Object r14 = r0.A02
            X.6Tb r14 = (X.C308186Tb) r14
            if (r14 == 0) goto L_0x0277
            android.text.Layout r0 = r14.A02
            int r0 = r0.getLineCount()
            int r13 = r9.A02
            int r1 = java.lang.Math.min(r0, r13)
            r4 = 1
            int r1 = r1 - r11
            if (r1 <= 0) goto L_0x0205
            android.text.Layout r0 = r14.A02
            int r2 = r0.getLineStart(r1)
            android.text.Layout r0 = r14.A02
            int r1 = r0.getLineEnd(r1)
            if (r2 > r1) goto L_0x0205
            int r0 = r10.length()
            if (r2 >= r0) goto L_0x0205
            java.lang.String r0 = X.C13988Tno.A0c(r10, r2, r1)
            java.lang.String r1 = X.DbV.A12(r0)
            java.lang.String r0 = "\\s+"
            java.util.List r0 = X.DbW.A0o(r1, r0)
            int r0 = r0.size()
            if (r0 != r11) goto L_0x0205
        L_0x00b6:
            boolean r3 = r9.A0E
            r2 = 0
            if (r3 == 0) goto L_0x00ee
            java.lang.CharSequence r1 = X.00l.A0B(r10)
            java.lang.String r0 = "\\s+"
            java.util.List r0 = X.DbW.A0o(r1, r0)
            java.util.Iterator r16 = r0.iterator()
            r1 = 0
        L_0x00ca:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r16.next()
            java.lang.String r0 = (java.lang.String) r0
            int r1 = X.00l.A08(r10, r0, r1, r6)
            int r0 = r0.length()
            int r0 = r0 + r1
            android.text.Layout r15 = r14.A02
            int r15 = r15.getLineForOffset(r1)
            android.text.Layout r1 = r14.A02
            int r1 = r1.getLineForOffset(r0)
            if (r15 == r1) goto L_0x0201
            r2 = 1
        L_0x00ee:
            android.text.Layout r0 = r14.A02
            r20 = r0
            r0 = r40
            r0.reset()
            android.text.TextPaint r1 = r20.getPaint()
            r0.set(r1)
            android.util.DisplayMetrics r14 = X.AnonymousClass7TF.A0E(r17)
            r1 = r21
            float r1 = android.util.TypedValue.applyDimension(r1, r12, r14)
            int r1 = (int) r1
            float r1 = (float) r1
            r0.setTextSize(r1)
            android.text.Layout$Alignment r15 = r20.getAlignment()
            X.0qQ.A07(r15)
            r1 = r38
            float r12 = r1.right
            int r14 = X.AnonymousClass1GB.A01(r12)
            r17 = r13
            int r12 = r10.length()
            android.text.StaticLayout$Builder r16 = android.text.StaticLayout.Builder.obtain(r10, r6, r12, r0, r14)
            X.0qQ.A07(r16)
            r12 = r16
            android.text.StaticLayout$Builder r15 = r12.setAlignment(r15)
            r14 = -1
            if (r13 != r14) goto L_0x0135
            r17 = 2147483647(0x7fffffff, float:NaN)
        L_0x0135:
            r12 = r17
            r15.setMaxLines(r12)
            android.text.StaticLayout r12 = r16.build()
            X.0qQ.A07(r12)
            r26 = r44
            if (r13 == r14) goto L_0x016c
            int r14 = r20.getLineCount()
            if (r14 > r13) goto L_0x015c
            int r13 = r20.getLineCount()
            int r13 = r13 - r11
            r11 = r20
            int r13 = r11.getLineEnd(r13)
            int r11 = r10.length()
            if (r13 == r11) goto L_0x016c
        L_0x015c:
            r10.removeSpan(r7)
            r5 = r18
            r3 = r19
            if (r5 > r3) goto L_0x0245
            r0 = -1
            X.VUt r3 = new X.VUt
            r3.<init>(r0, r4, r2)
        L_0x016b:
            return r3
        L_0x016c:
            int r11 = r12.getHeight()
            float r11 = (float) r11
            float r14 = r1.bottom
            r13 = 0
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x017f
            if (r3 == 0) goto L_0x015c
            int r3 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x0181
            goto L_0x015c
        L_0x017f:
            if (r3 == 0) goto L_0x0185
        L_0x0181:
            r3 = 1073741824(0x40000000, float:2.0)
            float r13 = r5 * r3
        L_0x0185:
            int r3 = r12.getLineCount()
            X.2HY r5 = X.C229632nm.A0C(r6, r3)
            boolean r3 = r5 instanceof java.util.Collection
            if (r3 == 0) goto L_0x01ab
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01ab
        L_0x019a:
            if (r2 != 0) goto L_0x015c
            r10.removeSpan(r7)
            r5 = r18
            r3 = r19
            if (r5 > r3) goto L_0x01c8
            X.VUt r3 = new X.VUt
            r3.<init>(r8, r4, r2)
            return r3
        L_0x01ab:
            java.util.Iterator r11 = r5.iterator()
        L_0x01af:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x019a
            r3 = r11
            X.0sh r3 = (X.0sh) r3
            int r3 = r3.A00()
            float r5 = r12.getLineWidth(r3)
            float r3 = r1.right
            float r3 = r3 - r13
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x01af
            goto L_0x015c
        L_0x01c8:
            if (r4 == 0) goto L_0x01e3
            int r30 = r8 - r49
            r20 = r1
            r21 = r10
            r22 = r0
            r25 = r9
            r29 = r3
            X.VUt r3 = A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r2 = r3.A02
            if (r2 != 0) goto L_0x0258
            boolean r2 = r3.A01
            if (r2 != 0) goto L_0x0258
            return r3
        L_0x01e3:
            int r29 = r8 + r49
            r20 = r1
            r21 = r10
            r22 = r0
            r25 = r9
            r30 = r5
            X.VUt r3 = A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            int r0 = r3.A00
            if (r0 < r8) goto L_0x01fb
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x016b
        L_0x01fb:
            X.VUt r3 = new X.VUt
            r3.<init>(r8, r6, r2)
            return r3
        L_0x0201:
            int r1 = r0 + 1
            goto L_0x00ca
        L_0x0205:
            r4 = 0
            goto L_0x00b6
        L_0x0208:
            java.lang.Float r0 = r1.A04
            if (r0 == 0) goto L_0x0233
            float r3 = r0.floatValue()
        L_0x0210:
            java.lang.Float r0 = r1.A02
            if (r0 == 0) goto L_0x022e
            float r2 = r0.floatValue()
        L_0x0218:
            int r0 = android.view.View.MeasureSpec.getSize(r28)
            float r0 = (float) r0
            float r0 = r0 - r3
            float r0 = r0 - r2
            int r0 = (int) r0
            int r1 = android.view.View.MeasureSpec.getSize(r0)
            int r0 = X.AnonymousClass3XX.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r37 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            goto L_0x0068
        L_0x022e:
            float r2 = (float) r2
            float r0 = r1.A01
            float r2 = r2 * r0
            goto L_0x0218
        L_0x0233:
            float r3 = (float) r2
            float r0 = r1.A01
            float r3 = r3 * r0
            goto L_0x0210
        L_0x0238:
            java.lang.Integer r0 = r9.A0C
            if (r0 != 0) goto L_0x023f
            r5 = 0
            goto L_0x0044
        L_0x023f:
            float r5 = (float) r2
            float r0 = r1.A00
            float r5 = r5 * r0
            goto L_0x0044
        L_0x0245:
            int r8 = r8 - r49
            r20 = r1
            r21 = r10
            r22 = r0
            r25 = r9
            r29 = r3
            r30 = r8
            X.VUt r3 = A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r3
        L_0x0258:
            int r8 = r8 + r49
            r19 = r1
            r20 = r10
            r21 = r0
            r22 = r23
            r23 = r24
            r24 = r9
            r25 = r26
            r26 = r27
            r27 = r28
            r28 = r8
            r29 = r5
            r30 = r31
            X.VUt r3 = A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r3
        L_0x0277:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18704VyV.A00(android.graphics.RectF, android.text.Spannable, android.text.TextPaint, X.3c0, X.6TT, X.6OW, X.VyV, int, int, int, int, int):X.VUt");
    }
}
